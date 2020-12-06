package com.core.multithreading.producer_consumer;

public class Consumer extends Thread {

	@Override
	public void run() {
		while(true) {
			synchronized (DataQueue.class) {
				if(DataQueue.SIZE == 0) {
					try {
						System.err.println("Queue is empty. Blocking consumer thread.");
						DataQueue.class.wait();
					} 
					catch (InterruptedException e) { }
				}
				else {
					DataQueue.SIZE--;
					System.out.println("Consuming from Data-Queue: Capacity: "+DataQueue.SIZE);
					try {
						Thread.sleep(2000);
					} 
					catch (InterruptedException e) { }
					DataQueue.class.notify();
				}
				/* if(DataQueue.SIZE < 0) { throw new QueueUnderflowException("Comsumer is trying to consume from an empty queue"); } */
			}
		}
	}
}
