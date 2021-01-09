package com.core.strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class StringBufferBuilder {
	public static void main(String[] args) {
		Map<User, String> map = new HashMap<User, String>();
		map.put(new User(1, "ajay"), "1");
		map.put(new User(1, "ajay"), "2");
		map.put(new User(1, null), "2");
		map.put(new User(1, null), "2");
		
		map.forEach((k, v) -> {
			System.out.println(k);
			System.out.println(v);
		});
		
		Set<Integer> s = Collections.singleton(null);
		
		List<String> dups = Arrays.asList("a", "a", "c");
		
		dups = dups.stream().distinct().collect(Collectors.toList());
		
		System.out.println(dups);
		
		
	}
}

class User  {
	
	int id;
	String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public User(int id, String name) {
		this.id = id;
		this.name = name;
	}
	/*
	 * @Override public int hashCode() { final int prime = 31; int result = 1;
	 * result = prime * result + id; result = prime * result + ((name == null) ? 0 :
	 * name.hashCode()); return result; }
	 */
	
}
