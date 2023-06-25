package com.core.multithreading.producer_consumer;

public class Processor {
	
	public static void main(String[] args) {
		Consumer consumerThread = new Consumer();
		consumerThread.start();
		
		Producer producerThread = new Producer();
		producerThread.start();
		
	}
}
