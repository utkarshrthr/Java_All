package com.gfg.linkedlist;

public class FlatteningList {

	public static void main(String[] args) {
		LinkedList list = new LinkedList(5);
		
	}
	
	static class LinkedList {
		
		Node head;
		
		LinkedList(int data){
			this.head = new Node(data);
		}
		
		static class Node {
			int data;
			Node next, down;
			Node(int data){
				this.data = data;
				this.next = null;
				this.down = null;
			}
		}
	}
}
