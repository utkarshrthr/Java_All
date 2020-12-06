package com.core.concepts;

public class StaticAndInstance {
	public static void main(String[] args) {

		System.out.println(InstanceTest.x);
		
		InstanceTest instanceTest = new InstanceTest();
		InstanceTest instanceTest2 = new InstanceTest();
		InstanceTest instanceTest3 = new InstanceTest();
		InstanceTest instanceTest4 = new InstanceTest();
		
		System.out.println(InstanceTest.x);
		System.out.println(InstanceTest.x);
		System.out.println(InstanceTest.x);
		System.out.println(InstanceTest.x);
	}
}

class InstanceTest {
	
	{
		System.out.println("Inside instance block");
	}
	
	static {
		System.out.println("Inside static block");
	}
	
	public static int x = 0;
}

