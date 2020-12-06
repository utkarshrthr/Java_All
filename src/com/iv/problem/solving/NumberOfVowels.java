package com.iv.problem.solving;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberOfVowels {

	public static void main(String[] args) {
		String str = "Hi There";
		System.out.println(getVowelCountRegexTwo(str.toLowerCase()));
	}
	
	private static int getVowelsCountIterative(String input) {
		int count = 0;
		char[] ar = input.toCharArray();
		for(char ch:ar) {
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				count++;
			}
		}
		return count;
	}
	
	private static int getVowelsCountRecursive(String input) {
		return getVowelsCount(input.toLowerCase(), 0, 0);
	}
	
	private static int getVowelsCount(String input, int index, int count) {
		if(index >= input.length()) return count;
		char ch = input.charAt(index);
		if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
			count++;
		}
		return getVowelsCount(input, index+1, count);
	}
	
	private static int getVowelCountRegexOne(String input) {
		return input.length() - input.replaceAll("[aieouAEIOU]", "").length();
	}
	
	private static int getVowelCountRegexTwo(String input) {
		Pattern pattern = Pattern.compile("[aeiouAEIOU]");
		Matcher matcher = pattern.matcher(input);
		int count = 0;
		while(matcher.find()) count++;
		return count;
	}
}
