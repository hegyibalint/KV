#pragma once

#include <vector>
#include <sstream>

#include "Train.hpp"

class TrainJSON {
    std::vector<std::string> trainChunks;
    
public:
    void addTrain(Train& train) {
        std::stringstream ss;
        
        Point2f c = train.getCoordinate();
        ss << "{ \"id\": " << train.identifier << ", \"x\": " << c.x << ", \"y\": " << c.y << ", \"speed\": " << train.getSpeed() << ", \"dir\": \"" << train.getDir() << "\" }";
        
        trainChunks.push_back(ss.str());
    }
    
    std::string generateJSON() {
        std::stringstream ss;
        
        ss << "{" << std::endl;
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