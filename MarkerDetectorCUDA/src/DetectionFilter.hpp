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
	InputFilter& input;
	ConvolutionFilter& convolution;
	Board& board;
	Mat cameraMatrix, distCoeffs;
	std::vector<Train> trains;

	static int identifyMarker(Point2f markerCenter, Mat& img) {
		Rect2i roi((markerCenter - Point2f(8, 8)), cv::Size2i(16, 16));

		static Mat sample;
		cv::cvtColor(img(roi), sample, CV_BGR2HSV);
		cv::rectangle(img, roi, Scalar(0, 0, 255));

		float hue = cv::mean(sample)[0] * 2;
		std::cout << hue << std::endl;

		float sat = cv::mean(sample)[1];
		std::cout << sat << std::endl;

		float val = cv::mean(sample)[2];
		std::cout << val << std::endl << std::endl;

		if (CYAN_LOW < hue && hue < CYAN_HIGH)
			return MARKER_R;
		if (MAGENTA_LOW < hue && hue < MAGENTA_HIGH)
			return MARKER_G;
		/*
		if (YELLOW_LOW < hue && hue < YELLOW_HIGH)
		return MARKER_Y;
		*/

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

	static std::tuple<bool, Point2f, Point2f> findMarker(std::vector<Point2f>& points, double min, double max) {
		//if (points.size() < 4)
		//return false;

		for (int first = 0; first < points.size() - 1; ++first) {
			for (int last = first + 1; last < points.size(); ++last) {

				double distance = cv::norm(points[first] - points[last]);
				if (min < distance && distance < max) {
					//Point2f dirVector = (points[last] - points[first]) / 4;
					std::vector<int> deletionVector = { first, last };
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

		return std::make_tuple(false, Point2f(), Point2f());
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
		switch (train.identifier) {
		case MARKER_R:
			color = Scalar(255, 255, 0);
			break;
		case MARKER_G:
			color = Scalar(255, 0, 255);
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
		auto data = convolution.getData();
		auto timestamp = std::chrono::high_resolution_clock::now();

		static Mat raw;
		data.first.copyTo(raw);

		static Mat contour;
		data.second.copyTo(contour);
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
			case MARKER_R:
				std::cout << "CYAN MARKER @ ";
				break;
			case MARKER_G:
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

				Position pos = { timestamp, corrected };
				trains[id].setCurrentPosition(pos);

				std::cout << trains[id].getCoordinate() << std::endl;
				std::cout << trains[id].getSpeed() << " cm/s" << std::endl;

				//cv::circle(raw, Train::getCorrectedToCamera(Train::getCorrectedCenter(center, board), board), 4, Scalar(0, 0, 255), -1);
				//cv::circle(raw, Train::getCorrectedToCamera(corrected, board), 4, Scalar(0, 255, 0), -1);
				json.addTrain(trains[id]);
			}

			if (id != -1)
				drawTrainMarker(raw, trains[id], start, end, center);
		}

		for (int i = 0; i < MARKER_COUNT; ++i) {
			if (trains[i].getDetected() == false)
				trains[i].clearPositions();
		}

		setData(raw.clone());
	}

public:
	DetectionFilter(
		InputFilter& input, 
		ConvolutionFilter& convolution, 
		Board& board,
		Mat cameraMatrix,
		Mat distCoeffs) : input(input), convolution(convolution), board(board), cameraMatrix(cameraMatrix), distCoeffs(distCoeffs) {
		trains.emplace_back(MARKER_R);
		trains.emplace_back(MARKER_G);
		trains.emplace_back(MARKER_B);
	}
};