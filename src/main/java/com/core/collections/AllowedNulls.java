package com.core.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class AllowedNulls {
	public static void main(String[] args) {
		
		/*TreeSet<Integer> treeSet = new TreeSet<Integer>();
		
		treeSet.add(null);
		
		System.out.println(treeSet);
		
		TreeMap<Integer, Integer> treeMap = new TreeMap<>();
		
		treeMap.put(null, 1);
		
		System.out.println(treeMap);*/
		
		List<String> list = Arrays.asList("a", "d", "b", "e");
		
		
		list = list.stream().sorted((s1, s2) -> -s1.compareTo(s2)).collect(Collectors.toList());
		
		Collections.sort(list);
		Collections.reverse(list);
		System.out.println(list);
		
		Set<String> set = new HashSet<>();
		set.add("a");
		set.add("c");
		set.add("e");
		set.add("f");
		set.add("h");
		set.add("k");
		set.add("l");
		set.add("e");
		set.add("f");
		for(int i=0;i<5;i++) {
		//	System.out.println(set);
		}
		
		Set<Sample> samples = new HashSet<>();
		System.out.println(new Sample("a").hashCode());
		System.out.println(new Sample("a").hashCode());
	}
}

class Sample {
	
	String id;
	Sample(String id){
		this.id = id;
	}
	public String getid() {
		return this.id;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Sample other = (Sample) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
}

