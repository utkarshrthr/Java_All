package com.core.multithreading.threadgroup;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class TryLockWithTime {
	
	public static void main(String[] args) {
		MyThread3 thread1 = new MyThread3("Kaleen Bhaiya");
		MyThread3 thread2 = new MyThread3("Guddu Bhaiya");
		thread1.start();
		thread2.start();
	}

}

class MyThread3 extends Thread {

	public MyThread3(String name) {
		super(name);
	}
	
	static ReentrantLock reentrantLock =  new ReentrantLock();
	static int i = 1;
	@Override
	public void run() {
		do {
			try {
				if(reentrantLock.tryLock(5000, TimeUnit.MILLISECONDS)) {
					System.out.println(Thread.currentThread().getName()+ " got the Lock");
					Thread.sleep(20000);
					reentrantLock.unlock();
					System.out.println(Thread.currentThread().getName()+ " released the Lock");
					break;
				}
				else {
					System.out.println(Thread.currentThread().getName()+ " didn't get the lock in "+i+ " attempt. Trying again");
					i++;
				}
			} 
			catch (InterruptedException e) {
			
			}
		}
		while(true);
	}
}
