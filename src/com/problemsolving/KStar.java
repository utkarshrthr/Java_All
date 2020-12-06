package com.problemsolving;

public class KStar {

	public static void main(String[] args) {
		int[] TO = {1, 2, 4, 5};
		int[] FROM = {3, 3, 3, 3};
		int[] VALUES = {10, 20, 30, 40, 50};
		int K = 2;
		int NODES  = K + 1;
		
		int CENTER = VALUES[VALUES.length/2];
		VALUES[VALUES.length/2] = 0;
		int MAX_SUM = 0;
		for(int i = 0; i<(TO.length+1); i++) {
			MAX_SUM+= (VALUES[i] + CENTER);

			System.out.println(MAX_SUM);
			MAX_SUM = 0;
		}		
	}
}
