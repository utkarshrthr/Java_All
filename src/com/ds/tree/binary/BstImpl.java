package com.ds.tree.binary;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import com.core.custom_annotation.Solution;

public class BstImpl {
	public static void main(String[] args) {
		BinarySearchTree<Integer> bst = new BinarySearchTree<Integer>();
		bst.insert(3);
		bst.insert(2);
		bst.insert(4);
		
		System.out.println(bst.root);
		System.out.println(bst.root.right);
		System.out.println(bst.root.left);
		//coverPoints(new ArrayList<Integer>(Arrays.asList(4, 8, -7, -5, -13, 9, -7, 8)), new ArrayList<Integer>(Arrays.asList(4, -15, -10, -3, -13, 12, 8, -8)));
		
		System.out.println(solve(new ArrayList<Integer>(Arrays.asList(18468, 6335, 26501, 19170, 15725, 11479, 29359, 26963, 24465, 5706, 28146, 23282, 16828, 9962, 492, 2996, 11943, 4828, 5437, 32392, 14605))));
	}
	
	public static int solve(ArrayList<Integer> A) {
        /*for(int i = 0; i < A.size(); i++) {
        	for(int j = i+1; j < A.size(); j++) {
        		for(int k = j+1; k < A.size(); k++) {
        			if(i < j && j < k && A.get(i) < A.get(j) &&  A.get(j) < A.get(k) && ((A.get(i) + A.get(j) + A.get(k)) > sum)) {
        				sum = (A.get(i) + A.get(j) + A.get(k));
        			}
                }
            }
        } */
        Collections.sort(A);
        int N = A.size();
        int sum = 0;
        for(int i = A.size() - 1; i >= 2; i--) {
        	if(A.get(i) > A.get(i-1) && A.get(i-1) > A.get(i-2)) {
        		sum = A.get(i) + A.get(i-1) + A.get(i-2);
        		break;
        	}
        }
        return sum;
    }
	
	 public static int coverPoints(ArrayList<Integer> A, ArrayList<Integer> B) {
	        int stX = A.get(0);
	        int stY = B.get(0);
	        int minSteps = 0;
	        int xDiff = 0;
	        int yDiff = 0;
	        if(stX < 0){
	            xDiff = Math.abs(stX);
	            stX += xDiff;
	        }
	        if(stY < 0){
	            yDiff = Math.abs(stY);
	            stY += yDiff;
	        }
	        for(int i = 1; i < A.size(); i++){
	            int nextX = A.get(i);
	            int nextY = B.get(i);
	            if(xDiff != 0){
	                nextX += xDiff;
	            }
	            if(yDiff != 0){
	                nextY += yDiff;
	            }
	            minSteps = Math.max(Math.abs(nextX-stX), Math.abs(nextY-stY));
	            stX = nextX;
	            stY = nextY;
	        }        
	        return minSteps;
	    }
}
