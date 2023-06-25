package com.problemsolving;

public class MinimumDeletion {

	public static void main(String[] args) {
		String ip = "ABABABAB";
		System.out.println(getMinimumDeletion(ip));
		
		int[] a = {4, 2, 3, 1};
		int swaps = 0;
        for(int i=0;i<a.length;i++){
            boolean isSorted = true;
            for(int j=0;j<a.length-1;j++){
                if(a[j]>a[j+1]){
                    int temp = a[j+1];
                    a[j+1] = a[j];
                    a[j] = temp;
                    swaps++;
                   // isSorted = false;
                }
                if(isSorted){
                    break;
                }
            }
        }
        System.out.println(swaps);
		
	}
	
	private static int getMinimumDeletion(String ip) {
		int minDeletions = 0;
		for(int i=0;i<ip.length()-1;i++) {
			if(ip.charAt(i) == ip.charAt(i+1)) {
				minDeletions++;
			}
		}
		return minDeletions;
	}
}
