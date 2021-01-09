package com.ds.tree.binary;

import java.text.MessageFormat;

public class BinaryTree<T extends Comparable<T>> {
	Node<T> root;
	
	BinaryTree(T key) { 
		this.root = new Node<T>(key); 
    } 
  
    BinaryTree() { 
    	this.root = null; 
    } 
    
    public void inorder() {	// (Left, Root, Right) 
    	System.out.println();
    	inorder(this.root);
    	System.out.println();
    }
    
    private void inorder(Node<T> node) {	
    	if(node == null) return;
    	inorder(node.left);
    	System.out.print(MessageFormat.format("{0} -> ", node.data));
    	inorder(node.right);
    }
    
    public void preorder() { // (Root, Left, Right)
    	System.out.println();
    	preorder(this.root);
    	System.out.println();
    }
    
    private void preorder(Node<T> node) {	
    	if(node == null) return;
    	System.out.print(MessageFormat.format("{0} -> ", node.data));
    	preorder(node.left);
    	preorder(node.right);
    }
    
    public void postorder() { // (Root, Left, Right)
    	System.out.println();
    	postorder(this.root);
    	System.out.println();
    }
    
    private void postorder(Node<T> node) { // (Left, Right, Root)
    	if(node == null) return;
    	postorder(node.left);
    	postorder(node.right);
    	System.out.print(MessageFormat.format("{0} -> ", node.data));
    }
}
