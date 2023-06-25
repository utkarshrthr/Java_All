package com.design.pattern.behavioural.observer;

public class TeacherObserver extends Observer {

	public TeacherObserver(Dean dean){
		this.dean = dean;
		this.dean.attach(this);
	}

	public TeacherObserver() {
		
	}
	
	@Override
	public void update(boolean state) {
		System.out.println( state ? "Teacher is also ACTIVE" : "Teacher is also RELAXED"); 
	}
}
