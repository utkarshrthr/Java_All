package com.ds.linkedlist;

public class SumOfLinkedList {
	
	// given 2 linked-list, find the sum of the list, represented as another list
	// list1 = [9, 9, 3]
	// list2 = [2, 7, 8]
	// sum   = [1, 2, 7, 1]
	
	public static void main(String[] args) {
		LinkedList<Integer> list1 = new LinkedList<>(9);
		list1.append(9);
		list1.append(3);
		LinkedList<Integer> list2 = new LinkedList<>(2);
		list2.append(7);
		list2.append(8);
		System.out.println(list1);
		System.out.println(list2); 
		
		System.out.println(add(list1, list2));
	}
	
	private static LinkedList<Integer> add(LinkedList<Integer> list1, LinkedList<Integer> list2){
		// brute-force approach
		StringBuilder sum1 = new StringBuilder();
		StringBuilder sum2 = new StringBuilder();
		Node<Integer> head1 = list1.head;
		while(head1!=null) {
			sum1.append(head1.t);
			head1 = head1.next;
		}
		Node<Integer> head2 = list2.head;
		while(head2!=null) {
			sum2.append(head2.t);
			head2 = head2.next;
		}
		String sumString = String.valueOf(Integer.parseInt(sum1.toString())+Integer.parseInt(sum2.toString()));
		LinkedList<Integer> sum = new LinkedList<>();
		for(String c:sumString.split("")) {
			sum.append(Integer.valueOf(c));
		}
		return sum;
	}
}
