package com.problemsolving;

import java.util.Arrays;

public class ArrayRotation {

	public static void main(String[] args) {
		int[] ar = {1, 2, 3, 4, 5, 6, 7};
		rotate(ar, 2, ar.length);
		System.out.println(Arrays.toString(ar));
	}
	
	private static void rotate(int[] ar, int n) {
		for(int i = 0; i< n; i++) {
			int temp = ar[0];
			for(int j = 0; j < ar.length-1; j++) {
				ar[j] = ar[j+1];
			}
			ar[ar.length-1] = temp;
		}
	} 
	
	// REVERSAL ALGORTIHM
	
	private static void rotate(int[] ar, int n, int len) {
		// r = n
		// Ar Reversal
		int st = 0; 
		int en = n-1;
		while(st<en) {
			swap(ar, st, en);
			st++;
			en--;
		}
		// Br Reversal
		st = n+1;
		en = len-1;
		while(st<en) {
			swap(ar, st, en);
			st++;
			en--;
		}
		// ArBr Reversal
		st = 0;
		en = len-1;
		while(st<en) {
			swap(ar, st, en);
			st++;
			en--;
		}
	}
	private static void swap(int[] ar, int i, int j) {
		int temp = ar[i];
		ar[i] = ar[j];
		ar[j] = temp;
	}
}
