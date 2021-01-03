package com.project_euler;

public class MultiplesOf3And5 {

	public static void main(String[] args) {
		System.out.println(getSumOf3And5Multiples(1000));
	}

	private static int getSumOf3And5Multiples(int n) {
		int sum = 0;
		for(int i = 1; i < n; i++) {
			if(i % 15 == 0 || i % 3 == 0 || i % 5 == 0 ) {
				sum+=i;
			}
		}
		return sum;
	}
}
