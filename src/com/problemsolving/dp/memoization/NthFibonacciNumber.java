package com.problemsolving.dp.memoization;

import java.util.HashMap;
import java.util.Map;

public class NthFibonacciNumber {
	// n   -> 1, 2, 3, 4, 5, 6,  7,  8,  9 
	// fib -> 1, 1, 2, 3, 5, 8, 13, 21, 34
	
	private static int callStackCount = 0;
	public static void main(String[] args) {
		System.out.println(getNthFibonacci(9));
		System.out.println(callStackCount);
	}
	
	/* private static int getNthFibonacci(int n) {
		callStackCount++;
		if(n <= 0)
			return -1;
		int prev = 0;
		int next = 1;
		return getNthFibonacci(n, 1, prev, next);
	}
	
	private static int getNthFibonacci(int n, int i, int prev, int next) {
		callStackCount++;
		if(n == i)
			return next;
		else 
			return getNthFibonacci(n, i+1, next, (prev+next));
	} */
	
	/* private static int getNthFibonacci(int n) {	
		// Time-complexity -> O(2^n)
		// Space-complexity -> O(n)
		callStackCount++;
		if(n <= 0)
			return -1;
		if(n <= 2)
			return 1;
		else return getNthFibonacci(n-1) + getNthFibonacci(n-2);
	} */
	
	// USING MEMOIZATION
	
	private static Map<Integer, Integer> memoizeTable = new HashMap<>();
	
	private static int getNthFibonacci(int n) {	
		callStackCount++;
		if(n <= 0)
			return -1;
		if(n <= 2)
			return 1;
		if(memoizeTable.containsKey(n)) {
			return memoizeTable.get(n);
		}
		memoizeTable.put(n, getNthFibonacci(n-1) + getNthFibonacci(n-2));
		return memoizeTable.get(n);
	}
}

// DYNAMIC PROGRAMMING -> is a pattern of overalapping sub-problems
