package com.core.collections.sets;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/***
 * 
 * @author UtkarshRathore
 *
 * SUB_INTERFACES: NavigableSet<E>, SortedSet<E>
 * 
 * IMPLEMENTING_CLASSES: AbstractSet, ConcurrentSkipListSet, CopyOnWriteArraySet, EnumSet, HashSet, JobStateReasons, LinkedHashSet, TreeSet
 * 
 */
public class Sets {

	public static void main(String[] args) {
		
		Set<String> hashSet = new HashSet<>();
		hashSet.add(null);
		
		Set<String> linkedHashSet = new LinkedHashSet<>();
		linkedHashSet.add(null);
		
		Set<String> treeSet = new TreeSet<>();
		treeSet.add(null);
	}
}
