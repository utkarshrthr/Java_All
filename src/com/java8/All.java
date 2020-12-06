package com.java8;

import java.io.Closeable;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class All implements YY, ZZ {
	
	public static void main(String[] args) {
		
		Consumer<String> consumer = (String name) -> System.out.println(name.toUpperCase());
		Test t = (int a, int b) ->  0;
		List<String> l = Arrays.asList("a", "b", "c");
		l.forEach(consumer);	
		MyStream myStream = new MyStream();
		
	}

	@Override
	public int x() {
		return 10;
	}	 
}

class MyStream implements Closeable {

	@Override
	public void close()  {
		
	}	
}

interface YY {
	default int x () {
		return 0;
	}
}

interface ZZ {
	default int x () {
		return 0;
	}
}

@FunctionalInterface
interface Test {

	public int ops(int a, int b); 
}
