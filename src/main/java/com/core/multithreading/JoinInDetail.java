package com.core.multithreading;

public class JoinInDetail implements Runnable {

	private static Thread mainThread = null;
	private final String name;

	public JoinInDetail(String name) {
		this.name = name;
	}

	public static void main(String[] args) throws InterruptedException {

		mainThread = Thread.currentThread();

		System.out.println(mainThread.getName() + ": " + mainThread.isAlive());

		var t = new Thread(new JoinInDetail("Sub-Thread-1"));

		t.start();

		t.join();

		System.out.println("Exiting main thread");

	}

	@Override
	public void run() {
		for(var i = 0; i < 10; i++){
			System.out.println("Thread: " + name + " is running.");
			try { Thread.sleep(100);
				System.out.println("Thread: " + mainThread.getName() + " is active: " + mainThread.isAlive());
			}
			catch (InterruptedException e){}
		}
	}
}
