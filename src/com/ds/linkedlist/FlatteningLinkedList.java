package com.ds.linkedlist;

public class FlatteningLinkedList {
	public static void main(String[] args) {
		
		LinkedList<LinkedList<Integer>> main = new LinkedList<>();
		
		LinkedList<Integer> sub1 = new LinkedList<>(11);
		sub1.append(12);
		sub1.append(13);
		sub1.append(14);
		
		LinkedList<Integer> sub2 = new LinkedList<>(21);
		sub2.append(22);
		sub2.append(23);
		sub2.append(24);
		
		LinkedList<Integer> sub3 = new LinkedList<>(31);
		sub3.append(32);
		sub3.append(33);
		sub3.append(34);
		
		main.append(sub1);
		main.append(sub2);
		main.append(sub3);
		
		System.out.println(flatList(main));
	}
	
	private static LinkedList<Integer> flatList(LinkedList<LinkedList<Integer>> lists){
		LinkedList<Integer> list = new LinkedList<>();
		
		Node<LinkedList<Integer>> listHead = lists.head;
		
		while(listHead != null) {
			LinkedList<Integer> lst = listHead.t;
			Node<Integer> head = lst.head;
			while(head.next != null) {
				list.append(head.t);
				head = head.next;
			}
			listHead = listHead.next;
		}
		return list;
	}
}
