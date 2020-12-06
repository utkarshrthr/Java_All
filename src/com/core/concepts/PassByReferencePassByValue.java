package com.core.concepts;

import java.util.Arrays;

public class PassByReferencePassByValue {

	public static void main(String[] args) {
		int[] a = new int[5];
		modify(a);
		System.out.println(Arrays.toString(a));
		
		Fun fun = new Fun("Ajay");
		System.out.println(fun.getName());
		modifyFunRef(fun);
		System.out.println(fun.getName());
		
		modifyFunVal(fun);
		System.out.println(fun.getName());
	}
	
	public static void modify(int[] a) {
		a[0] = 0;
		a[1] = 1;
		a[2] = 2;
		a[3] = 3;
		a[4] = 4;
	}
	
	public static void modifyFunRef(Fun fun) {
		fun.setName("Alok");
	}
	
	public static void modifyFunVal(Fun fun) {
		fun = new Fun("Vijay");
	}
}

class Fun {
	
	private String name;
	
	public Fun(String name){
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}