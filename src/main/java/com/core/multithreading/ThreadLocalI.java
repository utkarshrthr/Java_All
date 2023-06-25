package com.core.multithreading;

public class ThreadLocalI {

	public static void main(String[] args) {
		ThreadLocal local = new ThreadLocal() {
			public Object initialValue() {
				return "ABC";
			}
		};
		System.out.println(local.get());
		local.set("Utkarsh");
		System.out.println(local.get());
		local.remove();
		System.out.println(local.get());
	}
}
