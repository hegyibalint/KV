#pragma once

#include <chrono>
#include <vector>
#include <sstream>

#include "Train.hpp"

class TrainJSON {
    std::vector<std::string> trainChunks;
    std::chrono::high_resolution_clock::time_point timestamp;
    
public:
    void addTrain(Train& train) {
        std::stringstream ss;
        
        if (train.getSpeed() > 100)
            return;
        
        Point2f c = train.getCoordinate();
        ss << "{ \"id\": " << train.id << ", \"x\": " << c.x << ", \"y\": " << c.y << ", \"speed\": " << train.getSpeed() << ", \"dir\": \"" << train.getDir() << "\" }";
        
        trainChunks.push_back(ss.str());
    }
    
    void setTimestamp(std::chrono::high_resolution_clock::time_point t) {
        timestamp = t;
    }
    
    std::string generateJSON() {
        std::stringstream ss;
        
        ss << "{" << std::endl;
        ss << "\t" << "\"timestamp\": " << timestamp.time_since_epoch().count() << "," << std::endl;
        ss << "\t" << "\"trains\": [" << std::endl;
        
        for (int i = 0; i < trainChunks.size(); ++i) {
            ss << "\t\t" << trainChunks[i];
            if (i != trainChunks.size() - 1)
                ss << ",";
            ss << std::endl;
        }
        
        ss << "\t]" << std::endl;
        ss << "}" << std::endl;
        
        return ss.str();
    }
};