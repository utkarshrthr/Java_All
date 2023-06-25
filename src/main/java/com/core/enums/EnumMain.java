package com.core.enums;

public class EnumMain {
	public static void main(String[] args) {
		for(Days d: Days.values())
			;
		
		Days[] d= Days.values();
		System.out.println(d[1]);
	}
	
	public enum Days {
		OMN, TUE
	}
}
