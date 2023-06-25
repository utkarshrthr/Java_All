package com.ds.linkedlist;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateFromUnsorted {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		list.append(3);
		list.append(2);
		list.append(2);
		list.append(4);
		list.append(1);
		list.append(4);
		list.append(3);
		list.append(2);
		System.out.println(list);
		removeDuplicates(list);
		System.out.println(list);
	}
	
	private static LinkedList<Integer> removeDuplicates(LinkedList<Integer> list){
		Set<Integer> set = new HashSet<Integer>();
		set.add(list.head.t);
		Node<Integer> prev = null;
		Node<Integer> curr = list.head;
		//Node<Integer> next = null;
		while(curr != null) {
			if(set.contains(curr.t)) {
				prev = curr;
				curr = curr.next;
				if(curr == null) {
					prev.next = null;
				}
				else 
					prev.next = curr.next;
			}
			else {
				set.add(curr.t);
				curr = curr.next;
			}
		}
		return list;
	}
}
