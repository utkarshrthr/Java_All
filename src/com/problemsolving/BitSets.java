package com.problemsolving;

import java.util.BitSet;

public class BitSets {
	public static void main(String[] args) {
		int M = 5;
		BitSet set1 = new BitSet(M);
		set1.set(0, M-1, false);
		BitSet set2 = new BitSet(M);
		//set1.and(set2);	// set1 is updated
		System.out.println(set1);
		System.out.println(set2);
	}
}
