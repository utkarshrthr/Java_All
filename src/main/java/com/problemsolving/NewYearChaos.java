package com.problemsolving;

import java.util.Arrays;

public class NewYearChaos {

	public static void main(String[] args) {
		int[] ar = {1, 2, 5, 3, 7, 8, 6, 4};
		int maxElement = ar.length;
		int maxIndex = ar.length-1;
		int indexOfMax = 0;
		int bribes = 0;
		
		while(maxElement>1) {
			if(ar[maxIndex] != maxElement) {
				// find index of maximum element
				int i = 0;
				while(i < maxIndex) {
					if(ar[i]==maxElement) {
						indexOfMax = i;
						break;
					}
					i++;
				}
				if((maxIndex - indexOfMax) > 2) {
					System.out.println("Too chaotic");
				}
				bribes += (Math.abs(ar[maxIndex] - ar[indexOfMax]));
				int temp = ar[maxIndex];
				ar[maxIndex] = ar[indexOfMax];
				ar[indexOfMax] = temp;
			}
			maxElement--;
			maxIndex--;
		}	
		System.out.println(Arrays.toString(ar));
		System.out.println(bribes);
	}
	
	private static int getMinimumBribes(int[] ar) {
		int bribes = 0;
		return bribes;
	}
}
