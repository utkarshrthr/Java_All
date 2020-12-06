package com.core.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

/**
 * @author Utkarsh Rathore
 * 
 * SEMAPHORE: Semaphores are often used to restrict the number of threads than can access some (physical or logical) resource
 * 
 * Problem:  [Application(50 Threads)] ===> [Service(slow: can execute only 3 concurrent threads)] 
 * 
 * 
 * */

public class SemaphoreExample {
	
	public static void main(String[] args) {
	
		int cors = Runtime.getRuntime().availableProcessors();
		
		Semaphore semaphore = new Semaphore(3); // 3 -> permits, maximum no of threads that can access a given resource
		
		ExecutorService threadPool = Executors.newFixedThreadPool(50);	// Executors -> Factory and utility methods for Executor
		
		IntStream.of(100).forEach(i -> threadPool.execute(new Task(semaphore)));
		threadPool.shutdown();
		try {
			threadPool.awaitTermination(1, TimeUnit.MINUTES);
		} 
		catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
	
	static class Task implements Runnable {
		
		private Semaphore semaphore;
		Task(Semaphore semaphore){
			this.semaphore = semaphore;
		}
		
		@Override
		public void run() {
			// some processing 
            try {
				semaphore.acquire(); // 4th concurrent thread will be blocked here, this method throws InterruptedException, 
				// acquireUninterruptibly does not throw any error, both these methods have and overloaded form with no. of permits
			
				Thread.sleep(2000);
            }
            catch (InterruptedException e) {
				e.printStackTrace();
			}  
            // slow code
            
            semaphore.release();
            // rest of processing
		}
	}
}
