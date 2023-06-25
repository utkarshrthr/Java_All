package com.core.multithreading;

public class InterruptingAThread {

	public static void main(String[] args) {
		Thread t = new Thread(new MyThread("utk"));
		t.start();
	}
	
	static class MyThread implements Runnable { 
        private String name; 
      
        MyThread(String threadname) { 
            this.name = threadname; 
        } 
        
        public void run() { 
            int i = 0; 
            while (!Thread.currentThread().isInterrupted()) { 
                System.out.println(this.name + ": " + i); 
                i++; 
                try { 
                    Thread.sleep(500); 
                } 
                catch (InterruptedException e) { 
                    System.out.println("Caught:" + e); 
                } 
                if(i==10) {
                	Thread.currentThread().interrupt();
                }
            } 
            System.out.println(name + " Stopped."); 
        } 
    }
}
