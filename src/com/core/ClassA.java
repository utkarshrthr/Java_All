package com.core;

public class ClassA {
	int size = 7;
	
	public static void main(String[] args) {
		ClassA a1 = new ClassA();
		ClassA a2 = a1;
		int i1 = 10;
		int i2 = i1;
		go(a2, i2);
		System.out.println(a1.size + "" + i1);
	}
	
	static void go(ClassA a, int i) {
		a.size = 8;
		i = 12;
	}
}
