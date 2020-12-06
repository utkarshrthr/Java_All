package com.ds.heap;

public class MinHeap<T extends Comparable<T>> extends Heap<T> {
 
	public MinHeap(Class<T> clazz) {
		super(clazz);
	}

	
	public MinHeap(Class<T> clazz, int size) {
		super(clazz, size);
	}

	@Override
	protected void siftDown(int index) {
		int leftChildIndex = getLeftChildIndex(index);
		int rightChildIndex = getLeftChildIndex(index);
		
		int smallerIndex = -1;
		if(leftChildIndex != -1 && rightChildIndex != -1) {
			smallerIndex = getElementAtIndex(leftChildIndex).compareTo(getElementAtIndex(rightChildIndex)) < 0 ? leftChildIndex : rightChildIndex;
		}
		else if(leftChildIndex != -1) {
			smallerIndex = leftChildIndex;
		}
		else if(rightChildIndex != -1) {
			smallerIndex = rightChildIndex;
		}
		
		if(smallerIndex == -1) {	// if the left or right child does not exist stop sifting down
			return;
		}
		
		if(getElementAtIndex(smallerIndex).compareTo(getElementAtIndex(index)) < 0) {
			swap(smallerIndex, index);
			siftDown(smallerIndex);
		}
	}
	
	@Override
	protected void siftUp(int index) {
		int parentIndex = getParentNodeIndex(index);
		
		if(parentIndex != -1 && getElementAtIndex(index).compareTo(getElementAtIndex(parentIndex)) < 0) {
			swap(parentIndex, index);
			siftDown(parentIndex); 
		}
	}
	
	public void heapSort(int[] arr) {
		siftUp(arr.length-1);
		int endIndex = arr.length - 1;
		while(endIndex > 0) {
			swap(0, endIndex);
			endIndex--;
			percolateDown(0, endIndex);
		}
	}
}
