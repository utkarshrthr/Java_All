package com.ds.tree.binary;

public class Node<T extends Object> {
	public T data;
	Node<T> left, right;
	
	public Node(T t) {
		this.data = t;
		left = right = null;
	}
	
	@Override
	public String toString() {
		return data.toString();
	}
}
