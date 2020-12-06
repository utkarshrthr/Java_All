package com.problemsolving;

import java.util.Arrays;

public class Sorting012 {

	public static void main(String[] args) {
		int[] ar = {0, 1, 1, 0, 2, 1, 2, 1};
		System.out.println(Arrays.toString(sort012(ar)));
	}

	private static int[] sort012(int[] ar) {
		int count0 = 0, count1 = 0, count2 = 0, counter = 0;
		for(int i:ar) {
			if(i==0)
				count0++;
			else if(i==1)
				count1++;
			else if(i==2)
				count2++;
		}
		for(int i=0;i<count0; i++, counter++) {
			ar[counter] = 0;
		}
		for(int i=0;i<count1; i++, counter++) {
			ar[counter] = 1;
		}
		for(int i=0;i<count2; i++, counter++) {
			ar[counter] = 2;
		}
		return ar;
	}
}
