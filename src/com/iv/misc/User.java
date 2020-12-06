package com.iv.misc;

abstract class DbConnection {
	
	String schemaName; 
	
	DbConnection(String schemaName){
		this.schemaName = schemaName;
		// connection implementation
	}
	
	public void isConnected() {
		System.out.println("Connected to: "+this.schemaName);
	}
	
	abstract void addUser();
}

public class User extends DbConnection {

	User(String schemaName) {
		super("LEADS");
	}

	@Override
	void addUser() {
		//
	}
}

interface DBDetails {
	//private int x = 20;
	
	static void m1() {
		// common code
	}
	
	static void m2() {
		// common code
	}
	
	
}

