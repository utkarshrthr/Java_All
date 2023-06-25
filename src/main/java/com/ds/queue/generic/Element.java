package com.ds.queue.generic;

public class Element<T> {

	private T data;
	private Element<T> next;
	private Element<T> prev;

	public Element(T data) {
		this.data = data;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public Element<T> getNext() {
		return next;
	}

	public void setNext(Element<T> next) {
		this.next = next;
	}

	public Element<T> getPrev() {
		return prev;
	}

	public void setPrev(Element<T> prev) {
		this.prev = prev;
	}
	
	@Override
	public String toString() {
		return this.data.toString();
	}
}
