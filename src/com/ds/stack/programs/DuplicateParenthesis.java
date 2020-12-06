package com.ds.stack.programs;

import java.util.Stack;

public class DuplicateParenthesis {

	public static void main(String[] args) {
		String expression = "(x+y)+z";
		System.out.println(isDuplicateExists(expression));
	}
	
	private static boolean isDuplicateExists(String expression) {
		Stack<Character> stack = new Stack<>();
		char[] exprs = expression.toCharArray();
		for(char c:exprs) {
			if(!stack.isEmpty() && (c == ')')) {
				if(stack.peek() == ')') return true;
			}
			stack.push(c);
		}
		return false;
	}
}
