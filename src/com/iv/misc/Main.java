package com.iv.misc;

public class Main {

	public static void main(String[] args) {
		System.out.println(SomeFunction(16));
	}
	
	public static double SomeFunction(int number) {
		double temp;
		double result = number/2;
		do {
			temp = result;
			result = (temp + (number/temp)) / 2;
		}
		while((temp - result) != 0);
		return result;
	}
}
