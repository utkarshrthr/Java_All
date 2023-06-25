package com.problemsolving;

import java.util.Arrays;

public class LongestPalindromicSubstring {
	public static void main(String[] args) {
		String input = "BCDCBA";
		System.out.println(getLongestPalindromicStringON2(input));
	}
	
	private static String getLongestPalindromicStringON2(String input) { // O(n^2) solution 
		// separate even and odd substrings
		int maxLen = 1;
		int startIn = 0;
		int endIn = 1;
		for(int i = 1; i < input.length(); i++) {
			// evens
			int cen = i;
			int st = cen-1;
			int en = cen;
			while(st >= 0 && en< input.length() ) {
				String subStr = input.substring(st, en);
				if(isPalindrome(subStr) && subStr.length() > maxLen) {
					maxLen = subStr.length();
					startIn = st;
					endIn = en;
				}
				st--;
				en++;
			}
		}
		for(int i = 1; i < input.length(); i++) {
			// odds
			int cen = i;
			int st = cen-1;
			int en = cen+1;
			while(st >= 0 && en< input.length() ) {
				String subStr = input.substring(st, en);
				if(isPalindrome(subStr) && subStr.length() > maxLen) {
					maxLen = subStr.length();
					startIn = st;
					endIn = en;
				}
				st--;
				en++;
			}
		}
		System.out.println(maxLen);
		return input.substring(startIn, endIn);
	}
	
	private static String getLongestPalindromicStringON3(String input) { // O(n^3) time-complexity
		// iterate over all possible substrings
		int st = 0;
		int en = input.length()-1;
		int maxLen = 1;
		int stIn = 0;
		int enIn = 0;
		for(int i = 0; i <= input.length(); i++) {
			st = i;
			for(int j = i; j <= input.length(); j++) {
				en = j;
				String subStr = input.substring(st, en);
				//System.out.println(st + ", " + en);
				if(isPalindrome(subStr) && subStr.length() > maxLen) {
					stIn = st;
					enIn = en;
					maxLen = subStr.length();
				}
			}
		}
		System.out.println(maxLen);
		return input.substring(stIn, enIn);
	} 
	
	private static boolean isPalindrome(String input) {
		int st = 0;
		int en = input.length()-1;
		while(st < en) {
			if(input.charAt(st) != input.charAt(en)) {
				return false;
			}
			st++;
			en--;
		}
		return true;
	} 
	
}
