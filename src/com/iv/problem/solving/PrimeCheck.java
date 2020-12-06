package com.iv.problem.solving;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PrimeCheck {
	
	private static List<Student> students = new ArrayList<>();
	
	public static void main(String[] args) {
		students.add(new Student(50, "John", 3.75));
		students.add(new Student(24, "Mark", 3.8));
		students.add(new Student(35, "Shafaet", 3.7));
		/*students.add(new Student(36, "Samiha", 3.85));
		students.add(new Student(42, "Ashley", 3.9));
		students.add(new Student(46, "Maria", 3.6));
		students.add(new Student(49, "Anik", 3.95));
		students.add(new Student(50, "Dan", 3.95));*/
		
		students.remove(students.size()-1);
		
		Collections.sort(students);
		Collections.reverse(students);
		for(Student student: students) {
			System.out.println(student);
		}
	}
}

class Student implements Comparator<Student>, Comparable<Student> {

	private int id; 
    private String name; 
    private double cgpa;
	
    public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public double getCgpa() {
		return cgpa;
	}

	Student(int id, String name, double cgpa){
		 this.id = id;
	     this.name = name;
	     this.cgpa = cgpa;
	}
	
	@Override
	public String toString() {
		return this.id + " " + this.name + " " + this.cgpa;
	}

	@Override
	public int compare(Student o1, Student o2) {
		return 0;
		/*if(Double.compare(o1.getCgpa(), o2.getCgpa()) != 0) {
			return Double.compare(o1.getCgpa(), o2.getCgpa());
		}
		else if(!o1.getName().equals(o2.getName())){
			return o1.getName().compareTo(o2.getName());
		}
		else {
			return Integer.compare(o1.getId(), o2.getId());
		}*/
	}
	@Override
	public int compareTo(Student o) {
		if(Double.compare(o.getCgpa(), this.cgpa) != 0) {
			return Double.compare(this.cgpa, o.getCgpa());
		}
		else if(!o.getName().equals(this.name)){
			return this.name.compareTo(o.getName());
		}
		else {
			return Integer.compare(o.getId(), this.id);
		}
	}
}