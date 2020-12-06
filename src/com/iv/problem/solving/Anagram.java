package com.iv.problem.solving;

import java.util.Arrays;

public class Anagram {

/**
 * Check if 2 strings are anagrams.
 */	
	
	public static void main(String[] args) {
		String first = "silent";
		String second = "listesn";
		
		System.out.println(isAnagram1(first, second));
	}
	
	private static boolean isAnagram1(String first, String second) {
		if(first.length() != second.length())
			return false;
		int[] ar = new int[256]; /* All possible ASCII characters, extra space is required, this extra space can be reduced depending upon the input
		constraints, e.g. if the input will always contains words, then array size can be of 26 */
		for(int i = 0; i<first.length(); i++) {
			ar[first.charAt(i)]++;
		}
		for(int i = 0; i<second.length(); i++) {
			if(ar[second.charAt(i)] == 0) 
				return false;
			ar[second.charAt(i)]--;
		}
		for(int i:ar)
			if(i != 0)
				return false;
		
		return true;
	}
	
	private static boolean isAnagram2(String first, String second) {
		if(first.length() != second.length())
			return false;
		char[] ar1 = first.toCharArray();
		char[] ar2 = first.toCharArray();
		Arrays.sort(ar1);
		Arrays.sort(ar2);
		for(int i = 0; i<first.length(); i++) {
			if(ar1[i] != ar2[i])
				return false;
		}
		return true;
	}
}
