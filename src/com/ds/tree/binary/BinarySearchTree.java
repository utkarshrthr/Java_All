package com.ds.tree.binary;

public class BinarySearchTree<T extends Comparable<T>> {

	public Node<T> root;
	
	public BinarySearchTree() {
		
	}
	
	public BinarySearchTree(T t) {
		this.root = new Node<T>(t);
	}
	
	public void insert(T data) {
		if(this.root == null) {
			root = new Node<T>(data);
		}
		else insert(data, this.root);
	}
	
	public Node<T> insert(T data, Node<T> root) {
		if(root == null) {
			return new Node<T>(data);
		}
		else if(root.data.compareTo(data) > 0) {
			 root.left = insert(data, root.left); 
		}
		else if(root.data.compareTo(data) < 0) {
			root.right = insert(data, root.right); 
		}
		else throw new RuntimeException("Duplicate Element found");
		return root;
	}
}
