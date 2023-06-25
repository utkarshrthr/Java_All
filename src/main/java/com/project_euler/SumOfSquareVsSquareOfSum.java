package com.project_euler;

public class SumOfSquareVsSquareOfSum {

	public static void main(String[] args) {
		System.out.println(sumSquareDifference(100));
	}

	private static long sumSquareDifference(int n) {
		long sumOfSquare = (n*(n+1))/2;
		sumOfSquare *= sumOfSquare;
		long squareOfSum = (n*(n+1)*(2*n+1))/6;
		return sumOfSquare- squareOfSum;
	}
}

// n(n+1) / 2 -> sum of first 'n' natural numbers
// [n(n+1)(2n+1)]/6 -> sum of squares of first 'n' natural numbers