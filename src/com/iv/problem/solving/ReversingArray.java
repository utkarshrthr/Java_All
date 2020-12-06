package com.iv.problem.solving;

import java.util.Arrays;

public class ReversingArray {
	public static void main(String[] args) {
		int[] ar = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		reverseArray(ar);
		System.out.println(Arrays.toString(ar));
	}
	
	private static void reverseArray(int[] ar) {
		int st = 0; int en = ar.length-1;
		while(st < en) {
			int temp = ar[st];
			ar[st] = ar[en];
			ar[en] = temp;
			st++; en--;
		}
	}
}
