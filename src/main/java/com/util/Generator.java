package com.util;

import java.util.Random;

public class Generator {
	
	public static final int[] generateArray() {
		return generateArray(100);
	}
	
	public static final int[] generateArray(int n) {
		Random rd = new Random(); 
	    int[] arr = new int[n];
	    for (int i = 0; i < arr.length; i++) {
	    	arr[i] = rd.nextInt(n); 
	    }
	    return arr;
	}
}
