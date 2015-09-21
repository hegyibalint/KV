#pragma once

// OpenCV
#include <opencv2/opencv.hpp>

// OpenCV - CUDA
#include <opencv2/core/cuda.hpp>
#include <opencv2/cudaarithm.hpp>

// User
#include "Utils.hpp"
#include "Filter.hpp"
#include "InputFilter.hpp"

using namespace cv;
using namespace cv::cuda;

class ConvolutionFilter : public Filter < std::pair<cv::Mat, cv::Mat>> {
	InputFilter& input;
	GpuMat circleSpectrum;

	void process() {
		static Mat raw;
		input.getData().copyTo(raw);

		static Mat gray;
		cv::cvtColor(raw, gray, CV_BGR2GRAY);

		Rect2i srcRoi(Point(0, 28), Size(1920, 1024));
		Rect2i dstRoi(Point(64, 0), Size(1920, 1024));

		static HostMem grayPaddedMem(1024, 2048, CV_32F);
		static Mat grayPadded = ([] {
			Mat material = grayPaddedMem.createMatHeader();
			material.setTo(Scalar(0));
			return material;
		})();

		gray(srcRoi).convertTo(grayPadded(dstRoi), CV_32F, 1 / 255.0);

		static cuda::Stream stream;

		static GpuMat grayPaddedGPU;
		grayPaddedGPU.upload(grayPadded, stream);

		static GpuMat spectrum = createContinuous(Size(1025, 1024), CV_32FC2);
		cuda::dft(grayPaddedGPU, spectrum, grayPadded.size(), 0, stream);
		cuda::mulSpectrums(spectrum, circleSpectrum, spectrum, 0, stream);

		static GpuMat convoluted = createContinuous(Size(2048, 1024), CV_32F);
		cuda::dft(spectrum, convoluted, grayPadded.size(), DFT_INVERSE | DFT_REAL_OUTPUT, stream);
		cuda::normalize(convoluted, convoluted, 0, 1.0, NORM_MINMAX, CV_32F, noArray(), stream);
		cuda::threshold(convoluted, convoluted, 0.8, 1.0, CV_THRESH_BINARY, stream);

		static GpuMat spectrumByte;
		convoluted.convertTo(spectrumByte, CV_8U, 255, stream);

		static Mat contour = Mat::zeros(1080, 1920, CV_8U);
		spectrumByte(dstRoi).download(contour(srcRoi), stream);

		stream.waitForCompletion();
		setData(std::make_pair(raw.clone(), contour.clone()));
	}

public:
	ConvolutionFilter(InputFilter& input) : input(input) {
		circleSpectrum = createCirclePattern(Size(2048, 1024), 10, 8, 4);
	}
};