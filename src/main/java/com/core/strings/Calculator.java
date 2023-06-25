package com.core.strings;

public class Calculator {
	
	public static void main(String[] args) {
		
		System.out.println("1\\n2".split("\n").length);
		
		//int sum = add("//[**][%%]\\n1**2%%3");
		//System.out.println(sum);
	}
	
	public static int add(String numbers) {
		int sum = 0;
		StringBuilder negativeNumbers = new StringBuilder();
		if(numbers == null || numbers.trim().isEmpty())
			return 0;
		
		String[] nums = numbers.split("[^0-9a-zA-Z]+");

		for(String n: nums) {
			if(Integer.parseInt(n)<0)
				negativeNumbers.append(n).append(", ");
			if(Integer.parseInt(n)<=1000)
				sum+=Integer.parseInt(n);
		}
		
		if(negativeNumbers.length()>0)
			throw new RuntimeException("Negative numbers are not allowed. "+negativeNumbers+" found in Input");
		
		
		return sum;
	}
}
