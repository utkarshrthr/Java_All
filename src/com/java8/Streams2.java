package com.java8;

import java.util.stream.IntStream;

public class Streams2 {
	public static void main(String[] args) {
		/*
		int[] numbers = {5, 1, 7, 3, 7, 8};
		
		IntSummaryStatistics statistics = IntStream.of(numbers).summaryStatistics();
		System.out.println(statistics.getSum());
		
		// find first 3 shortest elements
		
		IntStream.of(numbers)                   // create
				 .distinct().limit(3).sorted()  // process
				 .forEach(System.out::println); // consume
		
		*/
		
		// java 8 -> internal implementation of HashMap is BST, threshold ?
		// How many ways we create constants in Java ? final, Enums
		// TreeSet with StringBuffer OR StringBuilder
		// [1, 0, 1, 2, 0] -> [0, 0, 1, 1, 2]
		
		long start = System.currentTimeMillis();
		IntStream.range(1, Integer.MAX_VALUE).map(i -> i+1).count();
		long end = System.currentTimeMillis();
		System.out.println(end-start);
		
		start = System.currentTimeMillis();
		IntStream.range(1, Integer.MAX_VALUE).parallel().map(i -> i+1).count();
		end = System.currentTimeMillis();
		System.out.println(end-start);
	}
}
