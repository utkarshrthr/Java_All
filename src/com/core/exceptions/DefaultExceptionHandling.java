package com.core.exceptions;

public class DefaultExceptionHandling {

	public static void main(String[] args) {
		doStuff();
	}

	private static void doStuff() {
		doMoreStuff();
	}
	
	private static void doMoreStuff() {
		doSomeMoreStuff();
	}
	
	private static void doSomeMoreStuff() {
		doALittleMoreStuff();
	}
	
	private static void doALittleMoreStuff() {
		System.out.println(10/0);
	}
}
