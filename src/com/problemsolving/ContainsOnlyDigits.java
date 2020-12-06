package com.problemsolving;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ContainsOnlyDigits {

	public static void main(String[] args) {
		String sequence = "123456a789";
		System.out.println(hasDigitsOnlyReg(sequence));
	}
	
	private static boolean hasDigitsOnly(String sequence) {
		// using loop
		for(char c:sequence.toCharArray())
			if(!Character.isDigit(c)) 
				return false;
		return true;
	}
	
	private static boolean hasDigitsOnlyReg(String sequence) {
		// using regex
		Matcher matcher = Pattern.compile("[^0-9]").matcher(sequence);
		if(matcher.find()) 
			return false;
		return true;
	}
}
