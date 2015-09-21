#pragma once

#include <thread>
#include <atomic>
#include <mutex>
#include <condition_variable>

template <typename DATA>
class Filter {
	bool ready = false;
	std::thread runner;
	std::mutex m;
	DATA data;

	virtual void process() = 0;

	void loop() {
		while(true) {
			process();
		}
	}

protected:
	void setData(DATA& data) {
		std::unique_lock<std::mutex> lock(m);
		this->data = data;
		ready = true;
	}

public:
	void start() {
		runner = std::thread(&Filter<DATA>::loop, this);
	}

	DATA getData() {
		while (!ready) { }
		{	
			std::unique_lock<std::mutex> lock(m);
			return data;
		}
	}
};