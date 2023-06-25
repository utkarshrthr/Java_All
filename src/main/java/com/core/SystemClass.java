package com.core;

import java.util.stream.Stream;

public class SystemClass {
	public static void main(String[] args) {
		
		try {
			// 
		} 
		catch (Throwable e) {
			
		}
		
		
		int[] a = new int[3];
		a = new int[5];
		
		System.out.println(a.length);
		
		/*long startTime = System.currentTimeMillis();
		int x = 0;
		for (int i = 0; i < Integer.MAX_VALUE*10; i++) {
			x+=1;
		}
		long endTIme = System.currentTimeMillis();
		System.out.println((endTIme-startTime)/1000);
		*/
		Stream<Integer> stream = Stream.of(1,2,3,4,5);
		
		System.out.println("Kolkata".replace('k', 'a'));
		
		bellCurve(new int[] {3, 7, 6, 8, 7, 6}, 1);
	}
	
	private static void bellCurve(int[] ar, int n) {
		for(int i = 0; i< ar.length-1; i++) {
			if(i < n/2) {
				if(!(ar[i] <= ar[i+1])) {
					System.out.println("NO");
					return;
				}
			}
			if(i > n/2) {
				if(!(ar[i] >= ar[i+1])) {
					System.out.println("NO");
					return;
				}
			}
		}
		System.out.println("YES");
	}
}
