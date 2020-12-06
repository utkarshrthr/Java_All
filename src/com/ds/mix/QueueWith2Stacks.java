package com.ds.mix;

import java.util.Stack;

public class QueueWith2Stacks {

	public static void main(String[] args) {

		Queue  queue = new Queue();
		System.out.println(queue.size());
		queue.enque(1);
		queue.enque(2);
		System.out.println(queue.deque());
		queue.enque(3);
		
		
		System.out.println(queue.peek());
		System.out.println(queue.peek());
		System.out.println(queue.peek());
		

		System.out.println(queue.deque());
		System.out.println(queue.deque());
		System.out.println(queue.deque());
		System.out.println(queue.peek());
		
	}

	static class Queue {
		Stack<Integer> stackNew = new Stack<>();
		Stack<Integer> stackOld = new Stack<>();
		
		public void enque(Integer item) {
			stackNew.push(item);
		}
		
		public Integer deque() {
			if(!stackOld.isEmpty())
				return stackOld.pop();
			while(!stackNew.isEmpty()) {
				stackOld.push(stackNew.pop());
			}
			if(stackOld.isEmpty()) {
				throw new RuntimeException("Queue is empty");
			}
			return stackOld.pop();
		}
		
		public Integer peek() {
			if(!stackOld.isEmpty())
				return stackOld.peek();
			while(!stackNew.isEmpty()) {
				stackOld.push(stackNew.pop());
			}
			if(stackOld.isEmpty()) {
				throw new RuntimeException("Queue is empty");
			}
			return stackOld.peek();
		}
		
		public int size() {
			return stackNew.size()+stackOld.size();
		}
	}
}
