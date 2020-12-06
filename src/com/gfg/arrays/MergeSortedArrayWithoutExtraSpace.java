package com.gfg.arrays;

import java.util.Arrays;

public class MergeSortedArrayWithoutExtraSpace {
	public static void main(String[] args) {
		 
		
		// Rearrange Array Alternately 
		int[] ar = {1, 2, 3, 4, 5, 6};
		int i = 0; 
		int j = ar.length-1;
		while(i<j) {
			int max = ar[j];
			int min = ar[i];
			ar[i] = max;
			i++;
			int temp = ar[i];
			ar[i] = min;
			ar[j] = temp;
			j--;
		}
		System.out.println(Arrays.toString(ar));
	}
}
