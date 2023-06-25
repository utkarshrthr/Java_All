package com.problemsolving.greedy_algorithms;

import java.util.Arrays;

public class ActivitySelectionProblem {

	public static void main(String[] args) {
		int start[]  =  {1, 3, 0, 5, 8, 5};
		int finish[] =  {2, 4, 6, 7, 9, 9};
		System.out.println(getMaxActivities(start, finish));
	}

	private static int getMaxActivities(int[] start, int[] finish) {
		Arrays.sort(finish);
		int en = finish[0];
		int activities = 1;
		for(int i = 1; i < finish.length; i++) {
			if(start[i] >= en) {
				en = finish[i];
				activities+=1;
			}
		}
		return activities;
	}
}
