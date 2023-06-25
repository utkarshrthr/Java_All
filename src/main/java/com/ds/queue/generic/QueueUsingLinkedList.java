package com.ds.queue.generic;

import com.ds.queue.exception.QueueOverflowException;

public class QueueUsingLinkedList<T extends Object> {
	
	private Element<T> head;	// FRONT
	private Element<T> tail;	// REAR
	
	private int MAX_SIZE = 40;
	
	private int SIZE = 0;
	
	public void enque(T data) {
		if(SIZE == MAX_SIZE) {
			throw new QueueOverflowException();
		}
		if(head == null) {
			head = new Element(data);
			tail = head;
			SIZE++;
		}
		else {
			Element e = new Element(data);
			tail.setNext(e);
			tail = e;
		}
	}
	
	
	
	public int size() {
		return SIZE;
	}
}
