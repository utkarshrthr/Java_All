package com.core.collections;

import java.util.Comparator;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class ComparatorVsComparable {

	public static void main(String[] args) {
		 
		
		Set<Integer> tree = new TreeSet<>((i1, i2)-> +1 );
		
		tree.add(0);
		tree.add(10);
		tree.add(5);
		tree.add(15);
		tree.add(12);
		tree.add(12);
		
		Test1 t = new Test1();
		
		tree.forEach(t::runner); // static
		tree.forEach(Test1::run); // instance
		
		tree.forEach(User::new);
		
		sum();
		sum(1,2,3);
		
		
		//Object
	}
	
	private static void sum(int... a) {
		for(int i: a) {
			System.out.println(i);
		}
	}
}

class Test1 {
	public static void run(Integer i) {
		System.out.println(i *2);
	}
	
	public void runner(Integer i) {
		System.out.println(i *2);
	}
}

@FunctionalInterface
interface Test {
	
	public void sum();

	boolean equals(Object obj);
}

class User implements Comparable<User>, Comparator<User> {

	private String name;
	
	public User(Integer i) {
		System.out.println(i);
		//this.i = i;
	}
	
	public User(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	@Override
	public int compareTo(User o) {
		return -1;
	}
	
	@Override
	public String toString() {
		return this.name;
	}

	@Override
	public int compare(User o1, User o2) {
		return 0;
	}
}