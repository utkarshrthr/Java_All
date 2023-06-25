package com.problemsolving;

public class PyramidPattern {

	/** WAP to print a Pyramid of height h **/
	public static void main(String[] args) {
		int height = 3;
		printPyramid(height);

		
		System.out.println(1.0/0.0);
		
		System.out.println(Math.min(Double.MIN_VALUE, 0));
		
		String s1 = new String("pankaj");
	     String s2 = new String("PANKAJ");  
	     s1 = s2;
	     System.out.println(s1); 
	}

	private static void printPyramid(int h) {
		int w = 2*h-1;
		//int[][] ar = new int[w][h];
		for(int i = 0; i < h; i++) {
			int start = (w/2) - i;
			int end = (w/2) + i;
			int j = 0;
			while(j<w) {
				if(j<start || j>end) System.out.print(" ");
				else System.out.print("*");
				j++;
			}
			System.out.println();
		}
		
		//fun(null);
		
	}
	
	
	public void fun(Number a){
		System.out.println("Integer");
	}
	
	public void fun(String a){
		System.out.println("Long");
	} 
	// TRY THIS RECURSIVELY
}
 