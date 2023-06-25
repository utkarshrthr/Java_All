package com.problemsolving;

import java.util.Arrays;
// a -> b -> c -> d
// c-> d -> a -> b
public class ReverseWordsInSentence {

	public static void main(String[] args) {
		char[] ar = {'p', 'r', 'a', 'c', 't', 'i', 'c', 'e', ' ', 'm', 'a' , 'k', 'e', 's', ' ', 'p', 'e', 'r', 'f', 'e',  'c', 't'};
		reverseAr(ar);
		System.out.println(Arrays.toString(ar));
	}
	
	// reverse the whole string, then reverse the words
	private static void reverseAr(char[] ar) {
		int st = 0;
		int en = ar.length - 1;
		while(st < en) {
			char c = ar[st];
			ar[st] = ar[en];
			ar[en] = c;
			
			st++;
			en--;
		}
		//
		st = 0;
		for(int i = 0; i < ar.length; i++) {
			if(ar[i] == 32) {
				reverseWord(ar, st, i-1);
				st = i+1;
			}
		}
		reverseWord(ar, st, ar.length-1); // calling for last word
	}
	
	
	private static void reverseWord(char[] ar, int st, int en) {
		while(st < en) {
			char c = ar[st];
			ar[st] = ar[en];
			ar[en] = c;
			st++;
			en--;
		}
	}

	// brute-force approach
	private static char[] reverse(char[] ar) {
		StringBuilder sentence = new StringBuilder();
		for(char c:ar) {
			sentence.append(c);
		}
		String[] newAr = sentence.toString().split("\\s+");
		StringBuilder reverseSentence = new StringBuilder();
		for(int i = newAr.length-1; i >= 0; i--) {
			reverseSentence.append(newAr[i]).append(" ");
		}
		return reverseSentence.toString().toCharArray();
	}
}
