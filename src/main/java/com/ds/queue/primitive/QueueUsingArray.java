package com.ds.queue.primitive;

public class QueueUsingArray {

	private static final int DEFAULT_MAX_SIZE = 1000;

	private final int[] queue;

	private static int size = 0;

	int front = -1;
	int rear = 0;

	public QueueUsingArray(int size){
		this.queue = new int[size];
	}

	public QueueUsingArray(){
		this.queue = new int[DEFAULT_MAX_SIZE];
	}

	public void enqueue(int x){
		if(front == -1){
			front += 1;
			queue[0] = x;
		}
		else {
			rear += 1;
			queue[rear] = x;
		}
		size++;
	}

	public int dequeue(){
		int val = queue[front];
		front += 1;
		size -= 1;
		return val;
	}

	public int front(){
		return queue[front];
	}

	public boolean isEmpty(){
		return (front == -1 || front == rear);
		//return size == 0;
	}

	public int size(){
		return size;
	}

	@Override
	public String toString(){
		if(isEmpty())
			return "[]";
		StringBuilder output = new StringBuilder();
		output.append("[");
		for(int i = front; i <= rear; i++){
			output.append(queue[i] + ", ");	
		}
		output.append("]");
		return output.toString();
	}
}