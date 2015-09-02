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
        Point2f centeredNew = center - newPos.coordinate;
        float z = centeredOld.cross(centeredNew);
 
        if (abs(z) > 2.0) {
            if (z < 0)
                return DIR_CCW;
            else if (z > 0)
                return DIR_CW;
        }
        
        return DIR_NONE;
    }
};