package com.gfg.arrays;

public class Frequency {

	public static void main(String[] args) {
		getFrequency("abcd", "bcde");
	}
	
	private static void getFrequency(String s1, String s2) { 	// O(n) time and O(1) space
		int[] ar = new int[26];
		for(char c: s1.toLowerCase().toCharArray()) {
			ar[c-97]++;
		}
		for(char c: s2.toLowerCase().toCharArray()) {
			ar[c-97]++;
		}
		for(int i = 0; i < ar.length; i++) {	// modify this block to get element with max frequency
			if(ar[i] != 0)
				System.out.println((char)((i + 97)) + " " + ar[i]);
		}		
	}

}
