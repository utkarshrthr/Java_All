package com.ds.linkedlist;

public class Node<T> { 
	public T t;
	
	public Node<T> next;
	
	public Node(T t) {
		this.t = t;
		this.next = null;
	}
}

/*
public class Node<T extends Comparable<T>> { 
// T represents generic i.e. any data-type can be stored, Comparable -> the data can be checked for equality
 
	public T t;
	
	public Node<T> next;
	
	public Node(T t) {
		this.t = t;
		this.next = null;
	}
}
*/