package com.ds.linkedlist.doubly;

public class DLLImpl {

	public static void main(String[] args) {
		DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
		
		list.addNext(1);
		list.addNext(2);
		list.addNext(3);
		list.addPrev(0);
		list.addNext(-1);
		list.addNext(-2);
		
		System.out.println(list);
	}
}
