package com.algo.sorting;

import java.util.Arrays;

import com.util.Generator;

public class SelectionSort {
	
	public static int[] selectionSort(int[] arr) {
		System.out.println("Sorting array using SELECTION sort");
		int mini;
		for(int i = 0; i< arr.length; i++) {
			mini = i;
			for(int j = i+1; j<arr.length;j++) {
				if(arr[j]<arr[mini]) {
					mini = j;
				}
			}
			if(mini != i) {
				int temp = arr[mini];
				arr[mini] = arr[i];
				arr[i] = temp; 
			}
		}
		return arr;
	}
	
	public static void main(String[] args) {
		int[] arr = Generator.generateArray(10);
		arr = selectionSort(arr);
		System.out.println(Arrays.toString(arr));
	}
}
