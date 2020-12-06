package com.algo.sorting;

import java.text.MessageFormat;
import java.util.Arrays;

public class QuickSort {

	public static int[] quickSort(int[] arr) {
		System.out.printf(MessageFormat.format("Sorting array: {0} using QUICK sort\n", Arrays.toString(arr)));
		quickSort(arr, 0, arr.length-1);
		return arr;
	}
	
	public static void quickSort(int[] arr, int low, int high) {
		int pi = partition(arr, low, high);
		if(low<pi-1) {
			quickSort(arr, low, pi-1);
		}
		if(pi<high) {
			quickSort(arr, pi, high);
		}
	}
	
	public static int partition(int[] arr, int low, int high) {
		int pivot = arr[arr.length/2];
		while(low<=high) {
			while(arr[low]<pivot) {
				low++;
			}
			while(pivot<arr[high]) {
				high--;
			}
			if(low<=high) {
				int temp = arr[low];
				arr[low] = arr[high];
				arr[high] = temp;
				low++;
				high--;
			}
		}
		return low;
	}
	
	public static void main(String[] args) {
		int[] arr = {5, 3, 1, 4, 2};
		arr = quickSort(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	
	
}
