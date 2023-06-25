package com.core.concepts;

public class HashCodeEx implements Cloneable{

	public static void main(String[] args) throws CloneNotSupportedException {
		HashCodeEx ex1 = new HashCodeEx();
		HashCodeEx ex2 = new HashCodeEx();
		System.out.println(ex1.equals(ex2));
		
		System.out.println(ex1.hashCode());
		System.out.println(ex2.hashCode());
		
		HashCodeEx dupe = (HashCodeEx) ex1.clone();
	}
}
