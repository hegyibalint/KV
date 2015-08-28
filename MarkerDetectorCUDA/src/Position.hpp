#pragma once

#include <cmath>
#include <chrono>
#include <iostream>
#include <opencv2/opencv.hpp>

#include "Board.hpp"

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
    
    float getAngle(const Position& newPos) {
        float baseAngle = cos(coordinate.y / cv::norm(coordinate));
        std::cout << std::endl;
        std::cout << baseAngle * (360 / M_PI) << std::endl;
        
        float newAngle = cos(newPos.coordinate.y / cv::norm(newPos.coordinate));
        
        float diff = abs(newAngle) - abs(baseAngle);
        if (abs(diff) < 0.00001)
            return 0.0;
        else
            return diff  * (360 / M_PI);
    }
};