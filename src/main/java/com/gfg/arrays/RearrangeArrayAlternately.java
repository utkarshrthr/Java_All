package com.gfg.arrays;

import java.util.Arrays;

public class RearrangeArrayAlternately {

	public static void main(String[] args) {
		
		int ar[] = {1, 2, 3, 4, 5, 6, 7, 8};
		
		int[] arr = new int[ar.length];
		int n = ar.length-1;
		int k = 0;
		int i = 0;
		int j = 1;
		while(k<ar.length/2+1) {
			arr[i] = ar[n-k];
			arr[j] = ar[k];
			i+=2;
			j+=2;
			k++;
			
		}
		System.out.println(Arrays.toString(arr));
	}
}
