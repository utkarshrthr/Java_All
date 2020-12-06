package com.iv.problem.solving;

public class MakingAnagrams {
	public static void main(String[] args) {
		String one = "fcrxzwscanmligyxyvym";
		String two = "jxwtrhvujlmrpdoqbisbwhmgpmeoke";
		
		System.out.println(makingAnagaram(one, two));
	}
	
	private static int makingAnagaram(String one, String two) {
		int[] ar = new int[26];
		//97
		
		for(char c: one.toCharArray()) {
			ar[c-97]++;
		}
		for(char c: two.toCharArray()) {
			ar[c-97]--;
		}
		int makingCost1 = 0;
		
		for(int a: ar) {
			if(a != 0)
				makingCost1+= Math.abs(a);
		}

		return makingCost1;
	}
}
