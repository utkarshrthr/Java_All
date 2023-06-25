package com.iv.misc;

/***
 * @author UtkarshRathore
 *
 * A company has hired N interns, labeled from 1 to N. Each intern is given a device which generates a number everyday that will be used as 
 * a password for their authentication at the office door every day in the morning. The intern-ship is for 50 days numbered from 0 to 49.
 * Initially (on the 1st day), the number in the device of the Kth intern will be equal to (5000*K).
 * 
 * From the 2nd day, (i.e., i = 1), a new number will be generated every day in each device in the following way
 * 
 * 		Day(i) = Day(i-1) + 5000 + i;
 * 
 * Find the label of an intern from the given password used him/her. 
 * 
 * INPUT: N -> number of interns
 * 		  P -> password
 * 
 * OUTPUT: Return the label of the intern to whom the given password belongs to. 
 * 
 * Samples: Input: N - 2, P - 50000
 * 		    Output: 1	
 * 		   
 * 		    Input: N - 2, P - 250003
 * 		    Output: 1	
 */
public class UserMainCode {

	public static void main(String[] args) {
		
	}
}
