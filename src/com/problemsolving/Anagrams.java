package com.problemsolving;

public class Anagrams {

	public static void main(String[] args) {
		
		System.out.println(isAnagram("silent", "listesn"));
	}

	private static boolean isAnagram(String first, String second) {
		int[] arr = new int[256];
		for(char c:first.toCharArray()) 
			arr[c]++;
		for(char c:second.toCharArray()) 
			arr[c]--;
		for(int i:arr)
			if(i!=0) 
				return false;
		return true;
	}
}
