#pragma once

// OpenCV
#include <opencv2/opencv.hpp>

// User
#include "Filter.hpp"

class InputFilter : public Filter<cv::Mat> {
	VideoCapture vid;

	void process() {
		static Mat raw;
		std::cout << "Reading frame: " << vid.get(CV_CAP_PROP_POS_FRAMES);
		vid >> raw;
		setData<0>(raw);
	}

public:
	template < typename T > 
	InputFilter(T device) {
		vid = VideoCapture(device);
	}
};