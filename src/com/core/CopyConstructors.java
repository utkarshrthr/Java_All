package com.core;

public class CopyConstructors {
	public static void main(String[] args) {
		User orginal = new User(1, "ajay");
		
		User copied = new User(orginal);
		
		System.out.println(copied.getId());
		
		// wait, sleep, join, 
		// yield t1.yield() -> higher/same 
		// sleep -> 
		
// new/born -> ready/runnable -> running -> dead-state		
// running -> sleeping state		
	}
}


class User {
	
	private int id;
	private String name;
	
	User(){
		
	} 
	
	User(int id, String name){
		this.id = id;
		this.name = name;
	} 
	
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	
	User(User user){
		this.id = user.id;
		this.name = user.name;
	}
}