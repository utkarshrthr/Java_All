package com.iv.problem.solving;

public class CountVowelsAndConsonants {

	public static void main(String[] args) {
		String seq = "Geeks For Geeks";
		int consonants = 0, vowels = 0;
		for(char c: seq.toLowerCase().toCharArray()) {
			if(Character.isAlphabetic(c)) {
				if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') vowels += 1;
				else consonants += 1;
			}
		}
		System.out.println(vowels);
		System.out.println(consonants);
	}
}
