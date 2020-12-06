package com.ds.heap;

import java.lang.reflect.Array;

public abstract class Heap<T extends Comparable<T>> {
	
	private static int MAX_SIZE = 40;
	private T[] array;
	private int count = 0;
	
	public Heap(Class<T> clazz) {
		this(clazz, MAX_SIZE);
	}
	
	public Heap(Class<T> clazz, int size) {
		this.array = (T[]) Array.newInstance(clazz, size);
	}
	
	public int getLeftChildIndex(int index) {
		return getLeftChildIndex(index, count);
	}
	
	public int getLeftChildIndex(int index, int endIndex) {
		int leftChildIndex = 2 * index + 1;
		
		if(leftChildIndex >= endIndex) {
			return -1;
		}
		return leftChildIndex;
	}
	
	public int getRightChildIndex(int index) {
		return getRightChildIndex(index, count);
	}
	
	public int getRightChildIndex(int index, int endIndex) {
		int rightChildIndex = 2 * index + 2;
		
		if(rightChildIndex >= endIndex) {
			return -1;
		}
		return rightChildIndex;
	}
	
	public int getParentNodeIndex(int index) {
		
		if(index < 0 || index > count) {
			return -1;
		}
		return (index -1)/2;
	}
	
	public void insert(T element) {	// O(Log N)
		if(count >= array.length) {
			// throw Heap-full-exception
		}
		array[count] = element;
		siftUp(count);
		count++;
	}
	
	public T removeHighestPriority() {	// in min-heap highest priority will always be at 0 index, 
		T min = getHighestPriorityElement();
		array[0] = array[count-1];
		count--;
		siftDown(0);
		return min;
	}
	
	public T getHighestPriorityElement() { //  O(Log N)
		// throw Heap-empty-exception
		return array[0];
	}
	
	/**** HELPER METHODS *********/
	public int getCount() {
		return count;
	}
	
	public boolean isEmpty() {
		return count == 0;
	}
	
	public boolean isFull() {
		return count == array.length;
	}
	
	public T getElementAtIndex(int index) {
		return array[index];
	}
	
	protected void swap(int index1, int index2) {
		T tempVal = array[index1];
		array[index1] = array[index2];
		array[index2] = tempVal;
	}
	
	/**** HEAPIFY OPERATIONS ****/
	protected abstract void siftUp(int index);	
	
	protected abstract void siftDown(int index);
	
	protected void percolateDown(int index, int endIndex){
		int leftChildIndex = getLeftChildIndex(index, endIndex);
		int rightChildIndex = getLeftChildIndex(index, endIndex);
		if(leftChildIndex != -1 && array[leftChildIndex].compareTo(array[index]) > 0) {
			swap(leftChildIndex, index);
			percolateDown(leftChildIndex, endIndex);
		}
		if(leftChildIndex != -1 && array[rightChildIndex].compareTo(array[index]) > 0) {
			swap(rightChildIndex, index);
			percolateDown(rightChildIndex, index);
		}
	}
}
