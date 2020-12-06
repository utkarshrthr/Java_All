package com.problemsolving;

public class LongestPalindrome {

	public static void main(String[] args) {
		String input = "abcddcefghijklmnopqrstubv";
		
		String s1 = new String("abhay");
		String s2 = new String("ABHAY");
		System.out.println(s2=s1);
		
		System.out.println(input.length());
		
		
		
		System.out.println(getLongestPalindrome(input));
	}
	
	private static String getLongestPalindrome(String input) {
		int len = input.length();
		int max = 0;
		if(len%2==0) {
			int st = len/2;
			int en =len/2+1;
		}
		else {
			int st = len/2-1;
			int en =len/2+1;
			while(st > 0 && en < len) {
				st--; en++;
				max = Math.max(en-st, max);
			}
		}
		return "";
	}
}
