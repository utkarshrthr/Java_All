package com.core;

import java.util.stream.Stream;

public class Intern {
	
	public static void main(String[] args) {
		String s1 = "abc";
		String s2 = new String("abc");
		s2 = s2.intern();

		System.out.println(s1==s2);
		
		Stream<String> stream = Stream.of("a", "b");
	}
}
