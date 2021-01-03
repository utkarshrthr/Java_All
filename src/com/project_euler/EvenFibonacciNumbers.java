package com.project_euler;

public class EvenFibonacciNumbers {

	public static void main(String[] args) {
		System.out.println(getSumOfEvenFibonacciNumbers());
	}
	
	private static int getSumOfEvenFibonacciNumbers() {
		int sum = 0;
		int max = 40_00_000;
		int a = 0;
		int b = 1;
		int c = a + b;
		while(c < max) {
			if(c % 2 == 0) {
				sum += c;
			}
			a = b;
			b = c;
			c = a + b;
		}
		return sum;
	}
}
