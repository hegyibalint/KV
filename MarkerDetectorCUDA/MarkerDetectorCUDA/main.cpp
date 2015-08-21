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

bool isMarkerNear(std::vector<Point2f> points, Point2f loc, double e, int& index) {
    for (int i = 0; i < points.size(); ++i) {
        double distance = cv::norm(loc - points[i]);
        
        if (distance <= e) {
            index = i;
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
                std::vector<int> deletionVector = { first, last };
                Point2f dirVector = (points[last] - points[first]) / (innerMarkers + 1);
                
                for (int div = 1; div <= innerMarkers; ++div) {
                    Point2f pos = points[first] + (div * dirVector);
                    
                    int deletionIndex;
                    if (isMarkerNear(points, pos, 10, deletionIndex)) {
                        deletionVector.push_back(deletionIndex);
                    } else {
                        goto markerNotFound;
                    }
                }
                
                line(contourColor, points[first], points[last], Scalar(255, 0, 0));
                center =(points[last] - points[first]) / 2;
                
                std::sort(deletionVector.begin(), deletionVector.end());
                for (int i = 0; i < deletionVector.size(); ++i) {
                    points.erase(points.begin() + (deletionVector[i] - i));
                }
                return true;
                
                markerNotFound:
                continue;
            }
        }
    }
    
    return false;
}

int main(int argc, char** argv)
{
    VideoCapture vid(1);
    Size vidsize(vid.get(CV_CAP_PROP_FRAME_WIDTH), vid.get(CV_CAP_PROP_FRAME_HEIGHT));
    
    
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
        cuda::subtract(Scalar::all(1), magnitudeGPU, magnitudeGPU);
        
        magnitudeGPU.download(magnitude);
        
        std::vector<std::vector<Point>> contours;
        std::vector<Vec4i> hierarchy;
        magnitude.convertTo(contour, CV_8U, 255);
        cvtColor(contour, contourColor, CV_GRAY2RGB);
        
        std::vector<KeyPoint> keypoints;
        detector->detect(contour, keypoints);
        
        std::vector<Point2f> selected;
        for(auto& kp : keypoints) {
            selected.push_back(kp.pt);
        }
        
        Point2f center;
        while(findMarker(selected, 0, 1000, contourColor, 2, center)) {
            std::cout << center << std::endl;
        }
        
        for(auto& kp : keypoints) {
            cv::circle(contourColor, kp.pt, 4, Scalar(0, 0, 255));
        }
        for(auto& pt : selected) {
            cv::circle(contourColor, pt, 4, Scalar(0, 255, 0));
        }
        
        //imshow("1", contourColor);
        //waitKey(20);
    }
    
    return 0;
}