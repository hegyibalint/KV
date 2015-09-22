#pragma once

#include <thread>
#include <atomic>
#include <mutex>
#include <condition_variable>

template <class... TYPES>
class Filter {
	bool isDataAvailable = false;
	std::thread runner;
	std::mutex m;
	std::condition_variable fetchMonitor, publishMonitor;
	std::tuple<TYPES...> dataTuple;

	virtual void process() = 0;

	void loop() {
		while(true) {
			process();
			{
				std::unique_lock<std::mutex> lock(m);
				isDataAvailable = true;
				fetchMonitor.notify_one();
				publishMonitor.wait(lock, [this]{ return !isDataAvailable; });
			}
		}
	}

protected:
	template <int index, class TYPE = std::tuple_element<index, TYPES...>::type>
	void setData(TYPE data) {
		std::get<index>(dataTuple) = data;
	}

public:
	void start() {
		runner = std::thread(&Filter<TYPES...>::loop, this);
	}

	template <int index>
	cv::Mat getData() {
		std::unique_lock<std::mutex> lock(m);
		if (!isDataAvailable)
			fetchMonitor.wait(lock, [this]{ return isDataAvailable; });

		return std::get<index>(dataTuple);
	}

	void clearToProcess() {
		std::unique_lock<std::mutex> lock(m);
		isDataAvailable = false;
		publishMonitor.notify_all();
	}
};