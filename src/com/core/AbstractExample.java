package com.core;

public class AbstractExample extends CalcAbs {
	
	AbstractExample(int abx) {
		super(abx);
	}

	@Override
	public int sum(int a, int b) {
		return 0;
	}

	public static void main(String[] args) {
		
		new AbstractExample(1).sum(1, 2);
	}
}

abstract class CalcAbs implements CalC {
	private int z;
	public int x;
	static int y = 10;
	
	CalcAbs(int abx){
		z = abx;
	}
	
	@Override
	public int sum(int a, int b) {
		return 0;
	}

	@Override
	public int mul(int a, int b) {
		return 0;
	}

	@Override
	public int add(int a, int b) {
		return 0;
	}
	
	@Override
	public int div(int a, int b) {
		return 0;
	}
}

interface CalC {
	public int add(int a, int b);
	public int sum(int a, int b);
	public int mul(int a, int b);
	public int div(int a, int b);
}
