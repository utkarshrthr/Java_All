package com.core.concepts.inner_classes;

import com.core.concepts.inner_classes.Top.Inners;

class Nested {
	
	public static void main(String[] args) {
		System.out.println("nested main");
		Inners inners = new Inners();
	}
}

class Top {

	int x = 0;
	static int y = 1;
	private int z = 2;
	
	public void m1() {
		new Inners().m2();
	}
	
	static class Inners {
		 private void m2() {
			 
		 }
	}
}
