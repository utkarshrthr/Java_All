package com.core.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class RemoveFromList {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(3);
		list.add(4);
		list.add(2);
		list.add(6);
		list.add(2);
		ListIterator<Integer> iterator = list.listIterator();
		while(iterator.hasNext()) {
			if(iterator.next() == 2) iterator.remove();
		}
		System.out.println(list);
	}
}
