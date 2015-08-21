#include <iostream>
#include "opencv2/imgproc.hpp"
#include "opencv2/features2d.hpp"
#include "opencv2/highgui.hpp"

using namespace cv;

void drawMarkerToMat(Mat marker, int x, int y, int outer, int ring, int inner) {
    circle(marker, Point(x, y), outer, Scalar(1.0), -1);
    circle(marker, Point(x, y), ring, Scalar(-1.0), -1);
    circle(marker, Point(x, y), inner, Scalar(1.0), -1);
}

Mat createCirclePattern(Size vidsize, int outer, int ring, int inner) {
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
    
    cv::dft(merged, merged);
    return merged;
}

bool isMarkerNear(std::vector<Point2f> points, Point2f loc, double e) {
    for (int i = 0; i < points.size(); ++i) {
        double distance = cv::norm(loc - points[i]);
        
        if (distance <= e) {
            points.erase(points.begin() + i);
            return true;
        }
    }

    return false;
}

void findMarker(std::vector<Point2f> points, double min, double max, Mat contourColor) {
    for (int i = 0; i < points.size(); ++i) {
        for (int j = 1; j < points.size() - 1; ++j) {
            if (i == j)
                continue;
            
            double distance = cv::norm(points[i] - points[j]);
            if (min < distance && distance < max) {
                
                Point2f thirdV = (points[j] - points[i]) / 3;
                if(isMarkerNear(points, points[i] + 1 * thirdV, 5) && isMarkerNear(points, points[i] + 2 * thirdV, 10)) {
                    line(contourColor, points[i], points[j], Scalar(255, 0, 0));
                    
                    points.erase(points.begin() + i);
                    points.erase(points.begin() + j);
                }
                
                
                /*
                Point2f halfV = (points[j] - points[i]) / 2;
                if(isMarkerNear(points, points[i] + 1 * halfV, 5)) {
                    line(contourColor, points[i], points[j], Scalar(255, 0, 0));
                    
                    points.erase(points.begin() + i);
                    points.erase(points.begin() + j);
                }
                */
            }
        }
    }
}

int main(int argc, char** argv)
{
    //Mat raw(imread("t1.png"));
    
    VideoCapture vid(0);
    Size vidsize(vid.get(CV_CAP_PROP_FRAME_WIDTH), vid.get(CV_CAP_PROP_FRAME_HEIGHT));
    //Size vidsize(raw.cols, raw.rows);
    SimpleBlobDetector::Params detector_params;
    detector_params.minThreshold = 10;
    detector_params.maxThreshold = 150; //120;
    
    detector_params.filterByArea = true;
    detector_params.minArea = 20;
    detector_params.maxArea = 50;
    
    detector_params.filterByCircularity = true;
    detector_params.minCircularity = 0.85;
    detector_params.maxCircularity = 1;
    
    Ptr<SimpleBlobDetector> detector = SimpleBlobDetector::create(detector_params);
    
    Mat cdft = createCirclePattern(vidsize, 11, 8, 4);
    //imshow("cdft", cdft);
    
    Mat raw;
    Mat gray;
    Mat dft;
    Mat idft;
    Mat planes[2];
    Mat mag;
    Mat contour;
    Mat contourColor;
    
    while (true) {
        vid >> raw;
        
        
        cv::cvtColor(raw, gray, CV_RGB2GRAY);

        planes[0] = Mat_<float>(gray);
        planes[1] = Mat::zeros(gray.size(), CV_32F);
        imshow("asdafag", planes[0]);
        
        cv::merge(planes, 2, dft);
        cv::dft(dft, dft);
        cv::mulSpectrums(cdft, dft, dft, 0);
        cv::idft(dft, idft);
        cv::split(idft, planes);
        cv::magnitude(planes[0], planes[1], mag);
        cv::normalize(mag, mag, 0, 1, CV_MINMAX);
        cv::subtract(Scalar::all(1.0), mag, mag);
        
        std::vector<std::vector<Point>> contours;
        std::vector<Vec4i> hierarchy;
        mag.convertTo(contour, CV_8U, 255);
        cvtColor(contour, contourColor, CV_GRAY2RGB);
        
        std::vector<KeyPoint> keypoints;
        detector->detect(contour, keypoints);
        
        std::vector<Point2f> selected;
        for(auto& kp : keypoints) {
            selected.push_back(kp.pt);
        }
        findMarker(selected, 0, 100, contourColor);
        
        cv::drawKeypoints(contourColor, keypoints, contourColor);
        

        //cv::resize(mag, mag, vidsizeh);
        imshow("1", contourColor);
        waitKey(40);
    }
    
    return 0;
}