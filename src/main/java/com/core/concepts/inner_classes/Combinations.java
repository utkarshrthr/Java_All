package com.core.concepts.inner_classes;

import com.core.concepts.inner_classes.OuterClass.NestedClass;

public class Combinations implements OuterInterface.InnerInterface2 {

	public static void main(String[] args) {
		NestedClass nested = new NestedClass();	// static inner class does not depend strongly on Outer class
		nested.fun();
		
		OuterClass.NestedClass nestedClass = new OuterClass.NestedClass();
		nested.fun();
	}

	@Override
	public void m2() {
		
	}
}

/* class inside a class */
class OuterClass {
	
	class InnerClass1 {
		
	}
	/* interface inside a class */
	interface InnerInterface1 {
		
	}
	
	static class NestedClass {
		public void fun() {
			System.out.println("Nested method");
		}
	}
}

/* class inside a interface */
interface OuterInterface {
	
	public void m1();
	
	class InnerClass2 {
		
	}
	/* interface inside a interface */
	interface InnerInterface2 {
		public void m2();
	}
}




