package com.ds.linkedlist.doubly;

// HEAD -> [<-][DATA][->]
public class DoublyLinkedList<T extends Object> {
	
	private Node<T> head;
	private int SIZE = 0;
	
	public DoublyLinkedList() {
		
	}
	
	public DoublyLinkedList(T t) {
		this.head = new Node<>(t);
	}
	
	public Node<T> getHead() {
		return head;
	}

	public void setHead(Node<T> head) {
		this.head = head;
	}

	/** ADDING ELEMENTS TO DLL */
	/** ADDING AT FRONT */
	public void prepend(T t) {
		Node<T> node = new Node<>(t);
		node.setNext(head);
		head = node;
		SIZE++;
	}
	
	/** ADDING AT END */
	public void append(T t) {
		SIZE++;
		if(head == null) {
			head = new Node<>(t);
			return;
		}
		Node<T> temp = head;
		while(temp.getNext() != null) {
			temp = temp.getNext();
		}
		temp.setNext(new Node<>(t));
	}
	
	/** ADDING AT GIVEN POSITION */
	public void insertAt(T t, int index) {
		
	}
	
	
	/** REVERSING A LINKED LIST */
	
	@Override
	public String toString() {
		if(head == null) {
			return "[]";
		}
		StringBuilder builder = new StringBuilder("[");
		Node<T> temp = head;
		while(temp.getNext() != null) {
			builder.append(temp.getData()).append(", ");
			temp = temp.getNext();
		}
		builder.append(temp.getData()).append("]");
		return builder.toString();
	}
}
