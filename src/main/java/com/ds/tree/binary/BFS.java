package com.ds.tree.binary;

import java.util.LinkedList;
import java.util.Queue;

public class BFS {

	public static void main(String[] args) {
		
		BinaryTree<String> b = new BinaryTree<>("A");
		
		b.root.left = new Node<>("B");
		b.root.right = new Node<>("C");
		
		
		b.root.right.left = new Node<>("D");
		
		b.root.right.left.left = new Node<>("F");
		b.root.right.left.right = new Node<>("H");
		
		
		b.root.right.right = new Node<>("E");	
		b.root.right.right.right = new Node<>("G");		

		bfs(b.root);
	}
	
	private static void bfs(Node root) {
		Queue<Node> queue = new LinkedList<>();
		queue.add(root);
		while(!queue.isEmpty()) {
			Node top = queue.remove();
			System.out.print(top + " ");
			if(top.left != null)
				queue.add(top.left);
			if(top.right != null)
				queue.add(top.right);
		}
	}
}
