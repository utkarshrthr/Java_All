package com.hackerrank.arrays;

import java.util.Arrays;

public class ArrayRotation {

	public static void main(String[] args) {
		int ar[] = {1, 2, 3, 4, 5};
		System.out.println(Arrays.toString(ar));
		rotateL(ar, 2);
		System.out.println(Arrays.toString(ar));
	}
	
	/*	
	 * // In this solution, the element are placed at the right position while read from input 
		for(int i = 0; i < lengthOfArray; i++){
    		int newLocation = (i + (lengthOfArray - shiftAmount)) % lengthOfArray;
    		a[newLocation] = in.nextInt();
		}
	 */
	

	private static void rotateL(int[] ar, int rotations) {
		int[] tempAr = new int[rotations];
		for(int i = 0; i < rotations; i++) {
			tempAr[i] = ar[i];
		}
		for(int i = 0; i < (ar.length - rotations); i++) {
			ar[i] = ar[i+rotations];
		}
		for(int i = (ar.length - rotations); i < ar.length; i++) {
			ar[i] = tempAr[i-(ar.length - rotations)];
		}
	}
	
	private static void rotateR(int[] ar, int rotations) {
		int[] tempAr = new int[rotations];
		for(int i = 0; i < rotations; i++) {
			tempAr[i] = ar[i];
		}
		for(int i = 0; i < (ar.length - rotations); i++) {
			ar[i] = ar[i+rotations];
		}
		for(int i = (ar.length - rotations); i < ar.length; i++) {
			ar[i] = tempAr[i-(ar.length - rotations)];
		}
	}
	
	// BRUTE-FORCE APPROACH => O(1) space, O(ar.length * rotations) time
	private static void rotateLeft(int[] ar, int rotations) {
		if(rotations <= 0)
			return;
		
		for(int i = 0; i < rotations; i++) {
			int temp = ar[0];
			for(int j = 1; j < ar.length; j++) {
				ar[j-1] =  ar[j];
			}
			ar[ar.length-1] = temp;
		}
	}
	
	private static void rotateRight(int[] ar, int rotations) {
		if(rotations <= 0)
			return;
		
		for(int i = 0; i < rotations; i++) {
			int temp = ar[ar.length-1];
			for(int j = ar.length-1; j > 0; j--) {
				ar[j] =  ar[j-1];
			}
			ar[0] = temp;
		}
	}
}
