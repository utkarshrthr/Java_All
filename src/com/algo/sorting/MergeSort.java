package com.algo.sorting;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		int[] ar = {48, 36, 13, 52, 19, 94, 21};
		mergeSort(ar, 0, ar.length-1);
		System.out.println(Arrays.toString(ar));
	}
	
	
	public static void mergeSort(int[] ar, int start, int end) {
		int mid = (start+end)/2;
		if(start<end) {
			mergeSort(ar, start, mid);
			mergeSort(ar, mid + 1, end);
		}
		int i = 0, first = start, last = mid + 1;
	    int[] tmp = new int[end - start + 1];

	    while (first <= mid && last <= end) {
	    	if(ar[first] < ar[last]) {
	    		tmp[i] = ar[first];
	    		first++;
	    	}
	    	else {
	    		tmp[i] = ar[last];
	    		last++;
	    	}
	    	i++;
	    }
	    while (first <= mid) {
	      tmp[i] = ar[first];
	      i++;
	      first++;
	    }
	    while (last <= end) {
	      tmp[i] = ar[last];
	      i++;
	      last++;
	    }
	    i = 0;
	    while (start <= end) {
	      ar[start] = tmp[i];
	      i++;
	      start++;
	    }
	}
	
	
	private static void sort(int[] ar) {
		divideArray(0, ar.length-1, ar);
	}
	
	public static void divideArray(int lo, int hi, int[] ar) {
		if(lo < hi) {
			int mid = lo + (hi-lo)/2;
			divideArray(lo, mid, ar);
			divideArray(mid+1, hi, ar);
			merge(ar, lo, mid, hi);
		}
	}
	
	static void  merge(int arr[], int lo, int mid, int hi) { 
        // Find sizes of two sub-arrays to be merged 
        int n1 = mid - lo + 1; 
        int n2 = hi - mid; 
  
        /* Create temp arrays */
        int L[] = new int[n1]; 
        int R[] = new int[n2]; 
  
        /*Copy data to temp arrays*/
        for (int i = 0; i < n1; ++i) 
            L[i] = arr[lo + i]; 
        for (int j = 0; j < n2; ++j) 
            R[j] = arr[mid + 1 + j]; 
  
        /* Merge the temp arrays */  
        // Initial indexes of first and second subarrays 
        int i = 0, j = 0; 
  
        // Initial index of merged subarry array 
        int k = lo; 
        while (i < n1 && j < n2) { 
            if (L[i] <= R[j]) { 
                arr[k] = L[i]; 
                i++; 
            } 
            else { 
                arr[k] = R[j]; 
                j++; 
            } 
            k++; 
        } 
  
        /* Copy remaining elements of L[] if any */
        while (i < n1) { 
            arr[k] = L[i]; 
            i++; 
            k++; 
        } 
  
        /* Copy remaining elements of R[] if any */
        while (j < n2) { 
            arr[k] = R[j]; 
            j++; 
            k++; 
        } 
    } 
}
