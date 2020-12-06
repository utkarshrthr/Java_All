package com.core.multithreading;

public class MainRunnable extends Thread {

	public static void main(String[] args) {
		MainRunnable thread = new MainRunnable();
		thread.start();
		 
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());
	}

	@Override
	public synchronized void start() {
		super.start();
		System.out.println("My Start");
	}
	
	
	@Override
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println(Thread.currentThread().getName());
		}
	}
	
	public void run(int s) {
		for(int i=0;i<5;i++) {
			System.out.println(Thread.currentThread().getName());
		}
	}
}