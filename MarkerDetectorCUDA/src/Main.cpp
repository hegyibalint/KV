#include <iostream>
#include <vector>
#include <chrono>
#include <tuple>

// OpenCV
#include <opencv2/opencv.hpp>

// OpenCV - CUDA
#include <opencv2/core/cuda.hpp>
#include <opencv2/cudaarithm.hpp>

// Network
#include <arpa/inet.h>
#include <sys/socket.h>

// Mosquitto
#include <mosquittopp.h>

// User
#include "Board.hpp"
#include "Train.hpp"
#include "TrainJSON.hpp"

using namespace cv;
using namespace cv::cuda;
using namespace mosqpp;

Mat distCoeffs, cameraMatrix;

int sockhandler;
mosquittopp mqtt("opencv");

void initSocket() {
    sockhandler = socket(AF_INET, SOCK_DGRAM, IPPROTO_UDP);
}

void initMQTT() {
	mqtt.connect("localhost");
}

void sendData(TrainJSON& trainJSON) {
    struct sockaddr_in addr;
    addr.sin_family = AF_INET;
    addr.sin_port = htons(24000);
    addr.sin_addr.s_addr = inet_addr("152.66.158.41");
    
    std::string data = trainJSON.generateJSON();
    sendto(sockhandler, data.data(), data.size(), 0, (const sockaddr *)&addr, sizeof(addr));
    addr.sin_addr.s_addr = inet_addr("127.0.0.1");
    sendto(sockhandler, data.data(), data.size(), 0, (const sockaddr *)&addr, sizeof(addr));
	
	mqtt.publish(NULL, "cv", static_cast<int>(data.length()), data.data());
}

void drawMarkerToMat(Mat& marker, int x, int y, int outer, int ring, int inner) {
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
    
    cv::GaussianBlur(circle, circle, Size(3, 3), 2);
	
    GpuMat circleSpectrum;
	circleSpectrum.upload(circle);
	
    cuda::dft(circle, circleSpectrum, circle.size());
    return circleSpectrum;
}

Mat convolve(Mat raw, GpuMat circleSpectrum, float thresold) {
	static Mat gray;
	cv::cvtColor(raw, gray, CV_BGR2GRAY);
	
	Rect2i srcRoi(Point(0, 28), Size(1920, 1024));
	Rect2i dstRoi(Point(64, 0), Size(1920, 1024));
	
	static Mat grayPadded = Mat::zeros(1024, 2048, CV_32F);
	gray(srcRoi).convertTo(grayPadded(dstRoi), CV_32F, 1/255.0);
	
	static cuda::Stream stream;

	static GpuMat spectrum;
	spectrum.upload(grayPadded, stream);

	cuda::dft(spectrum, spectrum, grayPadded.size(), 0, stream);
	cuda::mulSpectrums(spectrum, circleSpectrum, spectrum, 0, stream);
	cuda::dft(spectrum, spectrum, grayPadded.size(), DFT_INVERSE | DFT_REAL_OUTPUT, stream);
	
	//cuda::magnitude(spectrum, spectrum, stream);
	cuda::normalize(spectrum, spectrum, 0, 1, NORM_MINMAX, CV_32F, noArray(), stream);
	cuda::threshold(spectrum, spectrum, thresold, 0.5, CV_THRESH_BINARY, stream);
	
	static GpuMat spectrumByte;
	spectrum.convertTo(spectrumByte, CV_8U, 255);

	static Mat contour = Mat::zeros(1080, 1920, CV_8U);
	spectrumByte(dstRoi).download(contour(srcRoi), stream);
	
	stream.waitForCompletion();
	return contour;
}

bool isMarkerNear(std::vector<Point2f> points, Point2f loc, double e, std::vector<int>& deletionVector) {
    for (int i = 0; i < points.size() && i < 5; ++i) {
        double distance = cv::norm(loc - points[i]);
        
        if (distance <= e) {
            deletionVector.push_back(i);
            return true;
        }
    }
    
    return false;
}

std::tuple<bool, Point2f, Point2f> findMarker(std::vector<Point2f>& points, double min, double max) {
    //if (points.size() < 4)
        //return false;
    
    for (int first = 0; first < points.size() - 1; ++first) {
        for (int last = first + 1; last < points.size(); ++last) {
            
            double distance = cv::norm(points[first] - points[last]);
            if (min < distance && distance < max) {
                //Point2f dirVector = (points[last] - points[first]) / 4;
                std::vector<int> deletionVector = { first, last };
                
                bool innerMarkersFound = true;
                /*
                for (int div = 1; div <= 1; ++div) {
                    if (div == 1)
                        continue;
                    
                    Point2f pos = points[first] + (div * dirVector);
                    if (!isMarkerNear(points, pos, 5, deletionVector)) {
                        innerMarkersFound = false;
                        break;
                    }
                }
                */
                
                if (innerMarkersFound) {
                    auto result = std::tuple<bool, Point2f, Point2f>(true, points[first], points[last]);
                    
                    std::sort(deletionVector.begin(), deletionVector.end());
                    for (int d = 0; d < deletionVector.size(); ++d) {
                        int position = deletionVector[d] - d;
                        points.erase(points.begin() + position);
                    }
                    
                    return result;
                }
            }
        }
    }
    
    return false;
}

int identifyMarker(Point2f markerCenter, Mat& img) {
    Rect2i roi((markerCenter - Point2f(8, 8)), cv::Size2i(16, 16));
    
    Mat sample;
    cv::cvtColor(img(roi), sample, CV_BGR2HSV);
    cv::rectangle(img, roi, Scalar(0, 0, 255));
    
    float hue = cv::mean(sample)[0] * 2;
    std::cout << hue << std::endl;
    
    float sat = cv::mean(sample)[1];
    std::cout << sat << std::endl;
    
    float val = cv::mean(sample)[2];
    std::cout << val << std::endl << std::endl;
    
    if (CYAN_LOW < hue && hue < CYAN_HIGH)
        return MARKER_C;
    if (MAGENTA_LOW < hue && hue < MAGENTA_HIGH)
        return MARKER_M;
    /*
    if (YELLOW_LOW < hue && hue < YELLOW_HIGH)
        return MARKER_Y;
    */
    
    return MARKER_UNKNOWN;
}

std::vector<Point2f> calculateMassCenters(Mat contour) {
    std::vector<std::vector<Point>> contours;
    std::vector<Vec4i> hierarchy;
    findContours(contour, contours, hierarchy, CV_RETR_EXTERNAL, CV_CHAIN_APPROX_SIMPLE, Point(0, 0) );
    
    std::vector<Moments> mu(contours.size() );
    for( int i = 0; i < contours.size(); i++ )
    { mu[i] = moments( contours[i], false ); }
    
    std::vector<Point2f> mc( contours.size() );
    for( int i = 0; i < contours.size(); i++ )
    {
        Point2f com = Point2f( mu[i].m10/mu[i].m00 , mu[i].m01/mu[i].m00 );
        if (!(isnan(com.x) && isnan(com.y))) {
            mc[i] = com;
        }
    }
    
    return mc;
}

Board detectBoard(VideoCapture vid) {
    Mat raw;
    vid >> raw;
    Mat undistorted;
    cv::undistort(raw, undistorted, cameraMatrix, distCoeffs);
	
    Point2i decPoint = raw.size() / 2;
    //GpuMat boardCicle = createCirclePattern(Size(2048, 1024), 25, 20, 10);
	GpuMat boardCicle = createCirclePattern(Size(2048, 1024), 30, 25, 15);
    
    std::cout << "Searching board..." << std::endl;
    
    Mat contour;
    std::vector<Point2f> mc;
    float thresold = 0.99;
    while (true) {
        contour = convolve(undistorted, boardCicle, thresold);
		
		/*
		Mat debug;
		cv::resize(contour, debug, contour.size() * 2 / 3);
		imshow("c", debug);
		waitKey(0);
		*/
        
        std::cout << "Thresold: " << thresold << std::endl;
        
        mc = calculateMassCenters(contour);
        if (mc.size() == 4) {
            bool zeroPoint = false;
            for (auto& point : mc) {
                if (point.x < 0.1 || point.y < 0.1)
                    zeroPoint = true;
            }
            if (zeroPoint) {
                thresold -= 0.025;
                continue;
            }
            break;
        } else if (mc.size() > 4 || thresold < 0.5)
            throw std::runtime_error("Board cannot be detected");
        
        thresold -= 0.05;
    }
    
    std::cout << "Board found" << std::endl;
    std::cout << "===========" << std::endl;
    
    Board board;
    for (auto& point : mc) {
        if (point.x < decPoint.x) {
            if (point.y < decPoint.y) {
                board.topLeft = point;
            } else {
                board.bottomLeft = point;
            }
        } else {
            if (point.y < decPoint.y) {
                board.topRight = point;
            } else {
                board.bottomRight = point;
            }
        }
    }
    board.calculateBaseMat();
    
    return board;
}

void drawTrainMarker(Mat& raw, Train& train, Point2f start, Point2f end, Point2f center) {
	const int ARROWS = 15;
	
	const float HEIGHT = 0.3;
	const float A_HEIGHT = 0.2;
	
	const float H_DIST = 0.85;
	const float L_DIST = 0.60;
	
	const float A_DIST = 0.95;
	const float A_BACK = 0.1;
	const float A_PLUS = 0.2;
	
	cv::line(raw, start, end, Scalar(255, 0, 0));
	
	Point2f v0 = end - start;
	Point2f v1 = {v0.y, -v0.x};
	
	if (train.lastSpeed > 0.001) {
		Point2f speedVector = train.positions[train.positions.size()].coordinate - train.positions[0].coordinate;
		float dotProduct = v0.dot(speedVector);
		
		if (dotProduct < 0) {
			v0 = -v0;
		}
	}
	
	auto convert = [&](float a, float b) {
		return center + (v0 * a) + (b * v1);
	};
	/*
	auto draw = [](Point2f point) {
		glVertex2f(point.x, point.y);
	};
	*/
	auto drawLine = [&](Point2f start, Point2f end, Scalar color, float thickness) {
		line(raw,
			 start,
			 end,
			 color, thickness / 2, CV_AA);
	};
	auto drawLines = [&](std::vector<std::pair<Point2f, Point2f>> pairs, Scalar color = Scalar(0, 0, 255), float thickness = 4) {
		for(auto& pair : pairs) {
			drawLine(pair.first, pair.second, Scalar(0, 0, 0), thickness + 4);
		}
		for(auto& pair : pairs) {
			drawLine(pair.first, pair.second, color, thickness);
		}
	};
	
	Scalar color;
	switch (train.identifier) {
		case MARKER_C:
			color = Scalar(255, 255, 0);
			break;
		case MARKER_M:
			color = Scalar(255, 0, 255);
			break;
		default:
			Scalar(0, 0, 0);
	}
	
	drawLines({
		{convert(H_DIST, -HEIGHT),  convert(H_DIST, HEIGHT)},
		{convert(-H_DIST, -HEIGHT), convert(-H_DIST, +HEIGHT)},
		{convert(-H_DIST, -HEIGHT), convert(-L_DIST, -HEIGHT)},
		{convert(-H_DIST, +HEIGHT), convert(-L_DIST, +HEIGHT)},
		{convert(+H_DIST, -HEIGHT), convert(+L_DIST, -HEIGHT)},
		{convert(+H_DIST, +HEIGHT), convert(+L_DIST, +HEIGHT)}
	}, color, 6);
	
	
	if (train.lastSpeed > 0) {
		for (int i = 0; i * 2 < train.lastSpeed; ++i) {
			Scalar color(
				0,
				255 - 255 / ARROWS * train.lastSpeed,
				255 / ARROWS * train.lastSpeed
			);
			
			drawLines({
				{convert(A_DIST + A_PLUS * (i+1) - A_BACK, +A_HEIGHT), convert(A_DIST + A_PLUS * (i+1), 0)},
				{convert(A_DIST + A_PLUS * (i+1) - A_BACK, -A_HEIGHT), convert(A_DIST + A_PLUS * (i+1), 0)}
			}, color, 6);
		}
	}
}

void detectTrains(VideoCapture vid, Board board, Train* trains) {
    static Mat raw;
    vid >> raw;
    auto timestamp = std::chrono::high_resolution_clock::now();
    
    static GpuMat trainCircle = createCirclePattern(Size(2048, 1024), 10, 8, 4);
    static Mat contour;
    contour = convolve(raw, trainCircle, 0.6);
    
    auto mc = calculateMassCenters(contour);
    
    for (int i = 0; i < MARKER_COUNT; ++i) {
        trains[i].setDetected(false);
    }
    
    TrainJSON json;
    json.setTimestamp(timestamp);
    
    while (true) {
        std::tuple<bool, Point2f, Point2f> result = findMarker(mc, 50, 70);
        //std::tuple<bool, Point2f, Point2f> result = findMarker(mc, 100, 150);
        
        bool found = std::get<0>(result);
        if (!found)
            break;
        
        Point2f start = std::get<1>(result);
        Point2f end = std::get<2>(result);
        Point2f center = (start + end) / 2;
        
        int id = identifyMarker(center, raw);
        switch (id) {
            case MARKER_C:
                std::cout << "CYAN MARKER @ ";
                break;
            case MARKER_M:
                std::cout << "MAGENTA MARKER @ ";
                break;
            /*
            case MARKER_Y:
                std::cout << "YELLOW MARKER @ ";
                break;
            */
            case MARKER_UNKNOWN:
                std::cout << "UNKOWN MARKER @ ";
            default:
                break;
        }
        
        if (id != MARKER_UNKNOWN) {
            trains[id].setDetected(true);
            
            Mat_<Point2f> cameraCorrectionMat(1, 1, center);
            cv::undistortPoints(cameraCorrectionMat, cameraCorrectionMat, cameraMatrix, distCoeffs, cv::noArray(), cameraMatrix);
            Point2f undistorted = cameraCorrectionMat.at<Point2f>(0, 0);
            Point2f corrected = Train::getCorrectedCenter(undistorted, board);

            Position pos = {timestamp, corrected};
            trains[id].setCurrentPosition(pos);
            
            std::cout << trains[id].getCoordinate() << std::endl;
            std::cout << trains[id].getSpeed() << " cm/s" << std::endl;
            
            //cv::circle(raw, Train::getCorrectedToCamera(Train::getCorrectedCenter(center, board), board), 4, Scalar(0, 0, 255), -1);
            //cv::circle(raw, Train::getCorrectedToCamera(corrected, board), 4, Scalar(0, 255, 0), -1);
            json.addTrain(trains[id]);
        }
		
		drawTrainMarker(raw, trains[id], start, end, center);
        
        /*
        Mat_<Point2f> src(1, static_cast<int>(trains.size()));
        for (int i = 0; i < trains.size(); ++i) {
            src(i) = trains[i].center;
        }
        
        Mat dst;
        cv::undistortPoints(src, dst, cameraMatrix, distCoeffs);
        
        std::cout << dst << std::endl;
        
        for (int i = 0; i < trains.size(); ++i) {
            Point2f corr(dst.at<Vec2f>(0, i)[0], dst.at<Vec2f>(0, i)[1]);
            cv::circle(raw, trains[i].center + corr, 4, Scalar(0, 255, 0), -1);
        }
        
        cv::circle(raw, board.topLeft, 10, Scalar(255, 0, 0));
        cv::circle(raw, board.topRight, 10, Scalar(255, 0, 0));
        */
    }
    
    for (int i = 0; i < MARKER_COUNT; ++i) {
        if(trains[i].getDetected() == false)
            trains[i].clearPositions();
    }
    
    sendData(json);
    
    auto end = std::chrono::high_resolution_clock::now();
    auto dur = std::chrono::duration_cast<std::chrono::milliseconds>(end - timestamp).count();
    
    std::cout << "Fps: " << 1000.0 / dur << std::endl;
	
    cv::resize(raw, raw, raw.size() / 3 * 2);
    imshow("Train", raw);
    waitKey(1);
}

int main(int argc, char** argv)
{
    initSocket();
	initMQTT();
    
    VideoCapture vid(1);
	
    Train trains[] = {
        Train(MARKER_C),
        Train(MARKER_M)
    };
    
    cv::FileStorage fs("camera_data.xml", FileStorage::READ);
    fs["Distortion_Coefficients"] >> distCoeffs;
    fs["Camera_Matrix"] >> cameraMatrix;

    Board board = detectBoard(vid);
    //std::cout << board.topLeft;
	
	cv::namedWindow("Train");
	
    while (true) {
        detectTrains(vid, board, trains);
        std::cout << "-----------" << std::endl;
    }
    
    return 0;
}