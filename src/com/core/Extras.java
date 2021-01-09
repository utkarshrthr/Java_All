package com.core;

public class Extras {
	
	static int count = 0;
	
	public static void main(String[] args) {
	
		if(count < 2) { 
			count++; main(null); 
		} 
		else return;
		System.out.println("Hello");
	}
}	
