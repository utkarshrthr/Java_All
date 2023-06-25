package com.gfg.arrays;

public class MissingNumberInArray {

	public static void main(String[] args) {
		
	}
	
	int MissingNumber(int array[], int n) {
	 
		int nSum = 0;
		for(int i = 1; i<=n; i++){
			nSum+= i;
		}
		int nSumN1 = 0;
		for(int i : array){
			nSumN1+= i;
		}
		return nSum - nSumN1;
	}
}
