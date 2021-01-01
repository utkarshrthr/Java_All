package com.ds.stack;

public class StackUsingLinkedList {

	public static void main(String[] args) {
		
		StackL<Integer> stack = new StackL<>();
		stack.push(1);
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		System.out.println(stack);
	}
}
