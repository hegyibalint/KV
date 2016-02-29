#define _WINSOCK_DEPRECATED_NO_WARNINGS

#include <iostream>
#include <fstream>
#include <vector>
#include <chrono>
#include <tuple>
#include <algorithm>

// OpenCV
#include <opencv2/opencv.hpp>

// OpenCV - CUDA
#include <opencv2/core/cuda.hpp>
#include <opencv2/cudaarithm.hpp>

// Network
#include <arpa/inet.h>
#include <sys/socket.h>

// User
#include "Board.hpp"
#include "Train.hpp"
#include "TrainJSON.hpp"

using namespace cv;
using namespace cv::cuda;

Mat distCoeffs, cameraMatrix;

int sockhandler;
std::ofstream outfile;

void initSocket() {
	sockhandler = socket(AF_INET, SOCK_DGRAM, IPPROTO_UDP);
	outfile.open("data.json");
}

void sendData(TrainJSON& trainJSON) {
	struct sockaddr_in addr;
	addr.sin_family = AF_INET;
	addr.sin_port = htons(24000);
	addr.sin_addr.s_addr = inet_addr("152.66.156.190");
	
	std::string data = trainJSON.generateJSON();
	sendto(sockhandler, data.data(), data.size(), 0, (const sockaddr *)&addr, sizeof(addr));
	addr.sin_addr.s_addr = inet_addr("127.0.0.1");
	sendto(sockhandler, data.data(), data.size(), 0, (const sockaddr *)&addr, sizeof(addr));

	outfile << data << "," << std::endl;
	outfile.flush();
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
	
	static HostMem grayPaddedMem(1024, 2048, CV_32F);
	static Mat grayPadded = ([&]() {
		Mat material = grayPaddedMem.createMatHeader();
		material.setTo(Scalar(0));
		return material;
	})();
	
	gray(srcRoi).convertTo(grayPadded(dstRoi), CV_32F, 1/255.0);
	
	static cuda::Stream stream;
	
	static GpuMat spectrum = createContinuous(Size(1025, 1024), CV_32FC2);
	spectrum.upload(grayPadded, stream);
	
	cuda::dft(spectrum, spectrum, grayPadded.size(), 0, stream);
	cuda::mulSpectrums(spectrum, circleSpectrum, spectrum, 0, stream);
	
	static GpuMat convoluted = createContinuous(Size(2048, 1024), CV_32FC2);
	cuda::dft(spectrum, convoluted, grayPadded.size(), DFT_INVERSE | DFT_REAL_OUTPUT, stream);
	
	cuda::normalize(convoluted, convoluted, 0, 1, NORM_MINMAX, CV_32F, noArray(), stream);
	cuda::threshold(convoluted, convoluted, thresold, 1, CV_THRESH_BINARY, stream);
	
	static GpuMat spectrumByte;
	convoluted.convertTo(spectrumByte, CV_8U, 255);
	
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

bool findMarker(Point2f a, Point2f b, double min, double max) {
	double distance = cv::norm(a - b);
	if (min < distance && distance < max) {
		return true;
	}
	
	return false;
}

int identifyMarker(Point2f markerCenter, Mat img) {
	Rect2i roi((markerCenter - Point2f(8, 8)), cv::Size2i(16, 16));

	Scalar mean = cv::mean(img(roi));
	cv::rectangle(img, roi, Scalar(0, 0, 255));

	Mat_<Point3f> meanMat(1, 1);
	meanMat.at<Point3f>(0, 0) = Point3f(mean[0], mean[1], mean[2]);
	Mat_<Point3f> hsvMat;
	cv::cvtColor(meanMat, hsvMat, CV_BGR2HSV);

	Point3f hsv = hsvMat.at<Point3f>(0, 0);
	
	float hue = hsv.x;
	std::cout << "Hue: " << hue << std::endl;
	
	float sat = hsv.y;
	//std::cout << "Sat: " << sat << std::endl;
	
	float val = hsv.z;
	//std::cout << val << std::endl << std::endl;
	
	if (val > 100) {
		if (RED1_LOW < hue && hue < RED1_HIGH)
			return MARKER_R;
		else if (RED2_LOW < hue && hue < RED2_HIGH)
			return MARKER_R;
		else if (GREEN_LOW < hue && hue < GREEN_HIGH)
			return MARKER_G;
	}
	
	if (BLUE_LOW < hue && hue < BLUE_HIGH)
			return MARKER_B;
	
	
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

	std::random_shuffle(mc.begin(), mc.end());
	return mc;
}

Board detectBoard(VideoCapture vid) {
	Mat raw;
	vid >> raw;
	Mat undistorted;
	cv::undistort(raw, undistorted, cameraMatrix, distCoeffs);
	
	Point2i decPoint = raw.size() / 2;
	//GpuMat boardCicle = createCirclePattern(Size(2048, 1024), 30, 25, 15);
	GpuMat boardCicle = createCirclePattern(Size(2048, 1024), 28, 20, 12);
	
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
		Point2f speedVector = train.positions[train.positions.size() - 1].coordinate - train.positions[0].coordinate;
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
	auto drawLines = [&](std::vector<std::pair<Point2f, Point2f>> pairs, Scalar color, float thickness) {
		for(auto& pair : pairs) {
			drawLine(pair.first, pair.second, Scalar(0, 0, 0), thickness + 4);
		}
		for(auto& pair : pairs) {
			drawLine(pair.first, pair.second, color, thickness);
		}
	};
	
	Scalar color;
	switch (train.id) {
		case MARKER_R:
			color = Scalar(0, 0, 255);
			break;
		case MARKER_G:
			color = Scalar(0, 255, 0);
			break;
		case MARKER_B:
			color = Scalar(255, 0, 0);
			break;
		default:
			color = Scalar(0, 0, 0);
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

void detectCenters(VideoCapture vid) {
	static Mat raw;
	vid >> raw;
	
	
	static GpuMat trainCircle = createCirclePattern(Size(2048, 1024), 18, 15, 9);
	static Mat contour;
	contour = convolve(raw, trainCircle, 0.80);
	
	auto mc = calculateMassCenters(contour);
	
	for (auto& c : mc) {
		std::cout << c;
	}
	
}

void detectTrains(VideoCapture vid, Board board, Train* trains) {
	static long vidpos = 0;
	
	static Mat raw;
	vid.set(CV_CAP_PROP_POS_MSEC, 100 * vidpos++);
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

	std::tuple<int, Point2f, Point2f, Point2f> markers[MARKER_COUNT];
	for (int i = 0; i < MARKER_COUNT; ++i) {
		markers[i] = std::make_tuple(0, Point2f(), Point2f(), Point2f());
	}

	for (int i = 0; i < mc.size() - 1; ++i) {
		for (int j = i + 1; j < mc.size(); ++j) {
			//bool found = findMarker(mc[i], mc[j], 53, 60);
			bool found = findMarker(mc[i], mc[j], 60, 64);
			if (!found)
				continue;
			
			Point2f start = mc[i];
			Point2f end = mc[j];
			Point2f center = (start + end) / 2;
			
			int id = identifyMarker(center, raw);
			if (id != MARKER_UNKNOWN) {
				std::get<0>(markers[id])++;
				std::get<1>(markers[id]) = start;
				std::get<2>(markers[id]) = end;
				std::get<3>(markers[id]) = center;
			}
			
		}
	}

	for (int id = 0; id < MARKER_COUNT; ++id) {
		if (std::get<0>(markers[id]) == 1) {
			switch (id) {
				case MARKER_R:
					std::cout << "RED MARKER @ ";
					break;
				case MARKER_G:
					std::cout << "GREEN MARKER @ ";
					break;
				case MARKER_B:
					std::cout << "BLUE MARKER @ ";
					break;
				case MARKER_UNKNOWN:
					std::cout << "UNKOWN MARKER @ ";
				default:
					break;
			}
			
			trains[id].setDetected(true);

			Mat_<Point2f> cameraCorrectionMat(1, 1, std::get<3>(markers[id]));
			cv::undistortPoints(cameraCorrectionMat, cameraCorrectionMat, cameraMatrix, distCoeffs, cv::noArray(), cameraMatrix);
			Point2f undistorted = cameraCorrectionMat.at<Point2f>(0, 0);
			Point2f corrected = Train::getCorrectedCenter(undistorted, board);

			Position pos = { timestamp, corrected };
			trains[id].setCurrentPosition(pos);

			std::cout << trains[id].getCoordinate() << std::endl;
			std::cout << trains[id].getSpeed() << " cm/s" << std::endl;

			cv::circle(raw, Train::getCorrectedToCamera(Train::getCorrectedCenter(std::get<3>(markers[id]), board), board), 4, Scalar(0, 0, 255), -1);
			cv::circle(raw, Train::getCorrectedToCamera(corrected, board), 4, Scalar(0, 255, 0), -1);
			json.addTrain(trains[id]);

			drawTrainMarker(raw, trains[id], std::get<1>(markers[id]), std::get<2>(markers[id]), std::get<3>(markers[id]));
		} else {
			trains[id].setDetected(false);
		}
	}

	for (int i = 0; i < MARKER_COUNT; ++i) {
		if(trains[i].getDetected() == false)
			trains[i].clearPositions();
	}
	
	sendData(json);
	
	auto end = std::chrono::high_resolution_clock::now();
	auto dur = std::chrono::duration_cast<std::chrono::milliseconds>(end - timestamp).count();
	
	std::cout << "Fps: " << 1000.0 / dur << std::endl;
	
	cv::circle(raw, board.topLeft, 10, Scalar(255, 0, 0));
	cv::circle(raw, board.topRight, 10, Scalar(255, 0, 0));
	cv::circle(raw, board.bottomLeft, 10, Scalar(255, 0, 0));
	cv::circle(raw, board.bottomRight, 10, Scalar(255, 0, 0));

	//cv::line(raw, Point2f(1920 / 2, 0), Point2f(1920 / 2, 1080), Scalar(255, 255, 255), 2);
	//cv::line(raw, Point2f(0, 120), Point2f(1920, 120), Scalar(255, 255, 255), 2);
	//cv::line(raw, Point2f(0, 960), Point2f(1920, 960), Scalar(255, 255, 255), 2);

	cv::resize(raw, raw, raw.size() / 3 * 2);
	imshow("Train", raw);
}

int main(int argc, char** argv)
{
	initSocket();
	
	VideoCapture vid("Test3.mov");
	vid.set(CAP_PROP_FRAME_WIDTH, 1920);
	vid.set(CAP_PROP_FRAME_HEIGHT, 1080);
	vid.set(CAP_PROP_FPS, 5);
	
	Train trains[] = {
		Train(MARKER_R),
		Train(MARKER_G),
		Train(MARKER_B)
	};
	
	cv::FileStorage fs("camera_data.xml", FileStorage::READ);
	fs["Distortion_Coefficients"] >> distCoeffs;
	fs["Camera_Matrix"] >> cameraMatrix;
	
	Board board = detectBoard(vid);
	std::cout << board.topLeft;
	
	cv::namedWindow("Train");
	
	while (true) {
		detectTrains(vid, board, trains);

		//detectCenters(vid);
		waitKey(1);
		
		std::cout << "-----------" << std::endl;
	}
	
	return 0;
}