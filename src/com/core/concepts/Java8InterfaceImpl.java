package com.core.concepts;

public class Java8InterfaceImpl implements Java8Interface {

	@Override
	public void sampleMethod() {

	}
	
	public void defMethod() {
		System.out.println("Default Method in Impl");
	}

	public static void main(String[] args) {
		
		Java8Interface.statMethod();
		
		Java8Interface sample = new Java8InterfaceImpl();
		sample.defMethod();
	}

}
