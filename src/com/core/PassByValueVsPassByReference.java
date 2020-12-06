package com.core;

import java.util.Arrays;

public class PassByValueVsPassByReference {

	static class User {
		public String name;
	}
	
	public static void main(String[] args) {
		
		int oldNum = 2;
		int newNum = oldNum;
		oldNum = 3;
		System.out.println(oldNum);
		System.out.println(newNum);
		
		User oldUser = new User();
		oldUser.name = "Ajay";
		
		User newUser = oldUser;
		
		oldUser.name = "Vijay";
		
		System.out.println(oldUser.name);
		System.out.println(newUser.name);
		
		
		/*int[] ar = new int[1];
		System.out.println(Arrays.toString(ar));
		new PassByValueVsPassByReference().passByReference(ar);
		System.out.println(Arrays.toString(ar));
		
		int a = -1;
		System.out.println(a);
		new PassByValueVsPassByReference().passByValue(a);
		System.out.println(a);
		
		Object ob1 = new Object();
		Object ob2 = new Object();
		System.out.println(ob1);
		System.out.println(ob2);
		System.out.println();
		swap(ob1, ob2);
		System.out.println(ob1);
		System.out.println(ob2);*/
	}
	
	private void passByReference(int[] ar) {
		ar[0] = 100;
	}
	
	private void passByValue(int a) {
		a = 10;
	}
	
	public static void swap(Object o1, Object o2){
		Object temp = o1;
		o1=o2;
		o2=temp;
	}
}
