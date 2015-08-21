#include <iostream>
#include <vector>
#include <opencv2/core.hpp>
#include <opencv2/imgproc.hpp>
#include <opencv2/features2d.hpp>
#include <opencv2/highgui.hpp>

//CUDA
#include <opencv2/core/cuda.hpp>
#include <opencv2/cudaarithm.hpp>

using namespace cv;
using namespace cv::cuda;

void drawMarkerToMat(Mat marker, int x, int y, int outer, int ring, int inner) {
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

bool isMarkerNear(std::vector<Point2f> points, Point2f loc, double e) {
    for (int i = 0; i < points.size(); ++i) {
        double distance = cv::norm(loc - points[i]);
        
        if (distance <= e) {
            return true;
        }
    }
    
    return false;
}

bool findMarker(std::vector<Point2f>& points, double min, double max, Mat contourColor, int innerMarkers, Point2f& center) {
    if (points.size() < (2 + innerMarkers))
        return false;
    
    for (int first = 0; first < points.size() - 1; ++first) {
        for (int last = first + 1; last < points.size(); ++last) {
            if (first == last)
                continue;
            
            double distance = cv::norm(points[first] - points[last]);
            if (min < distance && distance < max) {
                Point2f dirVector = (points[last] - points[first]) / (innerMarkers + 1);
                
                bool innerMarkersFound = true;
                for (int div = 1; div <= innerMarkers; ++div) {
                    Point2f pos = points[first] + (div * dirVector);
                    
                    if (!isMarkerNear(points, pos, 5)) {
                        innerMarkersFound = false;
                        break;
                    }
                }
                
                if (innerMarkersFound) {
                    line(contourColor, points[first], points[last], Scalar(255, 0, 0));
                    center = (points[last] - points[first]) / 2;
                    
                    return true;
                }
            }
        }
    }
    
    return false;
}

int main(int argc, char** argv)
{
    VideoCapture vid(1);
    Size vidsize(vid.get(CV_CAP_PROP_FRAME_WIDTH), vid.get(CV_CAP_PROP_FRAME_HEIGHT));
    //Size vidsize = imread("train.png").size();
    
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
    
    
    GpuMat circleSpectrumGPU = createCirclePattern(vidsize, 10, 8, 4);
    
    Mat raw;
    Mat gray;
    Mat planes[2];
    Mat merged;
    
    GpuMat mergedGPU;
    GpuMat imageSpectrumGPU;
    GpuMat magnitudeGPU;
    
    Mat magnitude;
    Mat contour;
    Mat contourColor;
    
    while (true) {
        vid >> raw;
        cv::cvtColor(raw, gray, CV_RGB2GRAY);
        
        planes[0] = Mat_<float>(gray);
        planes[1] = Mat::zeros(raw.size(), CV_32F);
        cv::merge(planes, 2, merged);
        
        mergedGPU.upload(merged);
        cuda::dft(mergedGPU, imageSpectrumGPU, mergedGPU.size());
        cuda::mulSpectrums(imageSpectrumGPU, circleSpectrumGPU, imageSpectrumGPU, 0);
        cuda::dft(imageSpectrumGPU, imageSpectrumGPU, imageSpectrumGPU.size(), DFT_INVERSE);
        
        cuda::magnitude(imageSpectrumGPU, magnitudeGPU);
        cuda::normalize(magnitudeGPU, magnitudeGPU, 0, 1, NORM_MINMAX, CV_32F);
        //cuda::subtract(Scalar::all(1), magnitudeGPU, magnitudeGPU);
        cuda::threshold(magnitudeGPU, magnitudeGPU, 0.8, 1, CV_THRESH_BINARY);
        
        magnitudeGPU.download(magnitude);
        magnitude.convertTo(magnitude, CV_8U, 255);
        
        std::vector<std::vector<Point> > contours;
        std::vector<Vec4i> hierarchy;
        findContours(magnitude, contours, hierarchy, CV_RETR_TREE, CV_CHAIN_APPROX_SIMPLE, Point(0, 0) );
        
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
        
        Mat magnitudeColor;
        magnitude.convertTo(magnitudeColor, CV_8U, 255);
        cv::cvtColor(magnitudeColor, magnitudeColor, CV_GRAY2RGB);
        
        Point2f center;
        findMarker(mc, 90, 100, magnitudeColor, 2, center);
        
        imshow("1", magnitudeColor);
        waitKey(40);
    }
    
    return 0;
}