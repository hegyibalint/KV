#pragma once

#include <cmath>
#include <chrono>
#include <iostream>
#include <opencv2/opencv.hpp>

#include "Board.hpp"
#include "Constants.hpp"

using namespace cv;

struct Position {
    std::chrono::time_point<std::chrono::high_resolution_clock> time;
    Point2f coordinate;
    
    float getSpeed(const Position& newPos) {
        float distance = cv::norm(coordinate - newPos.coordinate);
        float ms = std::chrono::duration_cast<std::chrono::milliseconds>(newPos.time - time).count();
        
        float newSpeed = distance / (ms / 1000);
        if (newSpeed < 0.5) {
            newSpeed = 0.0;
        }
        
        return newSpeed;
    }
    
    int getDir(const Position& newPos) {
        Point2f center = {
            BOARD_WIDTH / 2,
            BOARD_HEIGHT / 2
        };
        
        Point2f centeredOld = center - coordinate;
        Mat oldPosMat(1, 3, CV_32F);
        oldPosMat.at<float>(0, 0) = centeredOld.x;
        oldPosMat.at<float>(0, 1) = centeredOld.y;
        oldPosMat.at<float>(0, 2) = 0.0f;
        
        Point2f centeredNew = center - newPos.coordinate;
        Mat newPosMat(1, 3, CV_32F);
        newPosMat.at<float>(0, 0) = centeredNew.x;
        newPosMat.at<float>(0, 1) = centeredNew.y;
        newPosMat.at<float>(0, 2) = 0.0f;
        
        Mat crossedMat = oldPosMat.cross(newPosMat);
        float z = crossedMat.at<float>(0, 2);
 
        if (abs(z) > 2.0) {
            if (z < 0)
                return DIR_CCW;
            else if (z > 0)
                return DIR_CW;
        }
        
        return DIR_NONE;
    }
};