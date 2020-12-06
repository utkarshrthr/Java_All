package com.core.multithreading;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapI extends Thread {

	private static ConcurrentHashMap<String, String> map = new ConcurrentHashMap<>();
	
	@Override
	public void run() {
		try {
			Thread.sleep(2000);
		} 
		catch (InterruptedException e) {
		}
		System.out.println("Child updating MAP");
		map.put("abc", "ABC");
	}
	
	public static void main(String[] args) throws InterruptedException {
		map.put("a", "A");
		map.put("b", "B");
		map.put("c", "C");
		ConcurrentHashMapI i = new ConcurrentHashMapI();
		i.start();
		Set<String> keySet = map.keySet();
		Iterator<String> iterator = keySet.iterator();
		while (iterator.hasNext()) {
			String key = iterator.next();
			System.out.println(map.get(key));
			Thread.sleep(3000);
		}
		System.out.println(map);
	}

}
