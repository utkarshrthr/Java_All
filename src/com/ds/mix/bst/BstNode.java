package com.ds.mix.bst;

public class BstNode {
	
	private int value;
	
	private BstNode left;
	private BstNode right;
	
	public BstNode(){
		
	}
	
	public BstNode(int value){
		this.value = value;
		left = right = null;
	}
	
	public int getValue() {
		return this.value;
	}
	
	public BstNode getLeft(){
		return this.left;
	}
	
	public BstNode getRight(){
		return this.right;
	}
	
	public void setLeft(BstNode left){
		this.left = left;
	}
	
	public void setRight(BstNode right){
		this.right = right;
	}
}
