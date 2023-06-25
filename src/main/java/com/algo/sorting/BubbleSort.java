package com.algo.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.util.Generator;

public class BubbleSort {

	public static int[] bubbleSort(int[] arr) {
		System.out.println("Sorting array using BUBBLE sort");
		for(int i=0;i<arr.length;i++) {
			boolean isSwapped = false;
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					isSwapped = true;
				}
			}
			if(!isSwapped) break;
		}
		return arr;
	}
	
	public static void main(String[] args) {
		List<String>  list = new ArrayList<String>(); 
        list.add("DoSelect"); 
        list.add("InMobi"); 
        list.add("CampusHash"); 
        list.add("mKhoj");
        list.add("Microsoft");
   
        System.out.println("Original: " + list); 
   
        Collections.rotate(list, -2); 
   
        System.out.println("Rotated: " + list); 
		int[] a = {};
		int[] b = {};
		System.out.println(a.equals(b));
		
		
		int[] arr = Generator.generateArray(100);
		arr = bubbleSort(arr);
		System.out.println(Arrays.toString(arr));
	}
}
