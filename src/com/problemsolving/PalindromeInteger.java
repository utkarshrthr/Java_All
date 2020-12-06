package com.problemsolving;

public class PalindromeInteger {

	public static void main(String[] args) {
		int input = 1234321;
		System.out.println(isPalindrome(input));
	}
	
	private static boolean isPalindrome(int input) {
		int r = 0, reversed = 0;
		int temp = input;
		while(input != 0) {
			r = input % 10;
			reversed = (reversed * 10) + r;
			input = input / 10;
		} 
		return temp == reversed;
	}
}
