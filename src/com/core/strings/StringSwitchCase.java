package com.core.strings;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class StringSwitchCase {
	public static void main(String[] args) {
		
		
		
		Map<String, String> map = new HashMap<String, String>();
		
		map.put("A", "aa");
		map.put("B", "bb");
		
		Set<String> keys = map.keySet();
		Collection<String> values = map.values();
		
		 Set<Entry<String, String>> set = map.entrySet();
		
		
		
		HashMap<String, Object> hm = new HashMap<String, Object>();
		
		hm.put(null, "ads");
		
		String key = "utkarsh";
		switch (key) {
			case "utkarsh": {
				System.out.println("Utkarsh Rathore");
			}
			break;
			case "sushobhit": {
				System.out.println("Sushobhit Rathore");
			}
			break;
			case "Ayush": {
				System.out.println("Ayush Rathore");
			}
			break;
			default:{
				System.out.println("Unknown");
			}
			break;
		}
		
		StringBuffer word = null;
		switch (1) {
		case 1:
			word = new StringBuffer('a');
			break;
		case 2:
			word = new StringBuffer('b');
			break;

		default:
			word = new StringBuffer('c');
			break;
		}
		word.append('d');
		System.out.println(word);
	}
}

class Outer {	// public, default, final, abstract, strictfp
	int x = 10;
	public static void main(String[] args) {
		Outer out = new Outer();
		
		Inner inner1 = out.new Inner();
		Outer.Inner inner2 = out.new Inner();
		
		Inner inner3 = new Outer().new Inner();
		
		Outer.Inner inner4 = new Outer().new Inner();
		
	}
	
	class Inner {	// private, protected, static
		int x = 100;
		
		//static int x = 10;
		public void m1(){
			int x = 1000;
			System.out.println(x);				// 1000	
			System.out.println(this.x);			// 100	// this always refers current inner class object
			System.out.println(Inner.this.x);	// 100
			System.out.println(Outer.this.x);	// 10
		}
	}
	public void m2(){
		Inner inner = new Inner();
		inner.m1();
	}
}


interface Out {
	
	interface In {
		//
	}
}
