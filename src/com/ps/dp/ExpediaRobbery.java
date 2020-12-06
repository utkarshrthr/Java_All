package com.ps.dp;

public class ExpediaRobbery {
	// Maximum sum such that no two elements are adjacent
	public static void main(String[] args) {
		int[] arr = {5, 5, 10, 100, 10, 5};
		System.out.println(getMax(arr));
	}
	
	private static int getMax(int[] ar) {
		return getMaxSum(ar, 0, 0);
	}
	
	private static int getMaxSum(int[] ar, int sum, int i) {
		if(i >= ar.length || i+1 >= ar.length) {
			System.out.println(sum);
			return sum;
		}
		return Math.max(getMaxSum(ar, sum+ar[i], i+2), getMaxSum(ar, sum+ar[i+1], i+3));
	}
}
