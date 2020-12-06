package com.core.concepts.inner_classes;
/***
 * @author UtkarshRathore
 *
 * Scope of a nested class is bounded by the scope of its enclosing class. A nested class has access to the members, including private members, of the class in which it is nested. However, the
 * enclosing class does not have access to the members of the nested class. A nested class that is declared directly within its enclosing class scope is a member of its enclosing class. It is
 * also possible to declare a nested class that is local to a block.
 * There are two types of nested classes: static and non-static.
 *
 */
public class Outer {
	int a = 10;
	private int b = 20;
	private static int c = 30;
	
	public static void main(String[] args) {
		new Outer().new Inner2();
	}
	
	abstract class Inner {
		 
		int a = 10;
		private int b = 20; 
	
		
		public Inner() {
			 System.out.println(a);
			 System.out.println(b);
			 System.out.println(c);
		} 
	}
	
	
	static class InnerStat {
		public static void main(String[] args) {
			System.out.println("Static Inner Main");
		}
	}
	
	class Inner2 extends Inner implements Interf {
		
	}
	
	interface Interf {
		
	}
}