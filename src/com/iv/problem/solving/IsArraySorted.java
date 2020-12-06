package com.iv.problem.solving;

public class IsArraySorted {

	public static void main(String[] args) {
		//int[] ar = {1,3,2,5,4};
		int[] ar = {1,2,3,4,5};
		//System.out.println(isSorted(ar));
		System.out.println(isSorted(ar, 0, 1));
	}
	
	// Using LOOP
	public static boolean isSorted(int[] ar) {
		for(int i=0;i<ar.length-1;i++) {
			if(ar[i]>ar[i+1]) return false;
		}
		return true;
	}
	
	// Using Recursion
	public static boolean isSorted(int[] ar, int i, int j) {
		if(j>=ar.length) return true;
		if(ar[i]>ar[j]) return false;
		return isSorted(ar, i+1, j+1);
	}

}
