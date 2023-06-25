package com.ds.queue.primitive;

public class QueueUsingLinkedListImpl {

	public static void main(String[] args) {
		QueueUsingLinkedList queue = new QueueUsingLinkedList();

		int[] input = {7, 2, 5, 3, 0, 8, 4, 0, 9, 0, 6}; 

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