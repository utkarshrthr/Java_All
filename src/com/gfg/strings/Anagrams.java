package com.gfg.strings;

public class Anagrams {

	public static void main(String[] args) {
		System.out.println(isAnagram("b", "d"));
	}

	public static boolean isAnagram(String a,String b)
    {
        if(a.length()!=b.length())
            return false;
            
        int[] ar = new int[26];
        for(int i = 0; i < a.length(); i++){
            ar[a.charAt(i) - 97]++;
        }
        for(int i = 0; i < b.length(); i++){
            ar[a.charAt(i) - 97]--;
        }
        for(int i = 0; i < ar.length; i++){
            if(ar[i]!=0)
                return false;
        }
        return true;
        
    }
}
