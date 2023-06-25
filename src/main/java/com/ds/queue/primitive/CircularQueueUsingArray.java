package com.ds.queue.primitive;

import com.ds.queue.exception.QueueOverflowException;
import com.ds.queue.exception.QueueUnderflowException;

public class CircularQueueUsingArray {

	private static final int DEFAULT_MAX_SIZE = 1000;

	private final int[] queue;

	private int size = 0;

	int frnt = -1;
	int rear = -1;

	public CircularQueueUsingArray(int size){
		this.queue = new int[size];
	}

	public CircularQueueUsingArray(){
		this.queue = new int[DEFAULT_MAX_SIZE];
	}

	public void enqueue(int x){
		if(frnt == -1){
			frnt = 0; 
			rear = 1;
			queue[frnt] = x;
		}
		else {
			rear = rear % queue.length; 
			if(rear == frnt)
				throw new QueueOverflowException("Queue is full.");
			queue[rear] = x;
			rear += 1;
		}
		size++;
	}

	public int dequeue(){
		frnt = frnt % queue.length;
		if(frnt <= -1)
			throw new QueueUnderflowException("Queue is empty.");
		int val = queue[frnt];
		frnt += 1;
		size -= 1;
		return val;
	}

	public int front(){
		return queue[frnt];
	}

	public boolean isEmpty(){
		return (frnt == -1 || frnt == rear);
		//return size == 0;
	}

	public int size(){
		return size;
	}

	@Override
	public String toString(){
		System.out.println("Front: " + frnt + ", Rear: " + rear + ", Size: " + size);
		//return Arrays.toString(queue);
		if(isEmpty())
			return "[]";
		StringBuilder output = new StringBuilder();
		output.append("[");
		int st = frnt;
		while(true){	
			if(st == rear){
				break;
			}
			else if(st == queue.length){
				st = 0;
			}
			output.append(queue[st] + ", ");
			st++;
		} 
		output.delete(output.length()-2, output.length());
		output.append("]");
		return output.toString();
	}
}