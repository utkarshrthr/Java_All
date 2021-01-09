package com.algo.searching;

public class BinarySearch {
	
	public static void main(String[] args) {
		int[] arr = {1, 6, 17, 22, 28, 29, 33, 35};
		System.out.println(binarySearchIterative(arr, 17));
	}
	
	private static int binarySearchIterative(int[] ar, int element) {
		int st = 0;
		int en = ar.length;
		int mid = (st+en)/2;
		for(int i = st; i < en; i++) {
			if(element == ar[mid]) {
				return mid;
			}
			else if(element < ar[mid]) {
				en = mid;
				mid = (st+en)/2;
			}
			else {
				st = mid;
				mid = (st+en)/2;
			}
		}
		return -1;
	}
	
	private static int binarySearchRecursive(int[] arr, int element) {
		int len = arr.length;
		return search(arr, 0, len/2, len-1, element);
	}
	
	private static int search(int[] arr, int lo, int mid, int hi, int element) {
		if((mid == 0 || mid == hi) && ( arr[mid] != element)) {
			return -1;
		}
		if(arr[mid] == element) {
			return mid;
		}
		else if(arr[mid] > element) {
			return search(arr, lo, mid-1, mid, element);
		}
		else {
			return search(arr, mid, mid+1, hi, element); 
		}
	}
}