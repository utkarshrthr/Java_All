package com.core.reflection;

public class Dummy {

	static {
		System.out.println("static block");
	}
	
	{
		System.out.println("instance block");
	}
	
	public static int x = 10;
	
	private String name;
	
	protected String contact;
	
	public String status;
	
	private boolean isActive;

	public static int getX() {
		return x;
	}

	public static void setX(int x) {
		Dummy.x = x;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public void dummyOverloadedMethod() {
		
	}
	
	public void dummyOverloadedMethod(String name, String contact) {
		System.out.println(name + " " +contact);
	}
	
	public void dummyOverloadedMethod(String name, String contact, boolean isActive) {
		System.out.println(name + " " +contact + " " + isActive);
	}
	
	public boolean dummyOverloadedMethod(boolean isActive) {
		return !isActive;
	}

	public Dummy() {
		
	}
	
	public Dummy(String name, String contact, String status, boolean isActive) {
		this.name = name;
		this.contact = contact;
		this.status = status;
		this.isActive = isActive;
	}
	
	public Dummy(String name, String contact) {
		this.name = name;
		this.contact = contact;
	}
}
