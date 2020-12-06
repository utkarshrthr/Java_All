package com.core.concepts;

public class FinalClass {
	public static void main(String[] args) {
		String s;
		FinalClassEx ex = new FinalClassEx(10);
		System.out.println(ex.getVal());
		String string = new String();
	}
}

final class FinalClassEx {
	private final int x;
	public FinalClassEx(int x) {
		this.x = x; 
	}
	public int getVal() {
		return x;
	}
}