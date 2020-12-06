package com.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Streams {
/**
 * What is Stream?
 * What is the need of stream when we already have collections?
 * Pipelining
 * 
 * */
	
	public static void main(String[] args) {
		int x = 1_00_00_00;
		
		List<Integer> list = Arrays.asList(10, 12, 11, 34, 4, 7, 3, 9, 1, 7, 6, 2, 5);
	 
		List<List<Integer>> nested = new ArrayList<>();
		nested.add(Arrays.asList(10, 12, 11, 34));
		nested.add(Arrays.asList(1, 7, 6, 2));
		nested.add(Arrays.asList(4, 7, 3, 9));
		nested.add(Arrays.asList(5, 13, 15, 17)); 
		
		boolean isAllEven = list.stream().allMatch(a -> a%2==0); // returns true if all the elements of this stream satisfy the given predicate
		
		boolean has13 = list.stream().anyMatch(a -> a == 13); // Returns true if any element of this stream match the provided predicate.
		
		long count = list.stream().count();	
		
		int any = list.stream().findAny().get();	// findAny returns Optional
		
		int first = list.stream().findFirst().get();	// findFirst returns Optional
		
		list.stream().distinct().forEach(i -> System.out.print(i+ " "));
		System.out.println();
		
		Arrays.deepToString(list.stream().toArray());
		
		List<String> vowels = Arrays.asList("a", "e", "i", "o", "u");
		
		Set<String> set = vowels.stream().collect(Collectors.toSet());
		System.out.println(set);
		
		//vowels.stream().
	}
}
