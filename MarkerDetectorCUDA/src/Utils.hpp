#pragma once

// OpenCV
#include <opencv2/opencv.hpp>

// OpenCV - CUDA
#include <opencv2/core/cuda.hpp>
#include <opencv2/cudaarithm.hpp>

using namespace cv;
using namespace cv::cuda;

static std::vector<Point2f> calculateMassCenters(Mat contour) {
	std::vector<std::vector<Point>> contours;
	std::vector<Vec4i> hierarchy;
	findContours(contour, contours, hierarchy, CV_RETR_EXTERNAL, CV_CHAIN_APPROX_SIMPLE, Point(0, 0));

	std::vector<Moments> mu(contours.size());
	for (int i = 0; i < contours.size(); i++)
	{
		mu[i] = moments(contours[i], false);
	}

	std::vector<Point2f> mc(contours.size());
	for (int i = 0; i < contours.size(); i++)
	{
		Point2f com = Point2f(mu[i].m10 / mu[i].m00, mu[i].m01 / mu[i].m00);
		if (!(isnan(com.x) && isnan(com.y))) {
			mc[i] = com;
		}
	}

	return mc;
}

static void drawMarkerToMat(Mat& marker, int x, int y, int outer, int ring, int inner) {
	circle(marker, Point(x, y), outer, Scalar(1.0), -1);
	circle(marker, Point(x, y), ring, Scalar(-1.0), -1);
	circle(marker, Point(x, y), inner, Scalar(1.0), -1);
}

static GpuMat createCirclePattern(Size vidsize, int outer, int ring, int inner) {
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

static Mat convolve(Mat raw, GpuMat circleSpectrum, float thresold) {
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

	gray(srcRoi).convertTo(grayPadded(dstRoi), CV_32F, 1 / 255.0);

	static cuda::Stream stream;

	static GpuMat grayPaddedGPU;
	grayPaddedGPU.upload(grayPadded, stream);

	static GpuMat spectrum;
	cuda::dft(grayPaddedGPU, spectrum, grayPadded.size(), 0, stream);
	cuda::mulSpectrums(spectrum, circleSpectrum, spectrum, 0, stream);

	static GpuMat convoluted;
	cuda::dft(spectrum, convoluted, grayPadded.size(), DFT_INVERSE | DFT_REAL_OUTPUT, stream);
	cuda::normalize(convoluted, convoluted, 0, 1, NORM_MINMAX, CV_32F, noArray(), stream);
	cuda::threshold(convoluted, convoluted, thresold, 0.5, CV_THRESH_BINARY, stream);

	static GpuMat spectrumByte;
	convoluted.convertTo(spectrumByte, CV_8U, 255);

	static Mat contour = Mat::zeros(1080, 1920, CV_8U);
	spectrumByte(dstRoi).download(contour(srcRoi), stream);

	stream.waitForCompletion();
	return contour;
}