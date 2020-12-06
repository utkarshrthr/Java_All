package com.iv.problem.solving;

public class PalindromeString {

	public static void main(String[] args) {
		String input = "namman";
		System.out.println(isPalindrome(input));
	}
	
	private static boolean isPalindrome(String input) {
		int start = 0;
		input = input.toLowerCase();
		int end = input.length() - 1;
		while(start < end) {
			if(input.charAt(start) != input.charAt(end)) {
				return false;
			}
			start++;
			end--;
		}
		return true;
	}
	
	private static boolean isPalindrome1(String input) {
		return new StringBuilder(input).reverse().equals(input);
	}
	
	private static boolean isPalindrome(String input, int st, int en) {
		if(st>en ) return true;
		if(input.charAt(st)!=input.charAt(en)) return false;
		return isPalindrome(input, st+1, en-1);
	}
}

