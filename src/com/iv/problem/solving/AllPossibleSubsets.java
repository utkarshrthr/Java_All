package com.iv.problem.solving;

public class AllPossibleSubsets {

	public static void main(String[] args) {
		int[] ar = {1, 2, 3, 4, 5};
		// number of subsets (including {}) = 2^n-1
		// {0, 0, 0, 0} -> [0 0 0 0] -> {} empty set
		// {1, 2, 3, 4} -> [1 1 1 1] -> all elements presents,
		// following above approach, we need to generate all binary numbers from 0 to 2^n-1
		
		System.out.println(4<<2|10);
		System.out.println(1<<1);
		System.out.println(1<<2);
		System.out.println();
		System.out.println();
		System.out.println();
		
		
		int n = 3, k = 2; 
	    System.out.print("Kth bit set number = " +  
	                             setKthBit(n, k)); 
	    
	    //int n = set.length; 
	    
        // Run a loop for printing all 2^n 
        // subsets one by one 
        for (int i = 0; i < (1<<n); i++) 
        { 
            System.out.print("{ "); 
  
            // Print current subset 
            for (int j = 0; j < n; j++) 
  
                // (1<<j) is a number with jth bit 1 
                // so when we 'and' them with the 
                // subset number we get which numbers 
                // are present in the subset and which 
                // are not 
                if ((i & (1 << j)) > 0) 
                    System.out.print(i + " " + (1 << j)); 
  
            System.out.println("}"); 
        } 
	}
	static int setKthBit(int n, int k) 
	{ 
	    // kth bit of n is being set by this operation 
	    return ((1 << k) | n); 
	} 
}
