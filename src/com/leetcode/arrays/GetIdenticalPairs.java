package com.leetcode.arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class GetIdenticalPairs {

	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder("ac").insert(1, 1);
		System.out.println(sb);
		
		int[] nums = {5,11,1,1,15,13,17,10,11,7,13,9,1,14,8,12,12,10,10};
		int[] index = {		0,0,2,1,3,0,2,1,6,8,2,4,4,1,5,3,11,4,7};
		System.out.println(Arrays.toString(createTargetArray(nums, index)));
	}

	private static  int[] createTargetArray(int[] nums, int[] index) {
		int[] target = new int[nums.length];
		ArrayList<Integer> list = new ArrayList<>();
		for(int i = 0; i < nums.length; i++) {
			list.add(index[i], nums[i]);
		}
		for(int i = 0; i < nums.length; i++) {
			target[i] =  list.get(i);
		}
		return target;
	}
	
	/*private static  int[] createTargetArray(int[] nums, int[] index) { // solution failed for 2 digit numnbers
		int[] target = new int[nums.length];
		StringBuilder sb = new StringBuilder("");
		for(int i = 0; i < nums.length; i++) {
			sb.insert(index[i], nums[i]);
		}
		int i = 0;
		for(char c: sb.toString().toCharArray()) {
			target[i] = c - '0';
			i++;
		}
		return target;
	}*/
	 
	 private static void shuffle(int[] ar, int st, int en) {
		if(st != 0) {
			for(int i = ar.length-1; i > st; i--) {
				ar[i] = ar[i-1];
			}
		}
	 }
	
	private static int numIdenticalPairs(int[] nums) {
		int count = 0;
		for(int i = 0; i < nums.length; i++) {
			for(int j = i+1; j < nums.length; j++) {
				if(i < j && nums[i] == nums[j]) {
					count++;
				}
			}
		}
		return count;
	}
	
	public static int numIdenticalPairs2(int[] A) {
        int res = 0; 
        int count[] = new int[101];
        for (int a: A) {
            res = (res + (count[a]++));
        }
        return res;
    }
}
