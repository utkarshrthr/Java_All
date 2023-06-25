package com.core.exceptions;

public class ErrorExample {
	
	public static void main(String[] args) {
		try {
			System.out.println("Throwing Error");
			throw new Error("Some Error");
		} 
		catch (Error e) {
			System.out.println("Caught Error");
		}
		finally {
			System.out.println("Inside finally");
		}
	}
}
