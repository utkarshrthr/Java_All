package com.core.multithreading.threadgroup;

import java.util.concurrent.locks.ReentrantLock;

public class ReplacingSynchronized {

	public static void main(String[] args) {
		Display display = new Display();
		MyThread thread = new MyThread(display, "abc");
		thread.start();
		MyThread thread2 = new MyThread(display, "def");
		thread2.start();
	}
}

class Display {
	
	ReentrantLock reentrantLock = new ReentrantLock();
	public synchronized void wish(String name) {
		reentrantLock.lock();
		for(int i = 0; i < 5; i++) {
			System.out.print("Good Morning ");
			try {
				Thread.sleep(1000);
			} 
			catch (InterruptedException e) {
			
			}
			System.out.println(name);
		}
		System.out.println(reentrantLock.isHeldByCurrentThread());
		reentrantLock.unlock();
	}
}

class MyThread extends Thread {
	Display d;
	String name;
	public MyThread(Display d, String name) {
		this.d = d;
		this.name = name;
	}
	@Override
	public void run() {
		d.wish(name);
	}
}