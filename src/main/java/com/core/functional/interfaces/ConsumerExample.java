package com.core.functional.interfaces;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;



/** Lambda expressions are used for interfaces having only one method i.e. FunctionalInterface. These interface are annotated with @FunctionalInterface.
 *  This not only clearly communicates the purpose of this interface, but also allows a compiler to generate an error if the annotated interface does not satisfy 
 *  the conditions. Any interface with a SAM(Single Abstract Method) is a functional interface, and its implementation may be treated as lambda expressions.
 **/

public class ConsumerExample {

	public static void main(String[] args) {
		
		Consumer<Integer> consumerOne = new Consumer<Integer>() {
			@Override
			public void accept(Integer t) {
				System.out.println(t.intValue()*10);
			}
		};
		
		Consumer<Integer> consumerTwo = in -> System.out.println(in/2);
		
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		
		list.forEach(consumerOne);
		list.forEach(consumerTwo);

		Map<String, Integer> nameMap = new HashMap<>();
		
		Integer value1 = nameMap.computeIfAbsent("John", s -> s.length());	// lambda
		Integer value2 = nameMap.computeIfAbsent("John", String::length);	// method-reference
		
		Function<String, Integer> function = new Function<String, Integer>() {
			
			@Override
			public Integer apply(String t) {
				return null;
			}
		};

		BinaryOperator<Integer> binaryOperator = new BinaryOperator<Integer>() {
			
			@Override
			public Integer apply(Integer t, Integer u) {
				// TODO Auto-generated method stub
				return null;
			}
		};
		System.out.println(value1);
	}
}
