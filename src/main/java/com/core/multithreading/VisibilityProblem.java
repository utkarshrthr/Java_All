package com.core.multithreading;

public class VisibilityProblem {

	private volatile static int flag = 0;
	
	public static void main(String[] args) {

		new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println(flag + " in "+ Thread.currentThread().getName());
				flag = 2;
			}
		}).start();

		new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println(flag + " in "+ Thread.currentThread().getName());
				flag = 1;
			}
		}) .start();
		System.out.println(flag + " in "+ Thread.currentThread().getName());
	}
	
	
}
