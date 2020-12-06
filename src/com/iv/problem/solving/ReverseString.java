package com.iv.problem.solving;

public class ReverseString {

	public static void main(String[] args) {
		String original = "abcdefghijklmnopqrst";
		//System.out.println(reverseRecursively(original));
		//System.out.println(Arrays.toString("WelcomeToGeeksForGeeks".split("[A-Z]")));\		
		
		int[][] ar = new int[7][];
		System.out.println(ar.length);
	}
	
	public static String reverseRecursively(String s) {
		return reverse(s, s.length()-1);
	}
	
	public static String reverse(String s, int ind) {
		if(ind == 0) return String.valueOf(s.charAt(0));
		return s.charAt(ind) + reverse(s, ind-1);
	}
	
	public static String reverseLoop(String str) {
		char[] ar = str.toCharArray();
		StringBuilder sb = new StringBuilder();
		for(int i=ar.length-1;i>=0;i--) {
			sb.append(ar[i]);
		}
		return sb.toString();
	}
}
