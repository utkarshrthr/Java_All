package com.core.multithreading;

import java.io.DataInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.RandomAccess;

public class JoinExample extends Thread {

	static JoinExample example;
	
	@Override
	public void run() {
		try {
			for(int i = 0; i < 5; i++) {
				System.out.println("Child Thread");
				Thread.sleep(2000);
			}
		}
		catch (InterruptedException e) {}
		
		
	}
	
	public static void main(String[] args) {
		
		
		// What is the use 
		
		LinkedList ll = new LinkedList();
		ArrayList al = new ArrayList();
		
		System.out.println(al instanceof Serializable);
		System.out.println(ll instanceof RandomAccess);
		 
	}
}
