package com.ds.linkedlist;

import java.util.HashSet;
import java.util.Set;

public class LoopsInLinkedList {

	public static void main(String[] args) {
		
		LinkedList<Integer> list = new LinkedList<>();
		
		list.append(1);
		/*list.append(2);
		list.append(3);
		list.append(4);
		list.append(5);*/
		
		list.head.next = list.head; // creating loop
		
		containsLoopUsingSet(list);
	}
	
	// methods to detect loop
	private static void containsLoopUsingSet(LinkedList<Integer> list) {
		if(list == null || list.head == null) {
			System.out.println("List is empty");
			return;
		}
		Node<Integer> node = list.head;
		Set<Node<Integer>> set = new HashSet<>();
		while(node != null) {
			System.out.println(node.t);
			if(!set.add(node)) {
				System.out.println("Loop detected");
				return;
			}
			node = node.next;
		}
		System.out.println("Loop not detected");
	}
	
	private static void containsLoopTortoiseHare(LinkedList<Integer> list) {
		if(list == null || list.head == null) {
			System.out.println("List is empty");
			return;
		}
		if(list.head.next == null) {
			System.out.println("Loop not detected");
			return;
		}
		if(list.head.next == list.head) {
			System.out.println("Loop detected");
			return;
		}
		Node<Integer> skipOne = list.head;
		Node<Integer> skipTwo = list.head.next;
		while(skipTwo.next != null && skipTwo.next.next != null) {
			if(skipOne == skipTwo) {
				System.out.println("Loop detected");
				return;
			}
			skipOne = skipOne.next;
			skipTwo = skipTwo.next.next;
		}
		System.out.println("Loop not detected");
	}
}
