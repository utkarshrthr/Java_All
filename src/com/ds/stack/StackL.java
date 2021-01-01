package com.ds.stack;

public class StackL<T extends Comparable<T>> {

	private int MAX_SIZE = 40;
	
	private int SIZE = 0;
	
	private Element<T> top;
	
	public StackL() {
		top = null;
	}
	
	public StackL(int capacity){
		MAX_SIZE = capacity;
		top = null;
	}
	
	public void push(T t) throws StackOverflowException {
		if(SIZE == MAX_SIZE) {
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
		if(top == null) {
			throw new StackUnderflowException();
		}
		return top;
	}
	
	public boolean isEmpty() {
		return top == null;
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
		Element<T> el = top;
		while(el.getNext() != null) {
			sb.append(el.getData()).append(", ");
			el = el.getNext();
		}
		sb.append(el.getData()).append("]");
		return sb.toString();
	}
}
