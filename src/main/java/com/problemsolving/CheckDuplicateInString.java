package com.problemsolving;

public class CheckDuplicateInString {
	public static void main(String[] args) {
		System.out.println(hasDuplicate("abcdeef"));
	}
	
	private static boolean hasDuplicate(String input) {
		for(int i=1; i<input.length()-1; i++) {
			String container = input.substring(i, input.length());
			String subString = input.substring(i-1, i);
			if(container.contains(subString)) {
				return true;
			}
		}
		return false;
	} 
}
