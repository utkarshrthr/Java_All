package com.core;


public class C {
	
	public static void main(String[] args) {
		A a = new A();
		A ab = new B();
		B b = new B();
		
		a.aa();
		ab.aa();
		b.aa();
		
		// data-hiding
	}
}

class A {
	public int a = 10;
	
	public void aa() {
		System.out.println(a);
	}
}

class B extends A {

	public int a = 20;
	
	public void aa() {
		System.out.println(a);
	}
}

/**
 * 
		System.out.println(a.a);
 */

