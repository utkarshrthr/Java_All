package com.ds.heap;

import java.util.LinkedList;
import java.util.Queue;

public class Maxheap {


	public static void main(String[] args) {
		Heap heap = new Heap();
		heap.push(5);
		heap.push(3);
		heap.push(17);
		heap.push(10);
		heap.push(84);
		heap.push(19);
		heap.push(6);
		heap.push(22);
		heap.push(9);
		System.out.println(heap);
		System.out.println(heap.KthLargest(2));
	}
	
	static class Heap {
		private static int HEAP_SIZE = 100;
		static final int[] HEAP = new int[HEAP_SIZE];

		private static int SIZE = 0;

		public void heapSort() {
			while(SIZE>0) {
				int element = pop();
				System.out.print(element+", ");
			}
		}
		
		public int KthLargest(int k) {
			int i = 0;
			while(SIZE>0) {
				int element = pop();
				i++;
				if(i == k)
					return element;
			}
			return -1;
		}
		
		public void push(int element) {
			HEAP[SIZE] = element;
			SIZE++;
			heapifyUp(SIZE-1);
		}
		
		private void heapifyUp(int currentIndex) {
			if(SIZE > 1 && currentIndex > 0) {
				int parentIndex = (currentIndex - 2)/2;
				if(HEAP[parentIndex] < HEAP[currentIndex]) {
					swap(currentIndex, parentIndex);
					heapifyUp(parentIndex);
				}
			}
		}
		
		public int pop() {
			int node = HEAP[0];
			HEAP[0] = HEAP[SIZE];
			SIZE--;
			heapifyDown(0);
			return node;
		}
		
		private void heapifyDown(int currentIndex) {
			int leftChildIndex = 2 * currentIndex + 1;
			int rightChildIndex = 2 * currentIndex + 2;
			if(leftChildIndex <= SIZE && HEAP[currentIndex] < HEAP[leftChildIndex]) {
				swap(leftChildIndex, currentIndex);
				heapifyDown(leftChildIndex);
			}
			if(rightChildIndex <= SIZE && HEAP[currentIndex] < HEAP[rightChildIndex]) {
				swap(rightChildIndex, currentIndex);
				heapifyDown(rightChildIndex);
			}
		}
				
		private void swap(int index1 , int index2) {
			int temp = HEAP[index1];
			HEAP[index1] = HEAP[index2];
			HEAP[index2] = temp;
		}
		
		public void traverse() {
			Queue<Integer> q = new LinkedList<>();
			q.add(0);
			int currentIndex = 0;
			while(!q.isEmpty() && currentIndex <= SIZE) {
				currentIndex = q.poll();
				System.out.println(HEAP[currentIndex]);
				int leftChildIndex = 2*currentIndex+1;
				int rightChildIndex = 2*currentIndex+2;
				q.add(leftChildIndex);
				q.add(rightChildIndex);
			}
			
		}
		
		@Override
		public String toString() {
			StringBuilder builder = new StringBuilder("[");
			if(SIZE == 0) return "[]";
			
			for(int i = 0; i < SIZE; i++) {
				builder.append(HEAP[i]).append(", ");
			}
			if(builder.length()>1) 
				builder.delete(builder.length()-2, builder.length());
			builder.append("]");
			return builder.toString();
		}
	}
}
