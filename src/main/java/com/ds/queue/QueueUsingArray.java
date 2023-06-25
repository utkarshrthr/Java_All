package com.ds.queue;

import java.lang.reflect.Array;

/**
 * @author UtkarshRathore
 */

public class QueueUsingArray<T extends Object> { 
	
	public static void main(String[] args) {
		QueueUsingArray<String> queue = new QueueUsingArray<>(5);
		queue.enQueue("1");
		System.out.println(queue.deQueue());
		queue.enQueue("2");
		System.out.println(queue.deQueue());
		queue.enQueue("3");
		System.out.println(queue.deQueue());
		queue.enQueue("4");
		System.out.println(queue.deQueue());
		queue.enQueue("5");
		queue.enQueue("6");
		System.out.println(queue);
	}
	
	private int FRONT = -1;
	private int REAR = -1;
	private int SIZE = 0;
	private int MAX_SIZE = 40;
	
	private T[] QUEUE;
	
	public QueueUsingArray() {
		QUEUE = (T[]) Array.newInstance(Object.class, MAX_SIZE);
	}
	
	public QueueUsingArray(int capacity) {
		MAX_SIZE = capacity;
		QUEUE = (T[]) Array.newInstance(Object.class, MAX_SIZE);
	}
	
	public void enQueue(T data) {
		if(SIZE == MAX_SIZE) {
			throw new QueueOverflowException();
		}
		refresh();
		if(FRONT == -1 && REAR == -1) {
			QUEUE[++FRONT] = data;
			FRONT = REAR = 0;
		}
		else {
			QUEUE[++REAR] = data;
		}
		SIZE++;
	}
	
	public T deQueue() {
		if(SIZE == 0) {
			throw new QueueUnderflowException();
		}
		T data = QUEUE[FRONT];
		if(FRONT == 0 && REAR == 0) {
			FRONT = REAR = -1;
		}
		SIZE--;
		return data;
	}
	
	public boolean isFull() {
		return FRONT == 0 && REAR == MAX_SIZE;
	}
	
	public boolean isEmpty() {
		return FRONT == -1 && REAR == -1;
	}
	
	public int size() {
		return SIZE;
	}

	private void refresh() {
		if(REAR == (MAX_SIZE-1) && FRONT != 0) {
			for(int i = 0; i < SIZE; i++) {
				QUEUE[i] = QUEUE[FRONT];
				FRONT--; 
				REAR--;
			}
		}
	}
	
	@Override
	public String toString() {
		if(FRONT == -1 && REAR == -1) {
			return "[]";
		}
		StringBuilder sb = new StringBuilder("[");
		for(int i = FRONT; i < REAR; i++) {
			sb.append(QUEUE[i]).append(", ");
		}
		sb.append(QUEUE[REAR]).append("]");
		return sb.toString();
	}
}
