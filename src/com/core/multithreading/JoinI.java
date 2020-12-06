package com.core.multithreading;

public class JoinI {

	public static void main(String[] args) {
		JoinChild chintu = new JoinChild("Chintu");
		chintu.start();
		chintu.start();
		System.out.println("abcd");
	}
	
	private class Test {
		// 
	}
}

// yield / join / sleep	(sleeping)//    ready/runnable <-- running state // 
// wait /notify / notifyAll	  waiting <-- running state
// suspend / resume / stop  -> deprecated
// interrupt

/// new Thread() -> new or born state -> .start -> ready/runnable -> scheduler resource allocate -> running state -> run method executes 
// -> dead state 
// yield -> .yield ready/runnable <-- running state, other same or higher priority gets chance execute, if not available then this will continue running
// join ->  ready/runnable <-- running state;  t1, t2 threads, t1 -> running, t2.join()

class JoinChild extends Thread {
	
	public JoinChild(String name) {
		super(name);
	}
	
	@Override
	public void run() {
		try {
			for(int i=0;i<5;i++) {
				System.out.println(Thread.currentThread().getName() + " is running");
				Thread.sleep(1000);
			}
		} 
		catch (InterruptedException e) {
		}
	}
}

// Total hours + 