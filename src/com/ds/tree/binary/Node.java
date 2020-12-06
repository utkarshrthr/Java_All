package com.ds.tree.binary;

public class Node<T> {
	public T data;
	Node<T> left, right;
	
	public Node(T t) {
		this.data = t;
		left = right = null;
	}
}
