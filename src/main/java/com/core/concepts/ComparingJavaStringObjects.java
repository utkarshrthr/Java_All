package com.core.concepts;

public class ComparingJavaStringObjects {

	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = new String(s1);
		String s3 = "Hello";
		 
		System.out.println(s1 + " equals " + s2 + "--> " +  s1.equals(s2)); // true
		System.out.println(s1 + " == " + s2 + " --> " + (s1 == s2)); 		// false
		System.out.println(s1 + " == " + s3 + " -->" + (s1 == s3)); 		/* true -> both point to the same object due to internal caching. The references s1 and s3 are 
		interned and points to the same object in the string pool (in heap). */
	
		// '==' (i.e. shallow comparison), actually comparing the two object references to see if they point to the same object
		
		// equals -> which is a “deep comparison” that compares the actual string values.
	}
}
