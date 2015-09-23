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
//#include <arpa/inet.h>
//#include <sys/socket.h>

// User
#include "Utils.hpp"
#include "Board.hpp"
#include "Train.hpp"
#include "TrainJSON.hpp"

// Pipe
#include "InputFilter.hpp"
#include "ConvolutionFilter.hpp"
#include "DetectionFilter.hpp"

using namespace cv;
using namespace cv::cuda;

Mat distCoeffs, cameraMatrix;

int sockhandler;

void initSocket() {
	//sockhandler = socket(AF_INET, SOCK_DGRAM, IPPROTO_UDP);
}

void sendData(TrainJSON& trainJSON) {
	/*
	 struct sockaddr_in addr;
	 addr.sin_family = AF_INET;
	 addr.sin_port = htons(24000);
	 addr.sin_addr.s_addr = inet_addr("152.66.158.41");
	 
	 std::string data = trainJSON.generateJSON();
	 sendto(sockhandler, data.data(), data.size(), 0, (const sockaddr *)&addr, sizeof(addr));
	 addr.sin_addr.s_addr = inet_addr("127.0.0.1");
	 sendto(sockhandler, data.data(), data.size(), 0, (const sockaddr *)&addr, sizeof(addr));
	 */
}

Board detectBoard(VideoCapture vid) {
	Mat raw;
	vid >> raw;
	Mat undistorted;
	cv::undistort(raw, undistorted, cameraMatrix, distCoeffs);
	
	Point2i decPoint = raw.size() / 2;
	GpuMat boardCicle = createCirclePattern(Size(2048, 1024), 25, 20, 10);
	//GpuMat boardCicle = createCirclePattern(Size(2048, 1024), 30, 25, 15);
	
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

int main(int argc, char** argv)
{
	initSocket();

	VideoCapture vid("Test1.mov");

	cv::FileStorage fs("camera_data.xml", FileStorage::READ);
	fs["Distortion_Coefficients"] >> distCoeffs;
	fs["Camera_Matrix"] >> cameraMatrix;

	Board board = detectBoard(vid);
	std::cout << board.topLeft;

	//cv::namedWindow("Train");

	InputFilter p1("Test1.mov");
	ConvolutionFilter p2(p1);
	DetectionFilter p3(p2, board, cameraMatrix, distCoeffs);

	p1.start();
	p2.start();
	p3.start();

	//cv::namedWindow("Test", CV_WINDOW_AUTOSIZE | CV_WINDOW_KEEPRATIO);
	//cv::setWindowProperty("Test", CV_WINDOW_FULLSCREEN, CV_WINDOW_FULLSCREEN);

	Mat im;
	while (true) {
		auto timestamp = std::chrono::steady_clock::now();
		p3.getData<0>().copyTo(im);
		p3.clearToProcess();
		//imshow("Test", im);
		int key = waitKey(1);
        //detectTrains(vid, board, trains);
		auto end = std::chrono::steady_clock::now();
		auto dur = std::chrono::duration_cast<std::chrono::microseconds>(end - timestamp).count();

		std::cout << "Fps: " << 1000000 / dur << std::endl;

		if (key == 27)
			break;
    }
    
    return 0;
}