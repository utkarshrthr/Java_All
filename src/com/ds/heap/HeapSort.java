package com.ds.heap;

import java.util.Arrays;

public class HeapSort {

	public static void main(String[] args) {
		int[] arr = {5,1,3,2,4};
		heapSort(arr);
	}
	// using heap to sort the element in ascending/descending order
	// we receive the input array, convert it into heap (this can be done in place, so no extra memory space needed)
	// we will use max-heap (where largest element at root node)
	
	
	private static void heapSort(int[] ar) {
		heapify(ar);
		int endInd = ar.length-1;
		while (endInd >0) {
			swap(ar, 0, endInd);
			endInd--;
			siftDown(ar, 0);
		}
		System.out.println(Arrays.toString(ar));
	}
	
	private static void heapify(int[] ar) {
		// get parent node of last element
		int parentIndex = (ar.length-2)/2;
		while(parentIndex >=0) {
			siftDown(ar, parentIndex);
			parentIndex--;
		}
	}
	
	private static void siftDown(int[] ar, int ind) {
		int leftChildInd = 2*ind+1;
		int rightChildInd = 2*ind+2;
		if(leftChildInd <ar.length  && ar[leftChildInd] > ar[ind]) {
			swap(ar, leftChildInd, ind);
			siftDown(ar, leftChildInd);
		}
		if(rightChildInd <ar.length  && ar[rightChildInd] > ar[ind]) {
			swap(ar, rightChildInd, ind);
			siftDown(ar, rightChildInd);
		}
	}
	
	private static void swap(int[] ar, int ind1, int ind2) {
		int temp = ar[ind1];
		ar[ind1] = ar[ind2];
		ar[ind2] = temp;
	}
}
