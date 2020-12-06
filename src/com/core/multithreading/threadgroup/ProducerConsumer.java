package com.core.multithreading.threadgroup;

import java.util.LinkedList;
import java.util.Queue;

public class ProducerConsumer implements Runnable {

	static Queue<Integer> queue = new LinkedList<>();

	public static void main(String[] args) {
		Thread producer = new Thread(new ProducerConsumer(), "Producer");
		producer.start();
		Thread consumer = new Thread(new ProducerConsumer(), "Consumer");
		consumer.start();
	}

	@Override
	public void run() {
		
	}
}
