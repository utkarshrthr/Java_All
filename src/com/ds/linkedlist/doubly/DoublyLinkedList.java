package com.ds.linkedlist.doubly;


public class DoublyLinkedList<T extends Object> {
	
	public Node<T> head;
	
	public DoublyLinkedList() {
		//
	}
	
	public DoublyLinkedList(T t) {
		this.head = new Node<>(t);
		this.head.next = this.head.prev = null;
	}
	
	public void addNext(T t) {
		if(head == null) {
			 head = new Node<>(t);
			 return;
		}
		Node<T> temp = head;
		while(temp.next != null) {
			temp = temp.next;
		}
		temp.next = new Node<>(t);
	}
	
	public void addPrev(T t) {
		Node<T> temp = head;
		
		head.prev = temp;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		Node<T> temp = head;
		if(temp == null) return "[]";
		
		while(temp.prev != null) temp = temp.prev;
		
		builder.append("[");
		while(temp.next!=null) {
			builder.append(temp.t).append(", ");
			temp = temp.next;
		}
		if(builder.length()>1) builder.delete(builder.length()-2, builder.length());
		builder.append("]");
		return builder.toString();
	}
}
