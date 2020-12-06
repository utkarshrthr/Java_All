package com.core.concepts;

public interface Java8Interface {
	public void sampleMethod();
	
	static void statMethod() {
		System.out.println("Static Method in an Interface");
	}
	
	default void defMethod() {
		System.out.println("Default Method in an Interface");
	}
}
