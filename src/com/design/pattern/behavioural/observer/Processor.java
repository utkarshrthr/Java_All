package com.design.pattern.behavioural.observer;

public class Processor {

	public static void main(String[] args) {
		
		Dean dean = new Dean();
		
		//StudentObserver student = new StudentObserver(dean);
		//TeacherObserver teacher = new TeacherObserver(dean);
		
		StudentObserver student = new StudentObserver();
		TeacherObserver teacher = new TeacherObserver();
		
		dean.attach(student);
		dean.attach(teacher);
		
		System.out.println("Dean is on round");
		dean.setActive(true);
		
		//System.out.println("Dean is in office");
		//dean.setActive(false);
	}
}
