package com.ds.linkedlist;

public class Node<T> {
	public T t;
	
	public Node<T> next;
	
	public Node(T t) {
		this.t = t;
		this.next = null;
	}
}
