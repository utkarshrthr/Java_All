package com.problemsolving;


/**
 * You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed, 
 * the only constraint stopping you from robbing each of them is that adjacent houses have security system connected and 
 * it will automatically contact the police if two adjacent houses were broken into on the same night.
 * Given a list of non-negative integers representing the amount of money of each house, 
 * determine the maximum amount of money you can rob tonight without alerting the police.
 * 
 * Input: nums = [1,2,3,1]
 * Output: 4
 * Explanation: Rob house 1 (money = 1) and then rob house 3 (money = 3). Total amount you can rob = 1 + 3 = 4.
 * 
 * */
public class OptimalNonAdjacentSum {

	public static void main(String[] args) {
		int[] ar = {3, 1, 5, 2, 6, 4};
		System.out.println(getMax(ar));
	}
	
	private static int getMax(int[] ar) { // O(n) space and O(n) time
		return Math.min(getmax(ar, 0, 0), getmax(ar, 0, 1));
	}
	
	private static int getmax(int[] ar, int sum, int index) {
		if(index >= ar.length)
			return sum;
		return getmax(ar, sum + ar[index], index+2);
	}
}
