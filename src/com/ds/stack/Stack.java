package com.ds.stack;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Stack<T extends Object> {
	
	private static int MAX_SIZE = 40;
	private static int TOP = -1;
	private Object[] elements;
	
	Stack(int capacity){
		MAX_SIZE = capacity;
		this.elements = (T[]) Array.newInstance(Object.class, capacity);
	}
	
	Stack(){
		this.elements = (T[]) Array.newInstance(Object.class, MAX_SIZE);
	}

	public void push(T data) {
		if(TOP+1 == MAX_SIZE) {
			throw new StackOverFlowException();
		}
		elements[++TOP] = data;
	}
	
	public T pop() {
		if(TOP == -1) {
			throw new StackUnderFlowException();
		}
		T data = (T) elements[TOP--];
		return data;
	}
	
	public T peek() {
		if(TOP == -1) {
			throw new StackUnderFlowException();
		}
		return (T) elements[TOP];
	}
	
	public int size() {
		return TOP+1;
	}
	
	public boolean isFull() {
		return (TOP+1) == MAX_SIZE;
	}
	
	public boolean isEmpty() {
		return TOP == -1;
	}
	
/*	private T[] initializeArray(Class<T> clazz, int capacity) {
		return (T[]) Array.newInstance(clazz, capacity);
	} */
	
	
	@Override
	public String toString() {
		return Arrays.toString(this.elements);
	}
	
	static class StackOverFlowException extends RuntimeException {
		private static final long serialVersionUID = 1L;
		
	}
	
	static class StackUnderFlowException extends RuntimeException {
		private static final long serialVersionUID = 1L;
	}
}
