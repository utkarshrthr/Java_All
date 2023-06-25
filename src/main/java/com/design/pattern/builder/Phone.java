package com.design.pattern.builder;

public class Phone {
	
	String os;
	int ramSize;
	float screenSize;
	int battery;
	
	public String getOs() {
		return os;
	}
	
	public Phone(String os, int ramSize, float screenSize, int battery) {
		super();
		this.os = os;
		this.ramSize = ramSize;
		this.screenSize = screenSize;
		this.battery = battery;
	}
	
	public void setOs(String os) {
		this.os = os;
	}
	public int getRamSize() {
		return ramSize;
	}
	public void setRamSize(int ramSize) {
		this.ramSize = ramSize;
	}
	public float getScreenSize() {
		return screenSize;
	}
	public void setScreenSize(float screenSize) {
		this.screenSize = screenSize;
	}
	public int getBattery() {
		return battery;
	}
	public void setBattery(int battery) {
		this.battery = battery;
	}

	@Override
	public String toString() {
		return "Phone [os=" + os + ", ramSize=" + ramSize + ", screenSize=" + screenSize + ", battery=" + battery + "]";
	}
}
