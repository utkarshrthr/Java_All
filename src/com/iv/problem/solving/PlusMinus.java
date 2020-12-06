package com.iv.problem.solving;

public class PlusMinus {

	public static void main(String[] args) {
		int[] arr = {-4, 3, -9, 0, 4, 1};
		getRatio(arr);
	}
	
	private static void getRatio(int[] arr) {
		double len = arr.length;
	    double[] ar = new double[3];
	    // 0 for 0
	    // 1 for +ve
	    // 2 for -ve
	    for(int i:arr){
	    	if(i==0) 
	    		ar[0]+=1;
	    	else if(i>0) 
	    		ar[1]+=1;
	        else if(i<0) 
	        	ar[2]+=1;   
	    }
	    for(double i:ar){
	    	System.out.println(String.format("%.6f", (double)i/len));
	    }
	}
}
