package com.ps.dp;

public class ContigousSubArrayGivenSum {
	public static void main(String[] args) {
		int[] ar = {6, 1, 3, 2, 4, 5};
		subArray2(ar, 9);
	}
	
	private static void subArray(int[] ar, int sum) {	// brute force approach
		for(int i=0;i<ar.length;i++) {
			int temp = ar[i];
			for(int j=i+1;j<ar.length-1;j++) {
				if(temp+ar[j] == sum) {
					System.out.println(i + " "+ j);
					return;
				}
				else if(temp+ar[j] > sum){
					 break;
				}
				temp += ar[j];
			}
		}
		System.out.println("-1");
		return;
	}
// [1, 4, 20, 3, 10, 5],	 sum = 33
	private static void subArray2(int[] ar, int sum) {	// optimized approach
		int tempSum = 0; 
		int i = 0;// 4, tempSum = 38
		int l = 0; 
		
		while(i<ar.length) {
			
			if(tempSum > sum) {
				tempSum =  tempSum - ar[l];
				l++;
			}
			if(tempSum == sum) {
				System.out.println(l+ " "+ i);
				return;
			}
			else i++;

			tempSum += ar[i];
			
		}
		System.out.println("-1");
		return;
	}
}
