package com.ds.stack;

public class StackL<T extends Comparable<T>> {

	private static int MAX_SIZE = 40;
	
	private static int SIZE = 0;
	
	private Element<T> top;
	
	public StackL() {
		top = null;
	}
	
	StackL(int capacity){
		MAX_SIZE = capacity;
		top = null;
	}
	
	public void push(T t) throws StackOverflowException {
		if(SIZE ==  MAX_SIZE) {
			throw new StackOverflowException();
		}
		Element<T> newElement = new Element<>(t, top);
		top = newElement;
		SIZE++;
	}
	
	public Element<T> pop() throws StackUnderflowException {
		if(SIZE ==  0) {
			throw new StackUnderflowException();
		}
		Element<T> element = top;
		top = top.getNext();
		SIZE--;
		return element;
	}
	
	public Element<T> peek() throws StackUnderflowException {
		if(SIZE == 0) {
			throw new StackUnderflowException();
		}
		return top;
	}
	
	public boolean isEmpty() {
		return SIZE == 0;
	}
	
	public boolean isFull() {
		return SIZE == MAX_SIZE;
	}
	
	public int size() {
		return SIZE;
	}
	
	@Override
	public String toString() {
		if(top == null)
			return "[]";
		StringBuilder sb = new StringBuilder("[");
		while(top.getNext() != null) {
			sb.append(top.getData()).append(", ");
			top = top.getNext();
		}
		sb.append(top.getData()).append("]");
		return sb.toString();
	}
}
