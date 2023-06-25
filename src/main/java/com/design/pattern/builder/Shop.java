package com.design.pattern.builder;

public class Shop {

	public static void main(String[] args) {
		Phone phone = new Phone("iOS", 4, 6.5f, 450);
		System.out.println(phone);
		
		Phone phone2 = new PhoneBuilder().build();
		System.out.println(phone2);
	}
}
