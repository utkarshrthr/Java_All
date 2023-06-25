package com.ds.queue.primitive;

import com.core.multithreading.producer_consumer.QueueOverflowException;

import java.util.Arrays;

public class QueueUsingLinkedList {

	private int maxSize = 1000; 

	private int size = 0; 

	public QueueUsingLinkedList(int maxSize){
		this.maxSize = maxSize;
	}

	public QueueUsingLinkedList(){}

	private static class Node {

		int data;
		Node next;

		Node(int x){
			this.data = x;
		}
	}


	private Node front = null;
	private Node rear = null;

	public void enqueue(int x){
		if(size == maxSize){
			throw new QueueOverflowException("");
		}
		if(front == null){
			front = new Node(x);
			rear = front;
		}
		else {
			rear.next = new Node(x);
			rear = rear.next;
		}
		size += 1;
	}

	public int dequeue(){
		if(size == 0){
			throw new QueueOverflowException("");
		}
		int val = front.data;
		front = front.next;
		size -= 1;
		return val;
	}

	public int front(){
		return front.data;
	}

	public boolean isEmpty(){
		return (front == null);
		//return size == 0;
	}

	public int size(){
		return size;
	}

	@Override
	public String toString(){
		System.out.println("Front: " + front.data + ", Rear: " + rear.data + ", Size: " + size);
		//return Arrays.toString(queue);
		if(isEmpty())
			return "[]";
		StringBuilder output = new StringBuilder();
		output.append("[");
		Node temp = front;
		while(temp != null){
			output.append(temp.data + ", ");
			temp = temp.next;
		}
		output.delete(output.length()-2, output.length());
		output.append("]");
		return output.toString();
	}
}