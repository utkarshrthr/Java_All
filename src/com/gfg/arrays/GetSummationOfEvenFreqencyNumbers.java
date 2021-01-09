package com.gfg.arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;


public class GetSummationOfEvenFreqencyNumbers {
	
	public static void main(String... args) {
		int[] ar = {1, 2, 2, 3, 1};
		System.out.println(getSummation(ar));
		StringBuffer sb = new StringBuffer("111111111111111111");
		System.out.println(sb.capacity());
		float f = \u0038;
		System.out.println(f);
		System.out.println(tets());
		
		int a = Integer.MIN_VALUE;
		int b = -a;
		System.err.println(a);
		System.err.println(b);
		byte c = 65;
		switch (c) {
		default:
			System.out.println("D");
			break;
		case 'A':
			System.out.println("A");
			break;
		}

	}
	
	private static int getSummation(int[] ar) { // O(n) space and O(n) time
		int sum = 0;
		Map<Integer, Integer> map = new HashMap<>();
		for(int a: ar) {
			map.put(a, map.getOrDefault(a, 0) + 1);
		}
		for(Entry<Integer, Integer> e: map.entrySet()) {
			if(e.getValue() % 2 == 0) {
				sum += e.getKey();
			}
		}
		return sum;
	}
	
	private static int tets() {
		int i = 0;
		try {
			i = 10/0;
		} catch (Exception e) {
			// TODO: handle exception
			i = 10;
			return i;
		}
		finally {
			i = 1;
		}
		return i;
	}
}
