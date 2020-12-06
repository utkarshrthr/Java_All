package com.core.multithreading.producer_consumer;

public class Producer extends Thread {

	@Override
	public void run() {
		while(true) {
			synchronized (DataQueue.class) {
				if(DataQueue.SIZE == DataQueue.CAPACITY) {
					System.err.println("Queue is full. Blocking producer thread.");
					try {
						DataQueue.class.wait();
					} 
					catch (InterruptedException e) { }
				}
				else {
					/*if(DataQueue.SIZE  > DataQueue.CAPACITY) {throw new QueueOverflowException("Producer is trying to push into in filled queue"); }*/
					DataQueue.SIZE++;
					try {
						Thread.sleep(2000);
					} 
					catch (InterruptedException e) { }
					System.out.println("Pushing into Data-Queue: Capacity: "+DataQueue.SIZE);
					DataQueue.class.notify();
				}
			}
		}
	}
}
