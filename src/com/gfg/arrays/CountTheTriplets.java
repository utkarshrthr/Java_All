package com.gfg.arrays;

public class CountTheTriplets {

	public static void main(String[] args) {
		
	}
	
	int countTriplet(int arr[], int n) {
        int triplets = 0;
        for(int i=0; i< n; i++){
            int e1 = arr[i];
            for(int j = i+1; j < n; j++){
                int e2 = arr[j];
                for(int k = 0; k < n; k++){
                    if(i != k && j != k && (Math.abs(e1+e2) == arr[k])){
                       triplets++; 
                    }
                }
            }
        }
        return triplets;
    }
}

/** PROBLEM STATEMENT & EXPLAINATION:
 * Given an array of distinct integers. The task is to count all the triplets such that sum of two elements equals the third element.
 * 
 * Input:
 * N = 4
 * arr[] = {1, 5, 3, 2}
 * Output: 2
 * Explanation: There are 2 triplets: 
 * 1 + 2 = 3 and 3 +2 = 5 
 */

