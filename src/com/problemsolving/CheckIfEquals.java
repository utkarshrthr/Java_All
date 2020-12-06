package com.problemsolving;

public class CheckIfEquals {

	public static void main(String[] args) {

	}

	private static boolean isEqual(int[] first, int[] second) {
		if((first!=null && second == null) || (first==null && second != null) || (first.length != second.length))
			return false;
		return true;
	}
}
