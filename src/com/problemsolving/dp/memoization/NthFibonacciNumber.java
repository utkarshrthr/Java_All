package com.problemsolving.dp.memoization;

public class NthFibonacciNumber {
	// n   -> 1, 2, 3, 4, 5, 6,  7
	// fib -> 1, 1, 2, 3, 5, 8, 13
	public static void main(String[] args) {
		System.out.println(getNthFibonacci(9));
	}
	
	private static int getNthFibonacci(int n) {
		if(n <= 0)
			return -1;
		int prev = 0;
		int next = 1;
		return getNthFibonacci(n, 1, prev, next);
	}
	
	private static int getNthFibonacci(int n, int i, int prev, int next) {
		if(n == i)
			return next;
		else 
			return getNthFibonacci(n, i+1, next, (prev+next));
	}
}
