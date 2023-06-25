package com.hackerrank.arrays;

public class NewYearChaos {

	public static void main(String[] args) {
		int[] input1 = {2, 1, 5, 3, 4};
		int[] input2 = {2, 5, 1, 3, 4};
		int[] input3 = {1, 2, 5, 3, 7, 8, 6, 4};
		
		int bribes = countBribes(input3);
		
		if(bribes == -1) {
			System.out.println("Too chaotic");
		}
		else if(bribes != 0) {
			System.out.println("Bribes: "+ bribes);
		}
	}
	
	private static int countBribes(int[] ar) {
		int bribes = 0;
		int expectedFirst = 1;
	    int expectedSecond = 2;
	    int expectedThird = 3;
		for(int i = 0; i< ar.length; i++) {
			if (ar[i] == expectedFirst) {
				expectedFirst = expectedSecond;
				expectedSecond = expectedThird;
				++expectedThird;
			} 
			else if (ar[i] == expectedSecond) {
				++bribes;
				expectedSecond = expectedThird;
				++expectedThird;
			} 
			else if (ar[i] == expectedThird) {
				bribes += 2;
				++expectedThird;
			} 
			else {
				return -1;
			}
		}
		return bribes;
	}
}

/**
 * It is New Year's Day and people are in line for the Wonderland rollercoaster ride. Each person wears a sticker indicating their initial position in the queue. Initial positions increment by  
 * 1 from 1 at the front of the line to  at the back. Any person in the queue can bribe the person directly in front of them to swap positions. If two people swap positions, they still wear the 
 * same sticker denoting their original places in line. One person can bribe at most two others. For example, if n == 8 and Person 5 bribes Person 4, the queue will look like this: 
 * [ 1, 2, 3, 5, 4, 6, 7, 8] 
 * Fascinated by this chaotic queue, you decide you must know the minimum number of bribes that took place to get the queue into its current state. If anyone has bribed more than two people, 
 * the line is too chaotic to compute the answer. 
 */

