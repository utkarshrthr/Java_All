package com.core.multithreading;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;

public class Deadlock {

	public static void main(String[] args) {
	
		
		Resource resource1 = new Resource("resource-1");
		Resource resource2 = new Resource("resource-2");
		
		Thread thread1 = new Thread("Thread-1") {
			@Override
			public void run() {  
				synchronized (resource1) {  
					System.out.println("Thread 1: locked resource 1");  
					try { 
						Thread.sleep(1000);
					} 
					catch (InterruptedException e) {
						
					}  
					System.out.println("Thread 1 will try to acquire lock on resource 2");  
					synchronized (resource2) {  // thread 2 trying to acquire lock
						System.out.println("Thread 1: locked resource 2");  
					}  
				}  
			}  
		};
		thread1.start();
		
		Thread thread2 = new Thread("Thread-2") {
			@Override
			public void run() {  
				synchronized (resource2) {  
					System.out.println("Thread 2: locked resource 2");  
					try { 
						Thread.sleep(1000);
					} 
					catch (InterruptedException e) {
						
					}  
					System.out.println("Thread 2 will try to acquire lock on resource 1");  
					synchronized (resource1) {  
						System.out.println("Thread 2: locked resource 1");  
					}  
				}  
			}  
		};
		thread2.start();
		
		try { 
			Thread.sleep(3000);
		} 
		catch (InterruptedException e) {
			
		}  
		
		ThreadMXBean bean = ManagementFactory.getThreadMXBean();
		
		long ids[] = bean.findMonitorDeadlockedThreads();
		
		ThreadInfo threadInfo[] = bean.getThreadInfo(ids);
		
		System.out.println(threadInfo.length);
		
		for (ThreadInfo info : threadInfo){
		    System.out.println(info.getThreadName());    
		    
		}
		
	}
}

class Resource {
	
	private String name;
	
	public Resource(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
}