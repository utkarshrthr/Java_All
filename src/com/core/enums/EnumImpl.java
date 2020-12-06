package com.core.enums;

public class EnumImpl {

	public static void main(String[] args) {
		
		System.out.println(Months.valueOf("APRIL").getDeclaringClass());
		
		System.out.println(EnumOne.ONE.equals(EnumOne.THREE));
	}
}