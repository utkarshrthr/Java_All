package com.core.multithreading.threadgroup;

public class ThreadEx extends Thread {
	
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
	
	public static void main(String[] args) {
		ThreadEx ex = new ThreadEx();
		ex.setName("T1");
		ex.start();
	}
}
