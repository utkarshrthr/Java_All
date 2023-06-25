package com.problemsolving;

public class SecondLargestElement {

	public static void main(String[] args) {
		int[] arr = {5, 1, 2, 6, 3, 4, 9, 8};
		System.out.println(getSecondLargest(arr));
	}

	private static int getSecondLargest(int[] arr) {
		int max = arr[0];
		for(int i:arr) {
			if(i > max) {
				max = i;
			}
		}
		int secMax = arr[0];
		for(int i:arr) {
			if(i >= secMax && i<max) {
				secMax = i;
			}
		}
		return secMax;
	}
}
