#include <iostream>
#include <vector>
#include <chrono>

// OpenCV
#include <opencv2/core.hpp>
#include <opencv2/imgproc.hpp>
#include <opencv2/features2d.hpp>
#include <opencv2/highgui.hpp>

// OpenCV - CUDA
#include <opencv2/core/cuda.hpp>
#include <opencv2/cudaarithm.hpp>
#include <opencv2/cudafilters.hpp>

using namespace cv;
using namespace cv::cuda;


const int CMYK_DEVIATION = 55;

const int CYAN = 210;
const int CYAN_LOW = CYAN - CMYK_DEVIATION;
const int CYAN_HIGH = CYAN + CMYK_DEVIATION;

const int MAGENTA = 326;
const int MAGENTA_LOW = MAGENTA - CMYK_DEVIATION;
const int MAGENTA_HIGH = MAGENTA + CMYK_DEVIATION;

const int YELLOW = 100;
const int YELLOW_LOW = YELLOW - CMYK_DEVIATION;
const int YELLOW_HIGH = YELLOW + CMYK_DEVIATION;

const int MARKER_C = 0;
const int MARKER_M = 1;
const int MARKER_Y = 2;
const int MARKER_UNKNOWN = 3;


void drawMarkerToMat(Mat& marker, int x, int y, int outer, int ring, int inner) {
    circle(marker, Point(x, y), outer, Scalar(1.0), -1);
    circle(marker, Point(x, y), ring, Scalar(-1.0), -1);
    circle(marker, Point(x, y), inner, Scalar(1.0), -1);
}

GpuMat createCirclePattern(Size vidsize, int outer, int ring, int inner) {
    Mat circle = Mat::zeros(Size_<int>(vidsize), CV_32F);
    drawMarkerToMat(circle, 0, 0, outer, ring, inner);
    drawMarkerToMat(circle, 0, vidsize.height, outer, ring, inner);
    drawMarkerToMat(circle, vidsize.width, 0, outer, ring, inner);
    drawMarkerToMat(circle, vidsize.width, vidsize.height, outer, ring, inner);
    
    cv::GaussianBlur(circle, circle, Size(3, 3), 2);
    Mat planes[2] = {
        Mat_<float>(circle),
        Mat::zeros(circle.size(), CV_32F)
    };
    
    Mat merged;
    cv::merge(planes, 2, merged);
    
    GpuMat mergedGPU(merged);
    
    GpuMat circleSpectrum;
    cuda::dft(merged, circleSpectrum, merged.size());
    
    return circleSpectrum;
}

bool isMarkerNear(std::vector<Point2f> points, Point2f loc, double e, std::vector<int>& deletionVector) {
    for (int i = 0; i < points.size(); ++i) {
        double distance = cv::norm(loc - points[i]);
        
        if (distance <= e) {
            deletionVector.push_back(i);
            return true;
        }
    }
    
    return false;
}

std::tuple<bool, Point2f, Point2f> findMarker(std::vector<Point2f>& points, double min, double max) {
    if (points.size() < 4)
        return false;
    
    for (int first = 0; first < points.size() - 1; ++first) {
        for (int last = first + 1; last < points.size(); ++last) {
            
            double distance = cv::norm(points[first] - points[last]);
            if (min < distance && distance < max) {
                Point2f dirVector = (points[last] - points[first]) / 4;
                std::vector<int> deletionVector = { first, last };
                
                bool innerMarkersFound = true;
                for (int div = 1; div <= 3; ++div) {
                    if (div == 2)
                        continue;
                    
                    Point2f pos = points[first] + (div * dirVector);
                    if (!isMarkerNear(points, pos, 5, deletionVector)) {
                        innerMarkersFound = false;
                        break;
                    }
                }
                
                if (innerMarkersFound) {
                    auto result = std::tuple<bool, Point2f, Point2f>(true, points[first], points[last]);
                    
                    std::sort(deletionVector.begin(), deletionVector.end());
                    for (int d = 0; d < deletionVector.size(); ++d) {
                        int position = deletionVector[d] - d;
                        points.erase(points.begin() + position);
                    }
                    
                    return result;
                }
            }
        }
    }
    
    return false;
}

int identifyMarker(Point2f markerCenter, Mat& img) {
    Rect2i roi((markerCenter - Point2f(5, 5)), cv::Size2i(10, 10));
    
    Mat sample;
    cv::cvtColor(img(roi), sample, CV_BGR2HSV);
    cv::rectangle(img, roi, Scalar(0, 0, 255));
    
    float hue = cv::mean(sample)[0] * 2;
    std::cout << hue << std::endl;
    
    if (CYAN_LOW < hue && hue < CYAN_HIGH)
        return MARKER_C;
    if (MAGENTA_LOW < hue && hue < MAGENTA_HIGH)
        return MARKER_M;
    if (YELLOW_LOW < hue && hue < YELLOW_HIGH)
        return MARKER_Y;
    
    return MARKER_UNKNOWN;
}

int main(int argc, char** argv)
{
    FileStorage fs2("camera_data.xml", FileStorage::READ);
    Mat cameraMatrix, distCoeffs;
    fs2["Camera_Matrix"] >> cameraMatrix;
    fs2["Distortion_Coefficients"] >> distCoeffs;
    
    VideoCapture vid(1);
    
    std::cout << static_cast<bool>(vid.get(CV_CAP_PROP_CONVERT_RGB)) << std::endl;
    
    Size vidsize(vid.get(CV_CAP_PROP_FRAME_WIDTH), vid.get(CV_CAP_PROP_FRAME_HEIGHT));
    //Size vidsize = imread("train.png").size();
    Size hvidsize = vidsize / 2;
    
    SimpleBlobDetector::Params detector_params;
    detector_params.minThreshold = 50;
    detector_params.maxThreshold = 120; //120;
    
    detector_params.filterByArea = true;
    detector_params.minArea = 20;
    detector_params.maxArea = 50;
    
    detector_params.filterByCircularity = false;
    detector_params.minCircularity = 0.85;
    detector_params.maxCircularity = 1;
    
    Ptr<SimpleBlobDetector> detector = SimpleBlobDetector::create(detector_params);
    
    GpuMat circleSpectrumGPU = createCirclePattern(vidsize, 11, 8, 3);
    
    Mat raw;
    Mat gray;
    Mat planes[2];
    Mat merged;
    
    GpuMat mergedGPU;
    GpuMat imageSpectrumGPU;
    GpuMat magnitudeGPU;
    
    Mat magnitude;
    Mat contour;
    
    while (true) {
        auto start = std::chrono::high_resolution_clock::now();
        vid >> raw;

        cv::cvtColor(raw, gray, CV_BGR2GRAY);
        cv::equalizeHist(gray, gray);
        
        gray.convertTo(planes[0], CV_32F, 1/255.0);
        planes[1] = Mat::zeros(raw.size(), CV_32F);
        
        cv::merge(planes, 2, merged);
        
        mergedGPU.upload(merged);
        cuda::dft(mergedGPU, imageSpectrumGPU, mergedGPU.size());
        cuda::mulSpectrums(imageSpectrumGPU, circleSpectrumGPU, imageSpectrumGPU, 0);
        cuda::dft(imageSpectrumGPU, imageSpectrumGPU, imageSpectrumGPU.size(), DFT_INVERSE);
        
        cuda::magnitude(imageSpectrumGPU, magnitudeGPU);
        cuda::normalize(magnitudeGPU, magnitudeGPU, 0, 1, NORM_MINMAX, CV_32F);
        cuda::threshold(magnitudeGPU, magnitudeGPU, 0.70, 1, CV_THRESH_BINARY);
        
        magnitudeGPU.download(magnitude);
        magnitude.convertTo(contour, CV_8U, 255);
        
        std::vector<std::vector<Point> > contours;
        std::vector<Vec4i> hierarchy;
        findContours(contour, contours, hierarchy, CV_RETR_EXTERNAL, CV_CHAIN_APPROX_SIMPLE, Point(0, 0) );
        
        std::vector<Moments> mu(contours.size() );
        for( int i = 0; i < contours.size(); i++ )
        { mu[i] = moments( contours[i], false ); }
        
        std::vector<Point2f> mc( contours.size() );
        for( int i = 0; i < contours.size(); i++ )
        {
            Point2f com = Point2f( mu[i].m10/mu[i].m00 , mu[i].m01/mu[i].m00 );
            if (!(isnan(com.x) && isnan(com.y))) {
                mc[i] = com;
            }
        }
        
        while (true) {
            std::tuple<bool, Point2f, Point2f> result = findMarker(mc, 100, 180);
            
            bool found = std::get<0>(result);
            if (!found)
                break;
            
            Point2f start = std::get<1>(result);
            Point2f end = std::get<2>(result);
            Point2f center = (start + end) / 2;
            
            int id = identifyMarker(center, raw);
            
            switch (id) {
                case MARKER_C:
                    std::cout << "CYAN MARKER @ ";
                    break;
                case MARKER_M:
                    std::cout << "MAGENTA MARKER @ ";
                    break;
                case MARKER_Y:
                    std::cout << "YELLOW MARKER @ ";
                    break;
                case MARKER_UNKNOWN:
                    std::cout << "UNKOWN MARKER @ ";
                default:
                    break;
            }
            std::cout << center << std::endl;
            
            cv::line(raw, start, end, Scalar(255, 0, 0));
        }
        
        auto finish = std::chrono::high_resolution_clock::now();
        auto ms = std::chrono::duration_cast<std::chrono::milliseconds>(finish-start);
        std::cout << (1000 / ms.count()) << " fps" << std::endl;
        
        std::cout << "-----------" << std::endl;

        
        cv::resize(raw, raw, hvidsize);
        imshow("1", raw);
        waitKey(40);
    }
    
    return 0;
}