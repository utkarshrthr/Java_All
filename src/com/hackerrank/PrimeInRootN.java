package com.hackerrank;

public class PrimeInRootN {

	public static void main(String[] args) {
		int[] ar = {1, 4, 9, 16, 25, 36, 49, 64, 81, 100, 121, 144, 169, 196, 225, 256, 289, 324, 361, 400, 441, 484, 529, 576, 625, 676, 729, 784,
841, 907};
		for(int i:ar) {
			//System.out.println(Math.sqrt(i));
			isPrime(i);
		}
		//isPrime(907);
	}
	
	private static void isPrime(int n) {
		if(n < 2){
			System.out.println("Not prime");
			return;
        }
        else if(n == 2){
        	System.out.println("Prime");
        	return;
        }
        else if(n % 2 == 0 || n % 3 == 0){
        	System.out.println("Not prime");
        	return;
        }
        else {
           for(int i = 2; i<Math.sqrt(n); i++){
               if(n % i == 0){
            	   System.out.println("Not prime");
            	   return;
               }
           } 
        }
		System.out.println("Prime");
	}
}
