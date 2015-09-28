#pragma once

#include <opencv2/core.hpp>

#include "Position.hpp"
#include "Constants.hpp"

struct Train {
    const int BUFFER_SIZE = 5;
	
    int id;
    int dir = DIR_NONE;
    bool detected = false;
    float lastSpeed = 0.0;
    std::vector<Position> positions;
    
    Train(int identifier) : id(identifier) { }
    
    void setCurrentPosition(Position pos) {
        if (positions.size() < BUFFER_SIZE) {
            positions.push_back(pos);
            lastSpeed = 0.0;
        } else {
            positions.push_back(pos);
            positions.erase(positions.begin());

            float accumulatedSpeed = 0.0;
            for (int i = 0; i < positions.size() - 1; ++i) {
                accumulatedSpeed += positions[i].getSpeed(positions[i+1]);
            }
			
			float speed = accumulatedSpeed / positions.size();
			if (speed < 0.5) {
				lastSpeed = 0.0;
			} else {
				lastSpeed = speed;
			}
			
			dir = positions[0].getDir(positions[positions.size() - 1]);
        }
    }
    
    void setDetected(bool detected) {
        this->detected = detected;
    }
    
    bool getDetected() {
        return detected;
    }
    
    void clearPositions() {
        positions.clear();
    }
    
    float getSpeed() {
        return lastSpeed;
    }
    
    std::string getDir() {
        switch (dir) {
            case DIR_NONE:
                return "NONE";
            case DIR_CW:
                return "CW";
            case DIR_CCW:
                return "CCW";
        }
        
        return "LOL";
    }
    
    Position getPosition() {
        return positions[positions.size() - 1];
    }
    
    Point2f getCoordinate() {
        return positions[positions.size() - 1].coordinate;
    }
    
    static Point2f getCorrectedCenter(Point2f currentCameraPos, Board& board) {
        Point2f translatedCenter = currentCameraPos - board.topLeft;
        Mat translatedCenterMat(Size(1, 2), CV_32F);
        translatedCenterMat.at<float>(0, 0) = translatedCenter.x;
        translatedCenterMat.at<float>(1, 0) = translatedCenter.y;
        Mat correctedMat = board.baseTrans * translatedCenterMat;
        
        Point2f corrected(correctedMat.at<float>(0, 0), correctedMat.at<float>(1, 0));
        Point2f distFromCenter = board.getCenter() - corrected;
        Point2f perspectiveError = distFromCenter * (TRAIN_HEIGHT / CAMERA_HEIGHT);
        Point2f perspectiveCorrected = corrected + perspectiveError;
        
        return perspectiveCorrected;
    }
    
    static Point2f getCorrectedToCamera(Point2f corrected, Board& board) {
        Mat translatedCenterMat(Size(1, 2), CV_32F);
        translatedCenterMat.at<float>(0, 0) = corrected.x;
        translatedCenterMat.at<float>(1, 0) = corrected.y;
        Mat correctedMat = board.inverseTrans * translatedCenterMat;
        
        Point2f inverted = correctedMat.at<Point2f>(0, 0);
        return board.topLeft + inverted;
    }
};