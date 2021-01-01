package com.ds.stack;

import java.lang.reflect.Array;
import java.util.Arrays;

public class StackA<T extends Object> {
	
	private static int MAX_SIZE = 40;
	private static int TOP = -1;
	private T[] elements;
	
	StackA(int capacity){
		MAX_SIZE = capacity;
		this.elements = (T[]) Array.newInstance(Object.class, capacity);
	}
	
	StackA(){
		this.elements = (T[]) Array.newInstance(Object.class, MAX_SIZE);
	}

	public void push(T data) throws StackOverflowException {
		if(TOP+1 == MAX_SIZE) {
			throw new StackOverflowException();
		}
		elements[++TOP] = data;
	}
	
	public T pop() throws StackUnderflowException {
		if(TOP == -1) {
			throw new StackUnderflowException();
		}
		T data = elements[TOP--];
		return data;
	}
	
	public T peek() throws StackUnderflowException {
		if(TOP == -1) {
			throw new StackUnderflowException();
		}
		return elements[TOP];
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
	
	@Override
	public String toString() {
		return Arrays.toString(this.elements);
	} 
}
