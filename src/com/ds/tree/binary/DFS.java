package com.ds.tree.binary;

public class DFS {
	public static void main(String[] args) {
		BinaryTree bt = new BinaryTree(1);
		bt.root.left = new Node(2);
		bt.root.right = new Node(3);
		
		bt.root.left.left = new Node(4);
		bt.root.left.right = new Node(5);
		dfsPost(bt.root);
	}
	
	private static void dfsIN(Node root) {
		if(root == null) {
			return;
		}
		dfsIN(root.left);
		System.out.print(root + " ");
		dfsIN(root.right);
	}	
	private static void dfsPre(Node root) {
		if(root == null) {
			return;
		}
		System.out.print(root + " ");
		dfsPre(root.left);
		dfsPre(root.right);
	}

	private static void dfsPost(Node root) {
		if(root == null) {
			return;
		}
		dfsPost(root.left);
		dfsPost(root.right);
		System.out.print(root + " ");
	}
}
