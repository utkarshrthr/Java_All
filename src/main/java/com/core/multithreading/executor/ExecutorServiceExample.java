package com.core.multithreading.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ExecutorServiceExample {
	public static void main(String[] args) {
		
		int processors = Runtime.getRuntime().availableProcessors();
		System.out.println(processors);
		
		// Suppose we have to run 1000 tasks
		
		ExecutorService pool = Executors.newFixedThreadPool(10);
		
		ExecutorService cachedPool = Executors.newCachedThreadPool(); // useful for many short-lived asynchronous task
		
		ScheduledExecutorService scheduledPool = Executors.newScheduledThreadPool(10);
		
		scheduledPool.schedule(new Task(1), 10, TimeUnit.SECONDS);	// task to run after 10 seconds delay

		scheduledPool.scheduleAtFixedRate(new Task(1), 15, 10, TimeUnit.SECONDS); // task to run repeatedly after 10 seconds with 15 seconds initial delay
		
		scheduledPool.scheduleWithFixedDelay(new Task(1), 10, 10, TimeUnit.SECONDS);
		
		for(int i = 100; i< 200; i++) {
			pool.execute(new Task(i));
		}
	}
	
	
	static class Task implements Runnable {

		private int taskId;
		
		public Task(int taskId) {
			this.taskId = taskId;
		}
		
		@Override
		public void run() {
			try {
				Thread.sleep(1000);
			} 
			catch (InterruptedException e) { e.printStackTrace(); }
			System.out.println(Thread.currentThread().getName() + " is executing Task(id): "+taskId);
		}
	}
}
