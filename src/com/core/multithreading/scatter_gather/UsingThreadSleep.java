package com.core.multithreading.scatter_gather;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 	Suppose we have price-comparison application, 
 *	product <----> [Application] <===> [Amazon, EBay, Walmart]
 *	Write a program(using threads) to retrieve prices from N resources. There may be a possibility that one or more resources are not 
 *	available, in that case wait for a maximum 3 seconds. 
 *	Solution.) Break down the problem: 1. Trigger N tasks, 2. Add timeout, 3. Wait for N tasks. 
 * 
 * */
public class UsingThreadSleep {
	
	public static void main(String[] args) {
		getPrices(12341, 4);
	}
	
	private static Set<Integer> getPrices(int productId, int poolSize){

		ExecutorService service = Executors.newFixedThreadPool(poolSize);
		
		String url1 = "amazon.com";
		String url2 = "ebay.com";
		String url3 = "walmart.com";
		
		Set<Integer> prices = Collections.synchronizedSet(new HashSet<>());
		
		service.submit(new Task(url1, productId, prices));    
		service.submit(new Task(url2, productId, prices));
		service.submit(new Task(url3, productId, prices));

		try {
			Thread.sleep(3000);
		} 
		catch (InterruptedException e) {
			e.printStackTrace();
		}
		return prices;
	}
	
	static class Task implements Callable<Integer> {

		private String url;
		private int productId;
		private Set<Integer> prices;
		
		public Task(String url, int productId, Set<Integer> prices) {
			this.url = url;
			this.productId = productId;
			this.prices = prices;
		}

		@Override
		public Integer call() throws Exception {
			int price = 0;
			// send N http requests, get price from external service
		    prices.add(price); // all the prices added after 3 seconds will be ignored
			return price;
		}
	}
}
