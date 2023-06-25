package com.algo.sorting;

import java.text.MessageFormat;
import java.util.Arrays;

import com.util.Generator;

public class InsertionSort {
	
	public static int[] insertionSort(int[] ar) {
		System.out.printf(MessageFormat.format("Sorting array: {0} using INSERTION sort\n", Arrays.toString(ar)));
		//System.out.printf(String.format("Sorting array: %s using INSERTION sort\n", Arrays.toString(arr)));
		// [4, 3, 5, 2, 1];
		for(int i = 0; i < ar.length-1; i++) {
			int key = ar[i+1];	// start from first element
			int j = i;
			while(j >= 0 && ar[j] > key) {
				ar[j+1] = ar[j];
				j--;
			}
			ar[j+1] = key;
		}
		return ar;
	}

	public static int[] insertionSortRecursive(int[] ar) {
		System.out.printf(MessageFormat.format("Sorting array: {0} using INSERTION sort\n", Arrays.toString(ar)));
		 
		return ar;
	}
	
	public static void main(String[] args) {
		int[] arr = Generator.generateArray(5);
		arr = insertionSort(new int[]{4, 3, 5, 2, 1});
		System.out.println(Arrays.toString(arr));
	}
}
