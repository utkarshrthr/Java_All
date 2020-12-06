package com.ds.tree.binary;

import java.util.Vector;

public class TreeNode<T extends Object> {
	public T key;
	public Vector<T> children;
	public TreeNode(T t) {
		this.key = t;
		this.children = new Vector<>();
	}
}
