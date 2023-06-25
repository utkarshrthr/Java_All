package com.core;

public class MemoryStats {
	public static void main(String[] args) {
		
		Runtime r = Runtime.getRuntime();
		r.maxMemory();	// in bytes
		r.totalMemory();
		r.freeMemory();
		System.out.println("Consumed Memory: " + (r.totalMemory() - r.freeMemory()));
		
		try {
			 
		} 
		catch (NumberFormatException e) {
			e.printStackTrace();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}