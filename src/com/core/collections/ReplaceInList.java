package com.core.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ReplaceInList {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(3);
		list.add(1);
		list.add(4);
		list.add(5);
		list.add(2);
		list.add(6);
		list.add(11);
		list.add(12);
		list.add(13);
		list.add(18);
		list.contains(1);
		
		ListIterator<Integer> iterator = list.listIterator();
		int count = 0;
		while(iterator.hasNext()) {
			int i = iterator.next().intValue();
			if((i % 6 == 0) || (i % 3 == 0) || (i % 2 == 0)) {
				list.set(count, 0);
			}
			count++;
		}
		System.out.println(list);
	}
}
