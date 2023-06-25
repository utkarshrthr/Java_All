package com.core.multithreading;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ConcurrentModificationExceptionI extends Thread {

	private static List<String> list = new ArrayList<>();
	
	@Override
	public void run() {
		try {
			Thread.sleep(2000);
		} 
		catch (InterruptedException e) {
		}
		System.out.println("Child updating list");
		list.add("abc");
	}
	
	public static void main(String[] args) throws InterruptedException {
		list.add("a");
		list.add("b");
		list.add("c");
		
		ConcurrentModificationExceptionI i = new ConcurrentModificationExceptionI();
		i.start();
		
		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
			Thread.sleep(3000);
		}
		System.out.println(list);
	}
}
