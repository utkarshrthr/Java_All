package com.project_euler;

public class LargestPrimeFactor {

	public static void main(String[] args) {
		System.out.println(getLargestPrimeFactor(600851475143l));
	}
	
	private static int getLargestPrimeFactor(long n) {
		if(n == 2) {
			return 2;
		}
		int maxFactor = 1;
		for(int i = 3; i < Math.sqrt(n); i++) {  // Math.sqrt
			if(i % 2 != 0 && i % 3 != 0 && i % 5 != 0 && n % i == 0 && isPrime(i) && i > maxFactor) {
				maxFactor = i;
			}
		}
		return maxFactor;
	}
	
	private static boolean isPrime(int n) {
		for(int i = 2; i< n; i++) {
			if(n % i == 0) {
				return false;
			}
		}
		return true;
	}
}
