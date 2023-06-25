package com.gfg.arrays;
/**
 * 
 * @author Utkarsh Rathore
 *
 * Largest Sum Contiguous Subarray
 */
public class KadaneAlgorithm {
	
	public static void main(String[] args) {
		int[] ar = {1,2,3,-2,5};
		int max_so_far = Integer.MIN_VALUE, max_ending_here = 0; 
	    for (int i = 0; i < ar.length; i++) { 
	    	max_ending_here = max_ending_here + ar[i]; 
	    	if (max_so_far < max_ending_here) 
	    		max_so_far = max_ending_here; 
	    	if (max_ending_here < 0) 
	    		max_ending_here = 0; 
	    } 
	}
}
