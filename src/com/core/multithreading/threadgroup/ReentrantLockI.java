package com.core.multithreading.threadgroup;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockI extends Thread{

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
	
	public static void main(String[] args) {
		ReentrantLock lock = new ReentrantLock();
		
		lock.lock();
		lock.lock();
		
		System.out.println(lock.isLocked());
		System.out.println(lock.getHoldCount());
		System.out.println(lock.isFair());
		System.out.println(lock.isHeldByCurrentThread());
		System.out.println(lock.getQueueLength());
		
		lock.unlock();
		System.out.println(lock.isLocked());
		System.out.println(lock.getHoldCount());
		
		lock.unlock();
		System.out.println(lock.isLocked());
		System.out.println(lock.getHoldCount());
	}
}
