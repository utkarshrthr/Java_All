package com.core.collections.maps;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;

public class Maps {
/*
 * SUB_INTERFACES: Bindings, ConcurrentMap<K,V>, ConcurrentNavigableMap<K,V>, LogicalMessageContext, MessageContext, NavigableMap<K,V>, SOAPMessageContext, 
 * 				   SortedMap<K,V>
 * 
 * IMPLEMENTATION_CLASSES: AbstractMap, Attributes, AuthProvider, ConcurrentHashMap, ConcurrentSkipListMap, EnumMap, HashMap, Hashtable, IdentityHashMap, 
 *               LinkedHashMap, PrinterStateReasons, **Properties, Provider, RenderingHints, SimpleBindings, TabularDataSupport, TreeMap, UIDefaults, WeakHashMap
 * 
 * COLLISIONS_HANDLING, UNDERLYING_DATA_STRUCTURES, LOAD_FACTOR/THRESHOLD_VALUE THREAD_SAFE_MAPS, INTERNAL_WORKING, USING_OBJECT_AS_KEY, RETURN_VALUE_OF_PUT,
 * DIFFERENT_WAYS_OF_ITERATING_MAP, INSERTION_ORDER & DEFAULT_SORTED_ORDER, SYNCHRONIZING_COLLECTION, 
 * 
 * 'mappingCount' method 
 * */	
	
	public static void main(String[] args) {
		
		Map<String, String> hashMap = new HashMap<>();
		hashMap.put(null, "First");
		hashMap.put(null, "Second");	// this will simply override the value 
		System.out.println(hashMap);
/* Even though the object is specified as key in hashmap, it does not have any reference and it is not eligible for garbage collection if it is associated with 
 * HashMap i.e. HashMap dominates over Garbage Collector.*/		
		
		Map<String, String> treeMap = new TreeMap<>();
		//treeMap.put(null, "First"); 	// NPE
		System.out.println(treeMap);
		
		Map<String, String> linkedHashMap = new LinkedHashMap<>();
		linkedHashMap.put(null, "First");
		linkedHashMap.put(null, "Second");	// this will simply override the value 
		System.out.println(linkedHashMap);
		
		Map<String, String> hashTable = new Hashtable<>();
		//hashTable.put(null, "First"); 	// NPE
		System.out.println(hashTable);
		
		Map<String, String> concurrentHashMap = new ConcurrentHashMap<>();
		//concurrentHashMap.put(null, "First"); 	// NPE
		System.out.println(concurrentHashMap);
		
		Map<String, String> identityHashMap = new IdentityHashMap<>();
		identityHashMap.put(null, "First"); 
		System.out.println(identityHashMap);
		
		Map<String, String> weakHashMap = new WeakHashMap<>();
		weakHashMap.put(null, "First");
		weakHashMap.put(null, "Second");	// this will simply override the value 
		System.out.println(weakHashMap);
	}
}

/*
 * Even though HashMap represents a hash table, it is internally implemented by using an array and linked list data structure in JDK.  
 * The array data structure is used as a bucket, while a linked list is used to store all mappings which land in the same bucket. 
 * From Java 8 onwards, the linked list is dynamically replaced by binary search tree, once a number of elements in the linked list cross a certain threshold to 
 * improve performance.
 * */
 