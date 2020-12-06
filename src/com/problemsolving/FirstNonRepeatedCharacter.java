package com.problemsolving;

public class FirstNonRepeatedCharacter {

	 public static void main(String[] args) {
		String seq = "GeeksForGeeks";
		int[] ar = new int[256]; 
		char[] chArr = seq.toCharArray();
		for(char c:chArr) ar[c] +=1;
		for(int i=0;i<ar.length;i++) {
			if(ar[i]==1) {
				System.out.println((char)i);
				break;
			}
		}
	}
}


