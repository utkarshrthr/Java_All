package com.core.multithreading.threadgroup;

import java.util.concurrent.locks.ReentrantLock;

public class TryLockExample {

	public static void main(String[] args) {
		Display1 Display1 = new Display1();
		MyThread1 thread = new MyThread1(Display1, "abc");
		thread.start();
		MyThread1 thread2 = new MyThread1(Display1, "def");
		thread2.start();
	}
}

class Display1 {
	
	ReentrantLock reentrantLock = new ReentrantLock();
	public void wish(String name) {
		if(reentrantLock.tryLock()) {
			reentrantLock.lock();
			System.out.println("Lock is acquired by "+Thread.currentThread().getName());
			for(int i = 0; i < 5; i++) {
				System.out.print("Good Morning ");
				try {
					Thread.sleep(1000);
				} 
				catch (InterruptedException e) {
				
				}
				System.out.println(name);
			}
			reentrantLock.unlock();
		}
		else {
			System.out.println(Thread.currentThread().getName() + " couldn't get the Lock");
		}
	}
}

class MyThread1 extends Thread {
	Display1 d;
	String name;
	public MyThread1(Display1 d, String name) {
		this.d = d;
		this.name = name;
	}
	@Override
	public void run() {
		d.wish(name);
	}
}
