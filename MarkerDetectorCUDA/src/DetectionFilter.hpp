#pragma once

#include <vector>

// OpenCV
#include <opencv2/opencv.hpp>

// User
#include "Constants.hpp"
#include "Train.hpp"
#include "Filter.hpp"
#include "TrainJSON.hpp"

#include "ConvolutionFilter.hpp"

class DetectionFilter : public Filter<cv::Mat> {
	ConvolutionFilter& convolution;
	Board& board;
	Mat cameraMatrix, distCoeffs;
	std::vector<Train> trains;

	static int identifyMarker(Point2f markerCenter, Mat& img) {
		Rect2i roi((markerCenter - Point2f(8, 8)), cv::Size2i(16, 16));
		
		Mat sample;
		cv::cvtColor(img(roi), sample, CV_BGR2HSV);
		cv::rectangle(img, roi, Scalar(0, 0, 255));
		
		float hue = cv::mean(sample)[0] * 2;
		//std::cout << "Hue: " << hue << std::endl;
		
		//float sat = cv::mean(sample)[1];
		//std::cout << sat << std::endl;
		
		float val = cv::mean(sample)[2];
		//std::cout << val << std::endl << std::endl;
		
		if (val > 100) {
			if (RED_LOW < hue && hue < RED_HIGH)
				return MARKER_R;
			if (GREEN_LOW < hue && hue < GREEN_HIGH)
				return MARKER_G;
			if (BLUE_LOW < hue && hue < BLUE_HIGH)
				return MARKER_B;
		}
		
		
		return MARKER_UNKNOWN;
	}

	static bool isMarkerNear(std::vector<Point2f> points, Point2f loc, double e, std::vector<int>& deletionVector) {
		for (int i = 0; i < points.size() && i < 5; ++i) {
			double distance = cv::norm(loc - points[i]);
			
			if (distance <= e) {
				deletionVector.push_back(i);
				return true;
			}
		}
		
		return false;
	}

	static bool findMarker(Point2f a, Point2f b, double min, double max) {
		double distance = cv::norm(a - b);
		if (min < distance && distance < max) {
			return true;
		}
		
		return false;
	}

	static void drawTrainMarker(Mat& raw, Train& train, Point2f start, Point2f end, Point2f center) {
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
		Point2f v1 = { v0.y, -v0.x };

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
		auto drawLine = [&](Point2f start, Point2f end, Scalar color, float thickness) {
			line(raw,
				start,
				end,
				color, thickness / 2, CV_AA);
		};
		auto drawLines = [&](std::vector<std::pair<Point2f, Point2f>> pairs, Scalar color, float thickness) {
			for (auto& pair : pairs) {
				drawLine(pair.first, pair.second, Scalar(0, 0, 0), thickness + 4);
			}
			for (auto& pair : pairs) {
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
				Scalar(0, 0, 0);
		}

		drawLines({
				{ convert(H_DIST, -HEIGHT), convert(H_DIST, HEIGHT) },
				{ convert(-H_DIST, -HEIGHT), convert(-H_DIST, +HEIGHT) },
				{ convert(-H_DIST, -HEIGHT), convert(-L_DIST, -HEIGHT) },
				{ convert(-H_DIST, +HEIGHT), convert(-L_DIST, +HEIGHT) },
				{ convert(+H_DIST, -HEIGHT), convert(+L_DIST, -HEIGHT) },
				{ convert(+H_DIST, +HEIGHT), convert(+L_DIST, +HEIGHT) }
		}, color, 6);


		if (train.lastSpeed > 0) {
			for (int i = 0; i * 2 < train.lastSpeed; ++i) {
				Scalar color(
					0,
					255 - 255 / ARROWS * train.lastSpeed,
					255 / ARROWS * train.lastSpeed
					);

				drawLines({
						{ convert(A_DIST + A_PLUS * (i + 1) - A_BACK, +A_HEIGHT), convert(A_DIST + A_PLUS * (i + 1), 0) },
						{ convert(A_DIST + A_PLUS * (i + 1) - A_BACK, -A_HEIGHT), convert(A_DIST + A_PLUS * (i + 1), 0) }
				}, color, 6);
			}
		}
	}

	void process() {
		auto timestamp = std::chrono::steady_clock::now();

		static Mat raw = convolution.getData<0>().clone();
		static Mat contour = convolution.getData<1>();
		
		auto mc = calculateMassCenters(contour);
		
		convolution.clearToProcess();

		for (int i = 0; i < MARKER_COUNT; ++i) {
			trains[i].setDetected(false);
		}

		TrainJSON json;
		json.setTimestamp(timestamp);

		for (int i = 0; i < mc.size() - 1; ++i) {
			for (int j = i + 1; j < mc.size(); ++j) {
				bool found = findMarker(mc[i], mc[j], 50, 70);
				if (!found)
					continue;
				
				Point2f start = mc[i];
				Point2f end = mc[j];
				Point2f center = (start + end) / 2;
				
				int id = identifyMarker(center, raw);
				switch (id) {
					case MARKER_R:
						std::cout << "RED MARKER @ ";
						break;
					case MARKER_G:
						std::cout << "GREEN MARKER @ ";
						break;
					case MARKER_B:
						std::cout << "BLUE MARKER @ ";
						break;
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
					
					cv::circle(raw, Train::getCorrectedToCamera(Train::getCorrectedCenter(center, board), board), 4, Scalar(0, 0, 255), -1);
					cv::circle(raw, Train::getCorrectedToCamera(corrected, board), 4, Scalar(0, 255, 0), -1);
					json.addTrain(trains[id]);
				}
				
				drawTrainMarker(raw, trains[id], start, end, center);
				
				cv::circle(raw, board.topLeft, 10, Scalar(255, 0, 0));
				cv::circle(raw, board.topRight, 10, Scalar(255, 0, 0));
				cv::circle(raw, board.bottomLeft, 10, Scalar(255, 0, 0));
				cv::circle(raw, board.bottomRight, 10, Scalar(255, 0, 0));
			}
		}

		for (int i = 0; i < MARKER_COUNT; ++i) {
			if (trains[i].getDetected() == false)
				trains[i].clearPositions();
		}

		setData<0>(raw.clone());
	}

public:
	DetectionFilter(
		ConvolutionFilter& convolution, 
		Board& board,
		Mat cameraMatrix,
		Mat distCoeffs) : convolution(convolution), board(board), cameraMatrix(cameraMatrix), distCoeffs(distCoeffs) {
		trains.emplace_back(MARKER_R);
		trains.emplace_back(MARKER_G);
		trains.emplace_back(MARKER_B);
	}
};