package com.ds.linkedlist.doubly;

public class DLLImpl {

	public static void main(String[] args) {
		DoublyLinkedList<Integer> dll = new DoublyLinkedList<>(1);
		dll.prepend(2);
		dll.append(3);
		System.out.println(dll);
	}
}
