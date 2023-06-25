package com.ds.stack.programs;

import java.util.Stack;
import java.util.TreeMap;

public class BalancedExpression {

	public static void main(String[] args) {
		String expression = "{[{}{}]}[()]";
		System.out.println(isExpressionBalanced(expression));
		TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>();
		
		int[] arr = {134};
		int S = 468;
		
		boolean go = true;
        for(int i = 0;i<arr.length && go;i++){
        	if(i == 37)
        		System.out.println();
            int sum = arr[i];
            for(int j = i+1;j<arr.length;j++){
                sum+=arr[j];
                if(sum == S){
                    go = false;
                    System.out.println((i+1) + " " + (j+1));
                    break;
                }
            }   
        }
        if(go)
            System.out.println(-1);
		
	}
	
	private static boolean isExpressionBalanced(String expression) {
		char[] exprs = expression.toCharArray();
		Stack<Character> charStack = new Stack<>();
		for(char c: exprs) {
			if(!charStack.isEmpty() && (c == '}' || c == ')' || c == ']'))
				charStack.pop();
			else charStack.push(c);
		}
		return charStack.isEmpty();
	}
}
