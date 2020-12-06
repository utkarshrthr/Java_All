package com.hackerrank;

import java.util.Arrays;

public class IntegerToBinary {

	public static void main(String[] args) {
		System.out.println(longToBinary(4));
	}

	private static long longToBinary(long num) {
		long[] bin = new long[32];
		int i = 0;
		while(num>0) {
			long rem = 0;
			rem = num%2;
			bin[32-i-1] = rem;
			i++;
			num = num/2;
		}
		long decimal = 0;
		for(int j = bin.length-1; j >=0; j--) {
			if(bin[j] == 0) {
				decimal+=(1 * Math.pow(2, 32-j-1));
			}
			else 
				decimal+=(0 * Math.pow(2, 32-j-1));
		} 
		return decimal;
	}
}
