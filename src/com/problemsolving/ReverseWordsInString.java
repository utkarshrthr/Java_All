package com.problemsolving;

import java.util.Arrays;

public class ReverseWordsInString {

	public static void main(String[] args) {
		String s = " abc  bcd   cdf  ";
		System.out.println(Arrays.toString(s.trim().split("\\s+")));
		System.out.println(reverse(s));


		StringBuilder reversed = new StringBuilder("abcd.");
		System.out.println(reversed.deleteCharAt(reversed.length()-1).toString());
		
	}
	
	public static String reverse(String str) {
		String[] ar = str.trim().split("\\s+");
		StringBuilder reversed = new StringBuilder();
		for(int i=ar.length-1;i>=0;i--) reversed.append(ar[i]).append(" ");
		return reversed.toString().trim();
	}
}
