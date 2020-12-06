package com.ps.dp;

public class Fibbonacci {

	public static void main(String[] args) {
		// 0  1  1  2  3  5	 8	13	21	34	55
		fibbonacciRecursive(10);
	}

	private static void fibbonacci(int n) {
		int a=0,b=1, c = 0;
		for(int i=0;i<n;i++) {
			System.out.print(c+" ");
			c=a+b;
			a = b;
			b = c;
		}
	}
	
	private static int fibbonacciRecursive(int n) {
		System.out.print(n + " ");
		if(n==0) {
			return 0;
		}
		else if(n==1) {
			return 1;
		}
		return fibbonacciRecursive(n-1) + fibbonacciRecursive(n-2);
	}
}

