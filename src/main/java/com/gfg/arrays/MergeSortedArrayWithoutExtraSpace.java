package com.gfg.arrays;

import java.util.Arrays;

public class MergeSortedArrayWithoutExtraSpace {

	public static void main(String[] args) {
		int[] a = {1, 3, 5, 7};
		int[] b = {0, 2, 6, 8, 9};
		mergeSorted(a, b);
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		Arrays.parallelSort(a);
	}
	private static void mergeSorted(int[] a, int[] b) {	// TIME LIMIT EXCEEDED
		int n = a.length; 
		int m = b.length;
		int len = n + m;
		for(int i = 0; i < len; i++) {
			for(int j = 0; j < len; j++) {
				if(j < n) {
					 
				}
				else {
					 
				}
			}
		}
	}
	
	/*private static void mergeSorted(int[] a, int[] b) {	// TIME LIMIT EXCEEDED
		int i = a.length-1;
		int j = 0;
		while(i>0 && j < b.length) {
			if(a[i] > b[j]) {
				int temp = a[i];
				a[i] = b[j];
				b[j] = temp;
				Arrays.sort(a);
				Arrays.sort(b);
			}
			else {
				i--;
				j++;
			}
		}
	} */
	
	/*private static void mergeSorted(int[] a, int[] b) {	// TIME LIMIT EXCEEDED
		int i = 0;
		int j = 0;
		boolean flag = false;
		while(j< b.length) {
			while(i<a.length) {
				if(a[i]>b[j]) {
					int temp = a[i];
					a[i] = b[i];
					b[i] = temp;
					flag = true;
				}
				if(flag) {
					i++;
					flag = false;
				}
			}
			j++;
		}
		Arrays.sort(b);
	}
	*/
}
