package com.iv.problem.solving;

public class StairCasePattern {

	public static void main(String[] args) {
		int stairs = 4;
		int stairHeight = 1;
		int stairWidth = 2;
		stairCaseOne(stairs, stairWidth, stairHeight);
	}
	
	public static void stairCaseTwo(int stairs, int stairWidth, int stairHeight) {
		for(int i=0;i<stairs;i++) {
			
		}
	}
	
	
	public static void stairCaseOne(int stairs, int stairWidth, int stairHeight) {
		int width = stairWidth;
		for(int i = 0; i < stairs; i++) {
			int k = 0;
			while(k<stairHeight) {
				int j = 0;
				while(j < stairWidth) {
					System.out.print("*");
					j++;
				}
				k++;
				if(k<stairHeight) {
					System.out.println();
				}
			}
			System.out.println();
			stairWidth+=width;
		}
	}
}
