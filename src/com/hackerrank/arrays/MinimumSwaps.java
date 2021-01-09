package com.hackerrank.arrays;

public class MinimumSwaps {
	public static void main(String[] args) {
		int[] ar = {2, 3, 4, 1, 5};
		System.out.println(minimumSwaps(ar));
	}
	
	private static int minimumSwaps(int[] ar) {
        int i=1;
        int count = 0;
        while(i<ar.length) {
            if(i > -1 && ar[i-1]!=i) {
                count++;
                swap(ar, i-1, i);
                i--;
            }
            else i++;
        }
        return count;
    }
	
	private static void swap(int ar[], int i, int j) {
		int temp = ar[i];
		ar[i] = ar[j];
		ar[j] = temp;
	}
}
