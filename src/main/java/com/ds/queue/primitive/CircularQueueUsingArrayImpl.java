package com.ds.queue.primitive;

public class CircularQueueUsingArrayImpl {

	public static void main(String[] args) {
		
		int[] input = {7, 2, 5, 3, 0, 8, 4, 0, 9, 0, 6}; 
		CircularQueueUsingArray queue = new CircularQueueUsingArray(6);
		// [3, 8, 4, 9, 6, 0]
		for(int inp: input){
			if(inp == 0){
				queue.dequeue();
			}
			else {
				queue.enqueue(inp);
			}
			System.out.println(queue);
			System.out.println();  
		}
	}
}