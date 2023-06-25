package com.design.pattern.factory;

public class LoanFactory {
	
	public Object getLoan(String type) throws ClassCastException {
		
		Object loan = null;
		switch (type) {
			case "Home": {
				loan = new HomeLoan();
			}
			break;
			case "Personal": loan = new PersonalLoan();
				break;
			case "Omni": loan = new OmniLoan();
				break;
			default:throw new LoanNotFoundException("Loan: "+type+" loan is inavlid");
		}
		return loan;
	}
}
