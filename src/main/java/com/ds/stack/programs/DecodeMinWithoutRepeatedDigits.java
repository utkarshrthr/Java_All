package com.ds.stack.programs;

import java.util.Stack;

public class DecodeMinWithoutRepeatedDigits {

	public static void main(String[] args) {
		
		String expression = "IIDDIDID";
		
		Stack<Integer> stack = new Stack<>();
		
		StringBuilder output = new StringBuilder();
		
		for(int i=0;i<expression.length();i++) {
			stack.push(i+1);
			if (i == expression.length() || expression.charAt(i) == 'I')
			{
				// run till stack is empty
				while (!stack.empty())
				{
					// remove top element from the stack and add it to solution
					output.append(stack.pop());
				}
			}
		}
		System.out.println(output);
	}
}
