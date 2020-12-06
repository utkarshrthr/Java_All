package com.core.multithreading;

public class MainThread extends Thread {

	@Override
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("In a Thread");
		}
	}
	
	@Override
	public synchronized void start() {
		super.start();
		System.out.println("Gonna do nothing");
	}
	
	public static void main(String[] args) {
		MainThread m = new MainThread();
		m.start();
	}
}
