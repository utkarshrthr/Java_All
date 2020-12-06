package com.ds.linkedlist.doubly;

public class Node<T extends Object> {
	public T t;
	public Node<T> prev;
	public Node<T> next;
	
	public Node() {
		
	}
	
	public Node(T t) {
		this.t = t;
		this.next = this.prev = null;
	}
}
