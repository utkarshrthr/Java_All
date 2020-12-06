package com.design.pattern.behavioural.observer;

public class StudentObserver extends Observer {

	public StudentObserver(Dean dean){
		this.dean = dean;
		this.dean.attach(this);
	}

	public StudentObserver() {
		
	}
	
	@Override
	public void update(boolean state) {
		System.out.println( state ? "Student is ACTIVE":  "Student is also RELAXED"); 
	}
}