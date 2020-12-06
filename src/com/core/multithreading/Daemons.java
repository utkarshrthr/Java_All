package com.core.multithreading;

public class Daemons extends Thread {
	
	public static void main(String[] args) {
		System.out.println("Main thread is started");
		//Thread.currentThread().setDaemon(true); // IllegalThreadStateException
		ChildDaemon daemons = new ChildDaemon();
		daemons.setDaemon(true);
		daemons.start();
		System.out.println("Main thread is terminated");
	}
}

class ChildDaemon extends Thread {

	@Override
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("Child Thread running...");
		}
	}
}