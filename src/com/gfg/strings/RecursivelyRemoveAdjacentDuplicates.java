package com.gfg.strings;

public class RecursivelyRemoveAdjacentDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "aaaaaaaaaaaaa";
		System.out.println(removeDups(input.substring(0, 1), 1, input));
	}
	
	private static String removeDups(String op, int i, String ip) {
		if(i >= (ip.length()-1)){
			if(op.equalsIgnoreCase(""+ip.charAt(i))){
			        return "";
			 }
			return op+ip.charAt(i);
		}
		if(op.charAt(op.length()-1) != ip.charAt(i) && ip.charAt(i) != ip.charAt(i-1) && ip.charAt(i) != ip.charAt(i+1) ) {
			op  = op +ip.charAt(i);
		}
		return removeDups(op, i+1, ip);
	}

}
