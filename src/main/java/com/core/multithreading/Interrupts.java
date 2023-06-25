package com.core.multithreading;

public class Interrupts {

	public static void main(String[] args) {
		Thread other = new Thread(new Task());
		other.start();
		
		try {
			Thread.sleep(1000);
			other.interrupt();
			System.out.println("Trying to stop Progress");
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	static class Task implements Runnable {

		@Override
		public void run() {
			int i = 0;
			while(i<1000000) {
				 System.out.println("In Progress: "+i);
				/*
				 * try { Thread.sleep(2000); System.out.println("In Progress"); } catch
				 * (InterruptedException e) { System.err.println("Interrupted this"); }
				 */
				i++;
				
				if(Thread.currentThread().isInterrupted()) {
					System.out.println("Stopping");
					Thread.interrupted( );
					return;
				}
			}
		}
	}
}
