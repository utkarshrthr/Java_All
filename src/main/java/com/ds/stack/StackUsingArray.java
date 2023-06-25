package com.ds.stack;

public class StackUsingArray {
	public static void main(String[] args) {
		StackA<Integer> stack = new StackA<Integer>(2);
		
		stack.push(1);
		stack.push(2);
		System.out.println(stack);
	}
}
