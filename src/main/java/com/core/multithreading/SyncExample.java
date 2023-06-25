package com.core.multithreading;

public class SyncExample extends Thread {

	Greeting g;
	String name;

	public SyncExample(String threadName, Greeting g, String name) {
		super(threadName);
		this.g = g;
		this.name = name;
	}
	
	public static void main(String[] args) {
		Greeting g1 = new Greeting();
		SyncExample one = new SyncExample("First", g1, "Shubham");
		one.start();
		SyncExample two = new SyncExample("Second", g1, "Ashish");
		two.start();
	}
	
	@Override
	public void run() {
		g.greet(name);
		g.wish(name);
	}
}

class Greeting {
	
	public synchronized void greet(String name) {
		for(int i=0;i<3;i++) {
			try {
				System.out.println("Greet  Morning: "+name);
				Thread.sleep(1000);
			}
			catch (InterruptedException e) { }
		}
	}
	
	public void wish(String name) {
		for(int i=0;i<3;i++) {
			try {
				System.out.println("Wish   Morning: "+name);
				Thread.sleep(1000);
			}
			catch (InterruptedException e) { }
		}
	}
}
