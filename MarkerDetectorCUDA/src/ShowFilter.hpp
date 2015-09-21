#pragma once

// OpenCV
#include <opencv2/opencv.hpp>

// User
#include "Filter.hpp"
#include "ConvolutionFilter.hpp"

class ShowFilter : public Filter<void*> {
	ConvolutionFilter& source;

	void process() {
		cv::Mat raw;
		source.getData().copyTo(raw);

		imshow("Test", raw);
		waitKey(1);
	}

public:
	ShowFilter(ConvolutionFilter& source) : source(source) {
	}
};