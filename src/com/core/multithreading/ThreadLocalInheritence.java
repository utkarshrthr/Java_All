package com.core.multithreading;

public class ThreadLocalInheritence {

	public static void main(String[] args) {
		ParentThread thread = new ParentThread();
		thread.start();
	}
}

class ParentThread extends Thread {
	
	static ThreadLocal<String> local = new ThreadLocal<>();
	
	static InheritableThreadLocal<String> inLocal = new InheritableThreadLocal() {
		@Override
		public String childValue(Object object) {
			return "Child";
		}
	};
	
	@Override
	public void run() {
		local.set("Parent");
		inLocal.set("Parent");
		System.out.println("Parent thread value: "+local.get());
		ChildThread thread = new ChildThread();
		thread.start();
	} 
}

class ChildThread extends Thread {
	
	@Override
	public void run() {
		System.out.println("Child thread value: "+ ParentThread.inLocal.get());
	}
} 