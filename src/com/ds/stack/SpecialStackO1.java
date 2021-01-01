package com.ds.stack;

public class SpecialStackO1 {
	
	public static void main(String[] args) {
		SpecialStackO1 stack = new SpecialStackO1();
		stack.push(1);
		stack.push(3);
		stack.push(5);
		stack.push(2);
		System.out.println(stack.getMin());
	}
	
	private static StackL<Integer> actual = new StackL<>();
	private static StackL<Integer> mins = new StackL<>();
	
	public void push(Integer i) {
		if(mins.isEmpty() || mins.peek().getData() > i) {
			mins.push(i);
		}
		actual.push(i);
	}
	
	public Integer getMin() {
		return mins.isEmpty() ? null : mins.peek().getData();
	}
	
	public Integer pop() {
		Integer temp = actual.peek().getData();
		if(!mins.isEmpty() && temp == mins.peek().getData()) {
			mins.pop();
		}
		return actual.isEmpty() ? null : actual.pop().getData();
	}
	
	public boolean isEmpty() {
		return actual.isEmpty();
	}
	
	public boolean isFull() {
		return actual.isFull();
	}
	
	public int size() {
		return actual.size();
	}
	
	@Override
	public String toString() {
		return actual.toString();
	}
}