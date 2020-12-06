package com.ds.stack.programs;

import java.util.Stack;

public class EvaluatingPostFix {

	public static void main(String[] args) {
		String expression = "138*+";
		System.out.println(evaluate(expression));
	}
	
	private static int evaluate(String expression) {
		Stack<Integer> stack = new Stack<>();
		char[] exprs = expression.toCharArray();
		for(char c:exprs) {
			if(Character.isDigit(c)) {
				stack.push(Character.getNumericValue(c));
			}
			else {
				int op1 = stack.pop();
				int op2 = stack.pop();
				if(c == '+') stack.push(op1+op2);
				if(c == '-') stack.push(op1-op2);
				if(c == '*') stack.push(op1*op2);
				if(c == '/') stack.push(op1/op2);
			}
		}
		return stack.pop();
	}
}
