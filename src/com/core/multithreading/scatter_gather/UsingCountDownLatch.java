package com.core.multithreading.scatter_gather;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class UsingCountDownLatch {
	
	public static void main(String[] args) {
		getPrices(12341);
	}
	
	private static Set<Integer> getPrices(int productId){

		ExecutorService service = Executors.newFixedThreadPool(4);
		
		CountDownLatch latch = new CountDownLatch(3);
		
		String url1 = "amazon.com";
		String url2 = "ebay.com";
		String url3 = "walmart.com";
		
		Set<Integer> prices = Collections.synchronizedSet(new HashSet<>());
		
		service.submit(new Task(url1, productId, prices, latch));    
		service.submit(new Task(url2, productId, prices, latch));
		service.submit(new Task(url3, productId, prices, latch));

		try {
			latch.await(3, TimeUnit.SECONDS);
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
		private CountDownLatch latch;
		
		public Task(String url, int productId, Set<Integer> prices, CountDownLatch latch) {
			this.url = url;
			this.productId = productId;
			this.prices = prices;
			this.latch = latch;
		}

		@Override
		public Integer call() throws Exception {
			int price = 0;
			// send N http requests, get price from external service
		    prices.add(price); // all the prices added after 3 seconds will be ignored
			latch.countDown();
		    return price;
		}
	}
}
