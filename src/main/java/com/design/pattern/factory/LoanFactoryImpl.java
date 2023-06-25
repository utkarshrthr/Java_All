package com.design.pattern.factory;

public class LoanFactoryImpl {

	public static void main(String[] args) {
		
		LoanFactory factory = new LoanFactory();
		
		HomeLoan homeLoan = (HomeLoan) factory.getLoan("Home");
		
		homeLoan.getName();
	}
}
