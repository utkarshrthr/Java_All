package com.problemsolving;

import java.util.Arrays;
import java.util.Stack;

// Array, Amazon,

// Given an array, print the next greater element for every element. 
// The next greater element for an element X is the first greater element on the  right side of the array. For last element print -1.

// input -> [4, 5, 2, 1, 25], 		output -> [5, 25, 25, 25, -1],
// input -> [11, 3, 7, 6, 11, 12], 	output -> [12, 7, 11, 11, 12, -1],

public class NextGreaterElement {

	public static void main(String[] args) {
		int[] ar = {4, 5, 2, 1, 25};
		nextGreaterElements(ar);
		System.out.println(Arrays.toString(ar));
	}
	
	private static void nextGreaterElementss(int[] ar) {
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(ar[0]);
		for(int i = 0; i < ar.length-1; i++) {
			if(stack.peek() > ar[i]) {
				
			}
			else {
				
			}
		}
	}

	private static void nextGreaterElements(int[] ar) { // O(n^2)
		int currMax = ar[1];
		for(int i = 0; i < ar.length-1; i++) {
			if(ar[i] < ar[i+1]) {
				ar[i] = ar[i+1];
				currMax = ar[i+1];
			}
			else {
				currMax = findMax(ar, i);
				ar[i] = currMax;
			}
		}
		ar[ar.length-1] = -1;
	}
	
	// BRUTE FORCE
	private static void nextGreaterElement(int[] ar) { // O(n^2)
		for(int i = 0; i < ar.length-1; i++) {
			int max = findMax(ar, i);
			ar[i] = max;
		}
		ar[ar.length-1] = -1;
	}
	
	private static int findMax(int[] ar, int st) {
		int max = ar[st];
		for(int i = st+1; i < ar.length; i++) {
			if(max < ar[i]) {
				return ar[i];
			}
		}
		return max;
	}
}
