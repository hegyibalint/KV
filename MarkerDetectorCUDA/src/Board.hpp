#pragma once

#include <cmath>
#include <opencv2/opencv.hpp>

#include "Constants.hpp"

using namespace cv;

struct Board {
    Point2f topLeft, topRight, bottomLeft, bottomRight;
    Mat baseTrans;
    Mat inverseTrans;
    
    cv::Mat getPerspectiveMat() {
        cv::Point2f src[4] = {
            topLeft, topRight, bottomRight, bottomLeft
        };
        
        cv::Point2f dst[4] = {
            cv::Point2f(0, 0),
            cv::Point2f(cv::norm(topLeft - topRight), 0),
            cv::Point2f(cv::norm(topLeft - topRight), cv::norm(topRight - bottomRight)),
            cv::Point2f(0, cv::norm(bottomLeft - topLeft))
        };
        
        return cv::getPerspectiveTransform(src, dst);
    }
    
    void calculateBaseMat() {
        Point2f xBase = ((topRight - topLeft) * BOARD_WIDTH) / pow(cv::norm(topRight - topLeft), 2);
        Point2f yBase = ((bottomLeft - topLeft) * BOARD_HEIGHT) / pow(cv::norm(bottomLeft - topLeft), 2);
        
        Mat trans(Size(2, 2), CV_32F);
        trans.at<float>(0, 0) = xBase.x;
        trans.at<float>(0, 1) = xBase.y;
        trans.at<float>(1, 0) = yBase.x;
        trans.at<float>(1, 1) = yBase.y;
        
        this->baseTrans = trans;
        this->inverseTrans = trans.inv();
    }
    
    cv::Rect getBoundingBox() {
        std::vector<cv::Point> points = { topLeft, topRight, bottomLeft, bottomRight };
        return cv::boundingRect(points);
    }
    
    Point2f getCenter() {
        return Point2f(BOARD_WIDTH / 2, BOARD_HEIGHT / 2);
    }
};