package com.core;

public class Oops {

	public static void main(String[] args) {
		Parent p1 = new Parent();
		Parent p2 = new Child();
		
		try {
			System.out.println(p1.getNum());
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			System.out.println(p2.getNum());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	static class Parent {
		
		public void some() throws RuntimeException {
			System.out.println("Random static method");
		}
		
		protected Number getNum() throws NumberFormatException {
			return 1;
		} 
	}
	
	static class Child extends Parent {
		
		public void some() {
			System.out.println("Random static method");
		}
		
		@Override
		public Integer getNum() throws IllegalArgumentException {
			return 2;
		}
	}
}
