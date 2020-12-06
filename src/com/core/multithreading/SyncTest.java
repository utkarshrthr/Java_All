package com.core.multithreading;

public class SyncTest extends Thread {

	public SyncTest(String name) {
		super(name);
	}
	
	@Override
	public void run() {
		synced();
		unsynced();
	}
	
	public synchronized void synced() {
		for(int i = 0; i < 5; i++) {
			try {
				System.out.println(Thread.currentThread().getName() + " accessing synced block");
				Thread.sleep(2000);
			} 
			catch (InterruptedException e) {
			
			}
		}
	}
	
	public void unsynced() {
		for(int i = 0; i < 5; i++) {
			try {
				System.out.println(Thread.currentThread().getName() + " accessing unsynced block");
				Thread.sleep(2000);
			} 
			catch (InterruptedException e) {
			
			}
		}
	}

	public static void main(String[] args) {
		SyncTest one  = new SyncTest("First Thread");
		one.start();
		SyncTest two  = new SyncTest("Second Thread");
		two.start();
		SyncTest three  = new SyncTest("Third Thread");
		three.start();
	}
}
