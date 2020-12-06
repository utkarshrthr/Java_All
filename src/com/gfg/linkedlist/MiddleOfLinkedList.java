package com.gfg.linkedlist;

import com.gfg.linkedlist.MiddleOfLinkedList.LinkedList.Node;

public class MiddleOfLinkedList {
	public static void main(String[] args) {
		LinkedList list = new LinkedList(1);
		list.insert(2);
		list.insert(3);
		list.insert(4);
		list.insert(5);
		//list.show();
		//printMiddle(list);
		
		LinkedList list1 = new LinkedList(4);
		list1.insert(6);
		list1.insert(-10);
		list1.insert(8);
		list1.insert(9);
		list1.insert(10);
		list1.insert(-19);
		list1.insert(10);
		list1.insert(-18);
		list1.insert(20);
		list1.insert(25);
		list1.show();
		//printMiddle(list1);
		System.out.println();
		LinkedList updatedList =  removeZeroSumElement(list1);
		updatedList.show();
		
	}
	
	private static LinkedList removeZeroSumElement(LinkedList list) {
		//Node start = list.head;
		//Node end = list.head.next;
		int sum = list.head.data;
		while(list.head.next != null) {
			sum +=  list.head.next.data;
			if(sum == 0) {
				list.head = list.head.next.next;
				sum += list.head.data;
				list.head.next = list.head.next.next;
			}
			else list.head.next = list.head.next.next;
		}
		return list;
	}
	
	private static void printMiddle(LinkedList list) { // O(n) approach
		Node temp = list.head;
		if(temp == null) {
			return;
		}
		if(temp.next == null) {
			System.out.println(temp.data);
			return;
		}
		Node moveOne = list.head;
		Node moveTwo = list.head;
		while(moveTwo != null && moveTwo.next != null) {
			moveOne = moveOne.next;
			moveTwo = moveTwo.next.next;
		}
		System.out.println(moveOne.data);
	}
	
	static class LinkedList {
		Node head;
		LinkedList(){
			
		}
		LinkedList(int data){
			this.head = new Node(data);
		}
		public void insert(int data) {
			if(head == null) {
				this.head = new Node(data);
				return;
			}
			Node current = head;
			while(current.next != null) {
				current = current.next;
			}
			current.next = new Node(data);
		}
		
		public void show() {
			Node current = head;
			while(current!=null) {
				System.out.print(current.data + " ");
				current = current.next;
			}
		}

		static class Node {
			int data;
			Node next;
			Node(int data){
				this.data = data;
				this.next = null;
			}
		}
	}
}
