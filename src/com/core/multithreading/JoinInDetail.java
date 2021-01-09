package com.core.multithreading;

public class JoinInDetail implements Runnable {

	private String threadName;
	
	public JoinInDetail(String name) {
		this.threadName = name;
	}
	
	private static Thread t1;
	private static Thread t2;
	
	public static void main(String[] args) {
		t1 = new Thread(new JoinInDetail("First Thread"));
		t2 = new Thread(new JoinInDetail("Second Thread"));
		
		t1.start();
		t2.start();
	}

	@Override
	public void run() {
		System.out.println(threadName + " is started");
		for(int i = 0; i < 50; i++) {
			try {
				Thread.sleep(1000);
				System.out.println(threadName + " is running");
			} 
			catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
