package com.core.collections;

import java.util.HashMap;
import java.util.Map;

public class InternalWorkingOfHashMap {

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<>();
		// map will have an array of buckets, default initial size of map is 16 (index starting from 0)
		// each bucket is a linked-list, this linked-list will store key, value, hash-code and (next node reference)
		// here the next-node-reference is to the another linked-list created through hash-code-collision
	
		map.put("Abc", 123);	// the 'put' method first calculate the hash of the key (hash/hash-code -> an integral value)
		// this hash will decide the location of value in the bucket-array and will provide faster-random access
		
		// index = hash * (n-1) 
		
		// hash-collision -> when 2 keys have same hash-code, the duplicate data is added as a new linked list for same bucket
		
		map.put("null", 1);
	}
}
