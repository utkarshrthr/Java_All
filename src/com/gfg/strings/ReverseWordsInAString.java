package com.gfg.strings;

import java.util.Arrays;

public class ReverseWordsInAString {

	public static void main(String[] args) {
		System.out.println(reverseWords("i.like.this.program.very.much"));
	}
	
	private static String reverseWords(String s) {
        String[] ar = s.split("\\.");
        StringBuilder sb = new StringBuilder();
        for(int i = ar.length-1; i >=0; i--) {
        	sb.append(ar[i]).append(".");
        }
        return sb.toString().substring(0, sb.length()-1);
    }
	
	/*
	 	String words[] = s.split("\\.");
        String result = "";
        for (int i = words.length - 1; i >= 0; i--) {
            result += words[i];
            if(i!=0)
                result += '.';
        }
        return result;
	 */
}
