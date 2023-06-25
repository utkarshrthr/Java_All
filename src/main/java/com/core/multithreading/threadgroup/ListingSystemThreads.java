package com.core.multithreading.threadgroup;

public class ListingSystemThreads {

	public static void main(String[] args) {
		
		
		ThreadGroup system = Thread.currentThread().getThreadGroup().getParent();
		
		Thread[] sysThreadArr = new Thread[system.activeCount()];
		
		int out = system.enumerate(sysThreadArr);
		System.out.println(out);
		
		for(Thread t: sysThreadArr) {
			System.out.println(t.getName() +" : "+t.isDaemon());
		}
		
	}
}
