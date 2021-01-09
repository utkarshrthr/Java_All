package com.hackerearth.string;

public class DeletionForAnagram {

	public static void main(String[] args) {
		System.out.println(getDeletions("cde", "abc"));
		
		System.out.println(getFactorial(3));
		
		System.out.println(isPalindrome("fnjzxnxnjplfwzowfdrhrvhegkmoncbkembjoudteqchjwqfzlofyflkmxnooasxulwofjzknthqqxgshvwxdvhdnlzjzdjdiifg"));
	}

	private static int getDeletions(String one, String two) {
		int[] ar = new int[26];
		int deletions = 0;
		for(char c:one.toCharArray()) {
			ar[c-97] += 1;
		}
		for(char c:two.toCharArray()) {
			ar[c-97] -= 1;
		}
		for(int i : ar) {
			if(i != 0) {
				deletions += Math.abs(i);
			}
		}
		return deletions;
	}
	
	private static int getFactorial(int n){
        int factorial = n;
        for(int i = 1; i < n; i++){
        	factorial *= (n - i);
        }
        return factorial;
    }
	
	private static boolean isPalindrome(String input){
        int st = 0;
        int en = input.length()-1;
        while(st < en){
            if(input.charAt(st) != input.charAt(en)){
                return false;
            }
        }
        return true;
    }
}
