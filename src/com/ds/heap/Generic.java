package com.ds.heap;

import java.lang.reflect.Array;

public class Generic<T extends Object> {
 
	private T[] getArray(Class<T> clazz, int size) {
		return (T[])Array.newInstance(clazz, size);
	}
	
}
