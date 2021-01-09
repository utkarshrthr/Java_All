package com.leetcode.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CheckIfArraysEqual {

	public static void main(String[] args) {
		int[] ar1 = {3, 1, 2, 5, 4};
		int[] ar2 = {5, 1, 3, 4, 2};
		
		System.out.println(isArrEqual(ar1, ar2));
	}

	// brute-force approach
	private static boolean isEquals(int[] ar1, int[] ar2) { //  O(n^2 + n) ->  O(n^2)
		// if any of one is null and other is not return false
		// if length of both arrays are not equal return false;
		
		Arrays.sort(ar1); // arrays.sort uses double pivot quick sort -> O(n^2)
		Arrays.sort(ar2); 
		
		for(int i = 0; i < ar1.length; i++) { 	// O(n)
			if(ar1[i] != ar2[i]) {
				return false;
			}
		}		
		return true;
	}
	
	private static boolean isArrEqual(int[] ar1, int[] ar2) { // O(3n) -> O(n)
		// we can use set as the input arrays may have duplicates
		
		// using hashmap to store elements and its frequency
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int a: ar1) {
			if(map.containsKey(a)) { // O(1)
				map.put(a, map.get(a)+1);
			}
			else 
				map.put(a, 1); // O(1)
		}
		for(int a: ar2) {
			if(map.containsKey(a)) {
				map.put(a, map.get(a)-1);
			}
			else return false;
				
		}
		for(Integer i: map.values()) {
			if(i != 0) {
				return false;
			}
		}
		return true;
	}
}
