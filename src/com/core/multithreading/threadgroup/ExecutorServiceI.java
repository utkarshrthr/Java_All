package com.core.multithreading.threadgroup;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorServiceI {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		// 50 task -> 
		
		// BlockingQueue -> [task2, task1, task3, task4, task5, task6]
		
		// Executor Framework 
		
		// avoid unnecessary thread creation
		
		PrintJobs[] jobs = {
			new PrintJobs("Magazine"),
			new PrintJobs("Ledgers"),
			new PrintJobs("Newspaper"),	
			new PrintJobs("Digest")
		};
		
		ExecutorService service = Executors.newFixedThreadPool(3); // 
		
		service = Executors.newCachedThreadPool(); // 1, 2, 3, 4, 5, 6, 60 seconds -> kill thread
		
		for(PrintJobs job: jobs) {
			Future<String> f = service.submit(job);
			System.out.println(f.get());
		}
		service.shutdown();
	}
}

class PrintJobs implements Callable<String> {

	private String name;
	
	public PrintJobs(String name){
		this.name = name;
	}
	
	@Override
	public String call() throws Exception {
		System.out.println("Job : "+ name + " started by thread: " + Thread.currentThread().getName());
		try {
			Thread.sleep(2000);
		} 
		catch (InterruptedException e) {}
		//System.out.println("Job : "+ name + " completed by thread: " + Thread.currentThread().getName());
		return name + " is completed by  " +Thread.currentThread().getName();
	}
}