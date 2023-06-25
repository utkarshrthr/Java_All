package com.core;

import java.util.ArrayList;
import java.util.List;

public class Abc {

	public static void main(String[] args) {
		List<Boolean> list = new ArrayList<Boolean>();
		list.add(true);
		list.add(Boolean.parseBoolean("FalsE"));
		list.add(Boolean.FALSE);
		System.out.println(list);
	}
}
