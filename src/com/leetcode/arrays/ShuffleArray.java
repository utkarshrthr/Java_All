package com.leetcode.arrays;

import java.util.Arrays;

public class ShuffleArray {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(getShuffledArray(new int[] {2, 5, 1, 3, 4, 7})));
	}

	private static int[] getShuffledArray(int[] ar) {
		for(int i = 1; i < ar.length-1; i++) {
			if(i < ar.length/2) {
				swap(ar, i+i, i);
			}
			else if(i-ar.length/2 != 0){
				swap(ar, i, i-ar.length/2);
			}
		}
		return ar;
	}
	
	private static void swap(int[] ar, int i, int j) {
		int temp = ar[i];
		ar[i] = ar[j];
		ar[j] = temp;
		System.out.println(Arrays.toString(ar));
	}
}
