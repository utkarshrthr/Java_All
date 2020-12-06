package com.core.multithreading.threadgroup;

public class ThreadGroupExample {

	
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getThreadGroup().getName());
		System.out.println(Thread.currentThread().getThreadGroup().getParent().getName());
		ThreadGroup group = new ThreadGroup("custom");
		System.out.println(group.getName());
		System.out.println(group.getParent().getName());
		ThreadGroup childGroup = new ThreadGroup(Thread.currentThread().getThreadGroup().getParent(), "custom-child");
		System.out.println(childGroup.getName());
		System.out.println(childGroup.getParent().getName());
		
		System.out.println("*******************************************");
		
		ThreadGroup group2 = new ThreadGroup("new-group");
		Thread t1 = new Thread(group2, "T1");
		Thread t2 = new Thread(group2, "T2");
		//group2.setMaxPriority(3);
		Thread t3 = new Thread(group2, "T3");
		
		t1.start();
		t2.start();
		t3.start();
		
		System.out.println(t1.getPriority());	// 5
		System.out.println(t2.getPriority());	// 5
		System.out.println(t3.getPriority());	// 3
		
		group2.list();	// java.lang.ThreadGroup[name=new-group,maxpri=3]
		
		System.out.println(group2.activeCount());
		Thread[] ta = new Thread[10];
		System.out.println(group2.enumerate(ta));

		System.out.println(ta[0]);
		
		for(Thread t:ta) {
			System.out.println(t.getName());
		}
	}
}

