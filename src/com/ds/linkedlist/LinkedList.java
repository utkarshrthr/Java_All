package com.ds.linkedlist;

import java.util.HashSet;
import java.util.Set;

public class LinkedList<T extends Object> {
	public Node<T> head;
	private int SIZE = 0;
	public LinkedList() {
		this.head = null;
	}
	
	public LinkedList(T t) {
		SIZE++;
		this.head = new Node<>(t);
		this.head.next = null;
	}
	
	/*** ADD A NEW ELEMENT AT THE END OF LINKED-LIST **/
	public void append(T t) {
		SIZE++;
		if(this.head == null) {
			this.head = new Node<>(t);
		}
		else {
			Node<T> temp = head;
			while(temp.next!=null) {
				temp = temp.next;
			}
			temp.next = new Node<>(t);
		}
	}
	
	/*** ADD A NEW ELEMENT AT THE FRONT OF LINKED-LIST **/
	public void prepend(T t) {
		SIZE++;
		if(head == null) {
			head = new Node<T>(t);
		}
		else {
			Node<T> node = new Node<T>(t);
			node.next = head;
			head = node;
		}
	}
	
	/*** ADD A NEW ELEMENT AT A GIVEN INDEX OF LINKED-LIST **/
	public void insert(int index, T t) {
		if(index <0 || index > SIZE || head == null) throw new RuntimeException("InvalidIndexException");
		if(index == 0) {
			prepend(t); return;
		}
		else if(index == (SIZE+1)) {
			append(t); return;
		}
		else {
			SIZE++;
			int count = 0;
			Node<T> node = head;
			while(count < (index-1) && node != null) {
				count++;
				node = node.next;
			}
			Node<T> temp = new Node<T>(t);
			temp.next = node.next;
			node.next = temp;
		}
	}
	
	/** DELETE FROM FRONT */
	public void deleteFromFront() {
		if(head == null) return;
		head = head.next;
		SIZE--;
	}
	
	/** DELETE FROM END */
	public void pop() {
		if(head == null) return;
		SIZE--;
		if(head.next == null) head = null;
		else {
			Node<T> temp = head;
			while(temp.next.next != null) temp = temp.next;
			temp.next = null;
		}
	}
	
	/** DELETE A GIVEN KEY */
	public void deleteKey(T t) {
		 if(head == null) return;
		 if(head.t.equals(t)) {
			 head = head.next; 
			 return;
		 }
		 Node<T> temp = head, prev = null;
		 while(temp != null && !temp.t.equals(t)) {
			 prev = temp; 
			 temp = temp.next;
		 }
		 if(temp == null) return;
		 prev.next = temp.next;
	}
	
	/** DELETE AT GIVEN INDEX */
	public void deleteAt(int index) {
		  if(index < 0 || head == null || index == SIZE) throw new RuntimeException("Invalid Index");
		  if(index == 0) {
			  deleteFromFront(); return;
		  }
		  
		  if(index == SIZE-1) { 
			  pop();
			  return;
		  }
		  SIZE--;
		  int count = 0;
		  Node<T> temp = head;
		  while(count <index && temp.next != null) {
			  temp = temp.next; count++;
		  }
		  if(temp.next != null)
			  temp.next = temp.next.next;
		  else temp.next = null;
	}
	
	/** GET SIZE OF LIST FROM MAINTAINED VARIABLE */
	public int size() {
		return SIZE;
	}
	
	/** GET SIZE OF LIST USING ITERATION */
	public int sizeI() {
		if(head == null) return 0;
		int size = 0;
		Node<T> temp = head;
		while(temp!=null) {
			temp = temp.next;
			size++;
		}
		return size;
	}
	
	/** GET SIZE OF LIST USING ITERATION */
	public int sizeR() {
		if(head == null) return 0;
		return sizeR(head);
	}
	
	public int sizeR(Node<T> root) {
		if(root == null) return 0;
		return 1 + sizeR(root.next);
	}
		
	@Override	/** TRAVERSAL */
	public String toString() {
		StringBuilder builder = new StringBuilder();
		Node<T> temp = head;
		if(temp == null) return "[]";
		
		builder.append("[");
		while(temp!=null) {
			builder.append(temp.t).append(", ");
			temp = temp.next;
		}
		if(builder.length()>1) builder.delete(builder.length()-2, builder.length());
		builder.append("]");
		return builder.toString();
	}
	
	/*** FIND MIDDLE ELEMENT IN SINGLE PASS */
	public T findMidInOnePass() {
		if(head == null) return null;
		if(head.next == null) return head.t;
		
		Node<T> counter1 = head;
		Node<T> counter2 = head;
		while(counter2 != null) {
			if(counter2.next != null) {
				counter2 = counter2.next.next;
			}
			else {
				break;
			}
			counter1 = counter1.next;
		}
		return counter1.t;
	}
	
	
	public boolean hasLoop(){
		Set<Node<T>> nodes = new HashSet<Node<T>>();
		Node<T> temp = head;
		while(head!=null) {
			if(!nodes.add(temp)) return true;
			temp = temp.next;
			
		}
		return false;
	}
	
	/** CONTAINS A GIVEN KEY UISNG ITERATION */
	public boolean containsI(T t) {
		if(head == null) return false;
		if(head.t.equals(t))  {
			head = head.next;
			return true;
		}
		Node<T> temp = head;
		while(temp.next != null) {
			if(temp.t.equals(t))  {
				return true;
			}
			temp = temp.next;
		}
		return false;
	}
	
	/** CONTAINS A GIVEN KEY USING RECURSION */
	public boolean containsR(T t) {
		return contains(t, head);
	}
	
	public boolean contains(T t, Node<T> root) {
		if(root == null) return false;
		if(root.t.equals(t)) return true;
		return contains(t, root.next);
	}
	
	/** GET Nth NODE USING ITERATION */
	public Node<T> getNth(int ind){
		if(head == null || (ind-1) <0  || ind > SIZE) throw new RuntimeException("InvalidIndexException");
		if((ind-1) == 0) return head;
		int count = 0;
		Node<T> temp = head;
		while(count<(ind-1)) {
			count++; 
			temp = temp.next;
		}
		return temp;
	}
	
	/** GET COUNT ITERATIVELY */
	public int getCountI(T t) {
		if(head == null) return 0;
		
		int freq = 0;
		Node<T> temp = head;
		while(temp != null) {
			if(temp.next.equals(t)) freq++;
			temp = temp.next;
		}
		return freq;
	}
	
	/** GET COUNT RECURSIVELY */
	public int getCountR(T t) {
		if(head == null) return 0;
		return getCount(t, head);
	}
	
	public int getCount(T t, Node<T> root) {
		if(root == null) return 0;
		if(root.next.equals(t)) return 1 + getCount(t, root.next);
		else return getCount(t, root.next);
	}
	
	/** GET Nth NODE FROM THE END */
	public Node<T> getNthFromEnd1(int index){
		return getNth(SIZE - index);
	}
	
	/** GET Nth NODE FROM THE END */
	public Node<T> getNthFromEnd2(int index){
		int count = 0;
		Node<T> temp = head;
		Node<T> temp1 = head;
		while(count < index && temp != null) {
			temp = temp.next; 
			count++;
		}
		while(temp.next != null) {
			temp = temp.next;
			temp1 = temp1.next;
		}
		return temp1;
	}
	
	public boolean isPalindrome() {
		if(head==null) {
			 return false;
		}
		if(SIZE==1) {
			return true;
		}
		Node[] arr = new Node[SIZE];
		Node<T> temp = head;
		int ind = 0;
		while(temp != null && ind<SIZE) {
			arr[ind] = temp;
			ind++;
			temp = temp.next;
		}
		temp = head;
		for(int i=SIZE-1;i>0;i--) {
			if(!temp.t.equals(arr[i].t)) return false;
			temp = temp.next;
		}
		return true;
	}
	
	/** REVERSE */
	public void reverse() {
		Node<T> prev = null;
		Node<T> current = head;
		Node<T> next = null;
		while(current != null) {
			next = current.next;
			current.next = prev;
			prev = next;
			
		}
		
		
		/*
		 * Node<T> next = null; Node<T> prev = null; Node<T> curr = head; while (curr !=
		 * null) { next = curr.next; curr.next = prev; prev = curr; curr = next; } head
		 * = prev;
		 */
	}
	
	// A -> B -> C -> D
	// B -> A -> D -> C
	
	// 1 -> 1 -> 3 -> 5 -> 1135
	// 2 -> 5 -> 8 -> 7 => 2587
	
	// 
}
