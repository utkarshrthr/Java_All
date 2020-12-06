package com.core.multithreading.scatter_gather;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class UsingCompletableFuture {

	public static void main(String[] args) {
		getPrices(12341);
	}
	// invokeAll(Collection<? extends Callable<T>> tasks, long timeout, TimeUnit unit)
	// UsingScheduledExecutorService
	private static Set<Integer> getPrices(int productId){

		String url1 = "amazon.com";
		String url2 = "ebay.com";
		String url3 = "walmart.com";
		
		Set<Integer> prices = Collections.synchronizedSet(new HashSet<>());
		
		CompletableFuture<Void> task1 = CompletableFuture.runAsync(new Task(url1, productId, prices));
		CompletableFuture<Void> task2 = CompletableFuture.runAsync(new Task(url2, productId, prices));
		CompletableFuture<Void> task3 = CompletableFuture.runAsync(new Task(url3, productId, prices));
		
		CompletableFuture<Void> alltaks = CompletableFuture.allOf(task1, task2, task3);
		try {
			alltaks.get(3, TimeUnit.SECONDS);	// wait for all 3 tasks to complete
		} 
		catch (InterruptedException | ExecutionException | TimeoutException e) {
			System.err.println(e.getMessage());
		}
		
		return prices;
	}
	
	static class Task implements Runnable {

		private String url;
		private int productId;
		private Set<Integer> prices;
		
		public Task(String url, int productId, Set<Integer> prices) {
			this.url = url;
			this.productId = productId;
			this.prices = prices;
		}

		@Override
		public void run() {
			int price = 0;
			// send N http requests, get price from external service
		    prices.add(price); // 
		}
		// CompletableFuture is marked completed after the execution of run-method
	}
}
