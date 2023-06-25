package com.core.enums;

public enum Months implements EnumInterf {
	
	JANUARY(31), FEBRUARY(29), MARCH, APRIL, MAY, JUNE;

	
	private Months(){
		
	}
	
	Months(int i) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean has31(Months month) {
		return false;
	}

	@Override
	public boolean has30(Months month) {
		// TODO Auto-generated method stub
		return false;
	}

	 
	 
}
