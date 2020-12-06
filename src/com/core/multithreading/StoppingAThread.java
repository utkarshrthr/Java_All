package com.core.multithreading;

public class StoppingAThread {
	
	public static void main(String[] args) {
		new Thread(new MyThread("Utk")).start();
	}

	static class MyThread implements Runnable { 
    	  
        private volatile boolean exit; 
      
        private String name; 
        Thread t; 
      
        MyThread(String threadname) { 
            name = threadname; 
            t = new Thread(this, name); 
            System.out.println("New thread: " + t); 
            exit = false; 
        } 
        
        public void run() { 
            int i = 0; 
            while (!exit) { 
                System.out.println(name + ": " + i); 
                i++; 
                try { 
                    Thread.sleep(500); 
                } 
                catch (InterruptedException e) { 
                    System.out.println("Caught:" + e); 
                } 
                
                if(i==10)
                	stop();
            } 
            System.out.println(name + " Stopped."); 
        } 
      
        public void stop() { 
            exit = true; 
        } 
    }
}
