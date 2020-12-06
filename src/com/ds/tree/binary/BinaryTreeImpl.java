package com.ds.tree.binary;

import java.util.ArrayDeque;
import java.util.Queue;

public class BinaryTreeImpl {

	public static void main(String[] args) {
		BinaryTree<Integer> tree = new BinaryTree<Integer>();
		
		tree.root = new Node<>(15);
		tree.root.left = new Node<>(10);
		tree.root.right = new Node<>(20);
		tree.root.left.left = new Node<>(8);
		tree.root.left.right = new Node<>(12);
		tree.root.right.left = new Node<>(16);
		tree.root.right.right = new Node<>(25);
		
		BinaryTree<Integer> tree2 = new BinaryTree<Integer>();
		
		tree2.root = new Node<>(15);
		tree2.root.left = new Node<>(10);
		tree2.root.right = new Node<>(10);
		tree2.root.left.left = new Node<>(8);
		tree2.root.left.right = new Node<>(12);
		tree2.root.right.left = new Node<>(8);
		tree2.root.right.right = new Node<>(12);
		
		System.out.println(isSymmetric(tree2.root));
		
		System.out.println(heightIterative(tree.root));
		
		tree.inorder();
		tree.postorder();
		tree.preorder();
	}
	
	public static boolean isSymmetric(Node<Integer> root) {
		return isIdentical(root.left, root.right);
	}
	
	public static boolean isIdentical(Node<Integer> root1, Node<Integer> root2) {
		
		if(root1 == null && root2 == null) return true;
		if((root1 == null && root2 != null) || (root1 != null && root2 == null) || (root1.data != root2.data)) return false;

		return isIdentical(root1.left, root2.left) && isIdentical(root1.right, root2.right);
	} 
	
	private static void bfs(Node<Integer> root) {
		
	}
	
	private static int heightRecursive(Node<Integer> root) {
		// recursive
		if(root == null) return 0;
		return 1 + Math.max(heightRecursive(root.left), heightRecursive(root.right));
	}
	
	private static int heightIterative(Node<Integer> root) {
		// iterative
		if(root == null) return 0;
		int h = 0;
		Node<Integer> front = null;
		Queue<Node<Integer>> q = new ArrayDeque<>();	
		q.add(root);
		while(!q.isEmpty()) {
			int size = q.size();
			while(size-- > 0) {
				front = q.poll(); // returns and remove the head of the queue
				
				if(front.left != null) q.add(front.left);
				
				if(front.right != null) q.add(front.right);
			}
			h++;
		}
		return h;
	}
} 