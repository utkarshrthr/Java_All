package com.design.pattern.singleton;

public class SingletonPattern extends Thread {

	public boolean flag = true; ///
	
	{// thread-1
		while(flag) {	// flag
			//
		}
	}
// n-thread
	{// thread-2
		flag = false;	// flag
	}
	
	public static void main(String[] args) throws InterruptedException {

		
		
		new SingletonPattern();
		
		Thread thread = null;
		for(int i=0;i<1000;i++) {
			System.out.println(i);
			thread = new Thread(new Runnable() {
				
				@Override
				public void run() {
					DbConnection connection = DbConnection.getInstance();
				}
			});
			thread.start(); 
		}
		
		// get from 1st set in 2nd
		//
		
	}
}

class DbConnection {
	
	private static DbConnection connection = null;
	
	private DbConnection() {
		System.out.println("Connection established");
	}

	public static DbConnection getInstance() {
		synchronized (DbConnection.class) {
			if(connection == null) {
				connection = new DbConnection();
			}
		}
		return connection;
	}
	
}
