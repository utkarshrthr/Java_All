package com.core.collections;

import java.util.Set;
import java.util.TreeSet;

public class Miscellaneous {

	public static void main(String[] args) {
		Set<Integer> mySet = new TreeSet<Integer>();
		mySet.add(1);
		mySet.add(2);
		mySet.add(111);
		for(Integer d: mySet){
			//System.out.println(d);
		}
		
		Set intSet = new TreeSet();
		intSet.add(1);
		intSet.add(2);
		intSet.add(111);
		/*for(Integer d: intSet){
			System.out.println(d);
		}*/
		
		Set<String> strSet = new TreeSet<>();
		strSet.add("1");
		strSet.add("2");
		strSet.add("111");
		for(String d: strSet){
			//System.out.println(d);
		}
		
		Set<Day> enumSet = new TreeSet<>();
		enumSet.add(Day.SATURDAY);
		enumSet.add(Day.FRIDAY);
		enumSet.add(Day.WEDNESDAY);
		enumSet.add(Day.WEDNESDAY);
		for(Day d: enumSet){
			System.out.println(d);
		}
	}
}

enum Day {
	MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY
}