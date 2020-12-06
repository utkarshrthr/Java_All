package com.ds.linkedlist;

public class LinkedListImpl {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>(1);
		list.append(2);
		list.append(3);
		list.append(4);
		list.append(5);
		list.append(4);
		list.append(5);
		System.out.println(list); 
	}
}
