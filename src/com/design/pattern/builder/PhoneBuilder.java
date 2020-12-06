package com.design.pattern.builder;

public class PhoneBuilder {

	private  Phone phone;
	
	String os;
	int ramSize;
	float screenSize;
	int battery;
	
	public PhoneBuilder setPhone(Phone phone) {
		this.phone = phone;
		return this;
	}
	public PhoneBuilder setOs(String os) {
		this.os = os;
		return this;
	}
	public PhoneBuilder setRamSize(int ramSize) {
		this.ramSize = ramSize;
		return this;
	}
	public PhoneBuilder setScreenSize(float screenSize) {
		this.screenSize = screenSize;
		return this;
	}
	public PhoneBuilder setBattery(int battery) {
		this.battery = battery;
		return this;
	}
	
	public Phone build() {
		return new Phone(os, ramSize, screenSize, battery);
	}
}
