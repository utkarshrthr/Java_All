package com.ds.stack;

public class Element<T extends Object> {

	private T data;
	private Element<T> next;
	
	/*public Element(T t) {
		this(t, null);
	}*/
	
	public Element(T t , Element<T> next) {
		this.data = t;
		this.next = next;
	}
	
	public T getData() {
		return this.data;
	}
	
	public void setData(T t) {
		this.data = t;
	}
	
	public Element<T> getNext(){
		return this.next;
	}
	
	public void setNext(Element<T> e){
		this.next = e;
	}
	
	@Override
	public String toString() {
		return this.data.toString();
	}
}
