package com.core.strings;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetWithString {
	public static void main(String[] args) {
		
		/*
		 * TreeSet<StringBuilder> set1 = new TreeSet<StringBuilder>(); set1.add(new
		 * StringBuilder("aa"));
		 * 
		 * 
		 * TreeSet<StringBuffer> set2 = new TreeSet<StringBuffer>(); set2.add(new
		 * StringBuffer("bb"));
		 */
		
		TreeSet<Sample> set3 = new TreeSet<Sample>();
		set3.add(new Sample());
		
		TreeSet<StringBuilder> set1 = new TreeSet<StringBuilder>(new Comparator<StringBuilder>() {
			@Override
			public int compare(StringBuilder o1, StringBuilder o2) {
				return 0;
			}
		});
		
		TreeSet<StringBuilder> set2 = new TreeSet<StringBuilder>((o1, o2) -> o1.toString().compareTo(o2.toString()));
		set1.add(new StringBuilder("xyz"));
		
		
	}
	
}

class Sample implements Comparable<Sample>, Comparator<Sample>{

	@Override
	public int compareTo(Sample o) {
		return 0;
	}

	@Override
	public int compare(Sample o1, Sample o2) {
		return 0;
	}
	
}
