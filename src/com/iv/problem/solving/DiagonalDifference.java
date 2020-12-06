package com.iv.problem.solving;

public class DiagonalDifference {

	/**
	 * Diagonal1 = 1 + 5 + 9 = 15 
	 * Diagonal2 = 3 + 5 + 9 = 17
	 * 
	 * Difference = |15 - 17| = 2
	 * 
	 * */
	public static void main(String[] args) {
		int[][] inp = {
				{1, 2, 3},
				{4, 5, 6},
				{9, 8, 9}
		};
		System.out.println(getDiagonalDifference(inp));
	}
	
	private static int getDiagonalDifference(int[][] inp) {
		int en = inp.length;
		int i = 0; int j = 0;
		int d1 = 0;
		while(i<en && j <en) {
			d1 += inp[i][j];
			i++;
			j++;
		}
		int d2 = 0;
		i=0;
		j--;
		while(i<en && j >= 0) {
			d2 += inp[i][j];
			i++;
			j--;
		}
		return Math.abs(d1-d2);
	}
}
