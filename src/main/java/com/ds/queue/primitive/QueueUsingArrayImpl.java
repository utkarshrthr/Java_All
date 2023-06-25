package com.ds.queue.primitive;

public class QueueUsingArrayImpl {

	public static void main(String[] args) {
		
		int[] input = {7, 2, 5, 3, 0, 8, 4, 0, 9, 0, 6}; 
		QueueUsingArray queue = new QueueUsingArray();

		for(int inp: input){
			if(inp == 0){
				queue.dequeue();
			}
			else {
				queue.enqueue(inp);
			}
			System.out.println("Front: " + queue.size() + ", size: " + queue.size());
		}
		System.out.println(queue); 
	}
}