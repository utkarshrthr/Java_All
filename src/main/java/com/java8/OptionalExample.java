package com.java8;

import java.util.Optional;
/** The purpose of the class is to provide a type-level solution for representing optional values instead of null references.
*/
public class OptionalExample {

	public static void main(String[] args) {
		
		Optional<String> opt = Optional.empty();
		
		opt.orElseThrow(RuntimeException::new);
		
		/*Optional<Integer> emptyOptional = Optional.empty();
		System.out.println(emptyOptional.isPresent());
		//System.out.println(emptyOptional.get());
		
		String[] ar = new String[6];
		String value = Optional.ofNullable(ar[0]).orElse("NOT_FOUND");
		System.out.println(value);
		
		//the argument passed to the of() method can't be null. Otherwise, we'll get a NullPointerException:
		Optional<String> strOpt = Optional.of("character");
		
		String str = strOpt
						.filter(s -> s.length() >5)
						.map(a  -> a.toUpperCase())
						.get();
		System.out.println(str);*/
	}
}
