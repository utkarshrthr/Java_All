package com.core.multithreading.threadgroup;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableI {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		CalculationJobs[] jobs = {
				new CalculationJobs(10),
				new CalculationJobs(9),
				new CalculationJobs(5),	
				new CalculationJobs(7)
			};
			ExecutorService service = Executors.newFixedThreadPool(2);
			for(CalculationJobs job: jobs) {
				Future<Integer> f =  service.submit(job);
				
				System.out.println(f.get());
			}
			service.shutdown();
	}
}

class CalculationJobs implements Callable<Integer> {

	private int nums;
	
	public CalculationJobs(int nums){
		this.nums = nums;
	}
	
	@Override
	public Integer call() {
		int sum = 0;
		
		for(int i=1;i<nums;i++) {
			sum +=i;
		}
		return sum;
	}
}