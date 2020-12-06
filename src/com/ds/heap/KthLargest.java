package com.ds.heap;

import java.util.Arrays;

public class KthLargest {

	public static void main(String[] args) {
		int[] ar = {12, 11, 13, 5, 6, 7};
		heapSort(ar);
		System.out.println(Arrays.toString(ar));
	}
	
	private static void heapSort(int[] ar) {
		heapify(ar, 0, ar.length);
		int last = ar.length -1;
		for(int i = 1; i < ar.length; i++) {
			heapify(ar, i, last);
		}
	}
	
	private static void heapify(int[] ar, int currentIndex, int last) {
		int left = 2 * currentIndex + 1; 
		int right = 2 * currentIndex + 2;
		if(left < last && ar[left] > ar[currentIndex]) { // 11 > 12
			swap(ar, currentIndex, left);
			currentIndex = left;
		}
		if(right < last && ar[right] > ar[currentIndex]) { // 13 > 12
			swap(ar, currentIndex, right);
			currentIndex = right;
		}
		if(currentIndex < last && (currentIndex == left || currentIndex == right)) {
			heapify(ar, currentIndex, last);
		}
	}
	
	private static void swap(int[] ar, int index1, int index2) {
		int temp = ar[index1];
		ar[index1] = ar[index2];
		ar[index2] = temp;
	}
}
