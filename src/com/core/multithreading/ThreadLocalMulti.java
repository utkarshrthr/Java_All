package com.core.multithreading;

public class ThreadLocalMulti {

	public static void main(String[] args) {
		CustomerThread thread1  = new CustomerThread("Customer Thread - 1");
		CustomerThread thread2  = new CustomerThread("Customer Thread - 2");
		CustomerThread thread3  = new CustomerThread("Customer Thread - 3");
		CustomerThread thread4  = new CustomerThread("Customer Thread - 4");
		
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
	}

}

class CustomerThread extends Thread { 
	static Integer custId = 0;
	private static ThreadLocal local = new ThreadLocal() {
		@Override
		protected Integer initialValue() {
			synchronized (this) {
				return ++custId;
			}
		}
	};
	public CustomerThread(String name) {
		super(name);
	}
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " is executing with Customer Id: "+local.get());
	}
}