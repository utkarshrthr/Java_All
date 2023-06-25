package com.ds.queue.primitive;

import com.ds.queue.exception.QueueOverflowException;
import com.ds.queue.exception.QueueUnderflowException;
import com.ds.stack.StackL;

public class QueueUsing2Stack {
	
	public static void main(String[] args) {
		QueueUsing2Stack queue= new QueueUsing2Stack();
		queue.enque(1);
		queue.enque(2);
		queue.enque(3);
		queue.enque(4);
		queue.enque(5);
		System.out.println(queue);
		System.out.println(queue.deque());
		System.out.println(queue.deque());
		System.out.println(queue.deque());
		System.out.println(queue.deque());
		System.out.println(queue.deque());
		
	}

	private StackL<Integer> one; 
	private StackL<Integer> two;
	
	QueueUsing2Stack(){
		one = new StackL<>();
		two = new StackL<>();
	}
	
	QueueUsing2Stack(int capacity){
		one = new StackL<>(capacity);
		two = new StackL<>(capacity);
	}
	
	public void enque(Integer i) throws QueueOverflowException {
		if(one.isFull())
			throw new QueueOverflowException();
		two.size();
		one.push(i);
	}
	
	public Integer deque() throws QueueUnderflowException {
		if(two.isEmpty()) {
			if(one.isEmpty())
				throw new QueueUnderflowException();
			while(!one.isEmpty()) {
				two.push(one.pop().getData());
			}
		}
		return two.pop().getData();
	}
	
	public void peek() {
		if(one.isEmpty())
			throw new QueueUnderflowException();
		one.peek().getData();
	}
	
	public boolean isFull() {
		return one.isFull();
	}
	
	public boolean isEmpty() {
		return one.isEmpty();
	}
	
	public int size() {
		return one.size();
	}
	
	@Override
	public String toString() {
		return one.toString().length() == 2 ? one.toString() : new StringBuilder(one.toString()).reverse().toString();
	}
}
