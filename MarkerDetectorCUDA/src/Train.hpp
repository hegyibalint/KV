#pragma once

#include <opencv2/core.hpp>

struct Train {
    int identifier;
    cv::Point2f center;
    
    Train(int identifier, cv::Point2f center) : identifier(identifier), center(center) { }
};