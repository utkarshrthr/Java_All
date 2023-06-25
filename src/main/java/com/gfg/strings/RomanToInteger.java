package com.gfg.strings;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
	
	private static Map<Character, Integer> map = new HashMap<>();
	
	static {
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);
	}
	
	public static void main(String[] args) {
		System.out.println(romanToInteger2("l"));
	}

	private static int romanToInteger2(String roman) { /** NOT WORKING **/
		int integerValue = 0;
		char[] romans = roman.toUpperCase().toCharArray();
		int len = romans.length;
		for(int i = 0; i < romans.length; i++) {
			integerValue += map.get(romans[i]);
			if(i+1 < len && map.get(romans[i]) < map.get(romans[i+1])){
				integerValue += map.get(romans[i+1]) - map.get(romans[i]);
				i += 1;
			}
			else {
				integerValue += map.get(romans[i]);
			}
		}
		return integerValue;
	}
	
	private static int romanToInteger(String roman) {
		roman = roman.toUpperCase();
		char[] romans = roman.toCharArray();
		int len = romans.length;
		int integerVal = 0;
		for(int i = 0; i < len; i++) {
			if(romans[i] == 'C') {
				integerVal += 100;
				if((i+1) < len && romans[i+1] == 'D') {
					integerVal += 300;
					i++;
				}
				else if((i+1) < len && romans[i+1] == 'M') {
					integerVal += 800;
					i++;
				}
			}
			else if(romans[i] == 'M') {
				integerVal += 1000;
			}
			else if(romans[i] == 'D') {
				integerVal += 500;
			}
			else if(romans[i] == 'X') {
				integerVal += 10;
				if((i+1) < len && romans[i+1] == 'L') {
					integerVal += 30;
					i++;
				}
				else if((i+1) < len && romans[i+1] == 'C') {
					integerVal += 80;
					i++;
				}
			}
			else if(romans[i] == 'L') {
				integerVal += 50;
			}
			else if(romans[i] == 'V') {
				integerVal += 5;
			}
			else if(romans[i] == 'I') {
				integerVal += 1;
				if((i+1) < len && romans[i+1] == 'V') {
					integerVal += 3;
					i++;
				}
				else if((i+1) < len && romans[i+1] == 'X') {
					integerVal += 8;
					i++;
				}
			}
		}
		return integerVal;
	}
}
