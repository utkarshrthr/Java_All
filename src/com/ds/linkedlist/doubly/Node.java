package com.ds.linkedlist.doubly;

public class Node<T extends Object> {
	
	private T data;
	private Node<T> prev;
	private Node<T> next;
	
	public Node(T t) {
		this.data = t;
		this.next = this.prev = null;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public Node<T> getPrev() {
		return prev;
	}

	public void setPrev(Node<T> prev) {
		this.prev = prev;
	}

	public Node<T> getNext() {
		return next;
	}

	public void setNext(Node<T> next) {
		this.next = next;
	}
	
	@Override
	public String toString() {
		return this.data.toString();
	}
}
