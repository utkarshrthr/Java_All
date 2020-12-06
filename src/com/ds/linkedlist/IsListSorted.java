package com.ds.linkedlist;

public class IsListSorted {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>(0);
		list.append(1);
		list.append(2);
		list.append(3);
		list.append(4);
		
		System.out.println(isSorted(list));
	}
	
	// Using LOOP
	public static boolean isSorted(LinkedList<Integer> list) {
		Node<Integer> temp = list.head;
		while(temp.next != null) {
			if(temp.t >temp.next.t) return false;
			temp = temp.next;
		}
		return true;
	}

	// Using RECURSION
	public static boolean isSortedRecRec(LinkedList<Integer> list) {
		if(list == null || list.head == null || list.head.next == null) return true;
		return isSortedRecRec(list.head, list.head.next);
	}
	
	
	public static boolean isSortedRecRec(Node<Integer> i, Node<Integer> j) {
		if(j == null) return true;
		if(i.t > j.t) return false;
		return isSortedRecRec(i.next, j.next);
	}
}

/*

class LinkedList<T> {
	public Node<T> head;
	
	public LinkedList() {
		this.head = null;
	}
	
	public LinkedList(T t) {
		this.head = new Node<>(t);
		this.head.next = null;
	}
	
	public void add(T t) {
		if(this.head == null) {
			this.head = new Node<>(t);
		}
		else {
			Node<T> temp = head;
			while(temp.next!=null) {
				temp = temp.next;
			}
			temp.next = new Node<>(t);
		}
	}
	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		if(this.head == null) return "[]";
		
		builder.append("[");
		while(head!=null) {
			builder.append(head.t).append(", ");
			head = head.next;
		}
		if(builder.length()>1) builder.delete(builder.length()-2, builder.length());
		builder.append("]");
		return builder.toString();
	}
}

class Node<T> {
	public T t;
	public Node<T> next;
	
	public Node(T t) {
		this.t = t;
		this.next = null;
	}
}
*/