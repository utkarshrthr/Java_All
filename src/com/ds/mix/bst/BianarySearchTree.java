package com.ds.mix.bst;

public class BianarySearchTree {

	private BstNode root;
	
	public BianarySearchTree() {
		this.root = null;
	}
	
	public BianarySearchTree(int value) {
		this.root = new BstNode(value);
	}
	
	// insert
	public void insert(int value) {
		if(root == null) {
			root = new BstNode(value);
			return;
		}
		BstNode current = root;
		BstNode parent = null;
		while(current != null) {
			parent = current;
			if(value < current.getValue()) {
				current = current.getLeft();
			}
			else if(value > current.getValue()) {
				current = current.getRight();
			}
			else return; // if equals then already present
		}
		// current = new BstNode(value); // THIS
		// OR 
		if(parent.getValue() < value) {
			parent.setRight(new BstNode(value));
		}
		else 
			parent.setLeft(new BstNode(value));
	}
	
	// search 
	
}
