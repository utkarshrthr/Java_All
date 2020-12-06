package com.gfg.arrays;

public class SubarrayWithGivenSum {

	public static void main(String[] args) {

		int[] ar = {135, 101, 170, 125, 79, 159, 163, 65, 106, 146, 82, 28, 162, 92, 196, 143, 28, 37, 192, 5, 103, 154, 93, 183, 
				22, 117, 119, 96, 48, 127, 172, 139, 70, 113, 68, 100, 36, 95, 104, 12, 123, 134}; //
		//int[] ar = {1, 2, 3, 7, 5};
		int sum = 468;
		int n = 42;
		int j = 0; int k = 1; 
		int st = j;
		int en = k;
		int tempSum = ar[0];
		while(j < n && k <= n){ // 1 -> THIS WILL CAUSE ArrayIndexOutOfBoundsException
			if(sum < tempSum){
				tempSum -= ar[j];
				j++;
			}
			else if(sum > tempSum){
				if(k<n){	// THIS IS THE TRICK HERE TO HANDLE ArrayIndexOutOfBoundsException AT 1
					tempSum += ar[k];
					k++;
				}
				else break;
			}
			if(sum == tempSum){
				st = j;
				en = k;
				break;
			}
		}
		if(tempSum == sum){
			System.out.println(st+1 + " " +en);
		}
		else {
          System.out.println(-1);
		}
	}
}

/** PROBLEM STATEMENT & EXPLAINATION:
 * Given an unsorted array A of size N of non-negative integers, find a continuous sub-array which adds to a given number S.
 * Input:
 * The first line of input contains an integer T denoting the number of test cases. 
 * Then T test cases follow. Each test case consists of two lines. 
 * The first line of each test case is N and S, where N is the size of array and S is the sum. 
 * The second line of each test case contains N space separated integers denoting the array elements.
 * 
 * Output:
 * For each testcase, in a new line, print the starting and ending positions(1 indexing) of first such occuring subarray from the left if sum equals 
 * to subarray, else print -1.
 
 * Constraints:
 * 1 <= T <= 100
 * 1 <= N <= 107
 * 1 <= Ai <= 1010

 * Example:
 * Input:
 * 2
 * 5 12
 * 1 2 3 7 5
 * 10 15
 * 1 2 3 4 5 6 7 8 9 10
 * Output:
 * 2 4
 * 1 5
 */
