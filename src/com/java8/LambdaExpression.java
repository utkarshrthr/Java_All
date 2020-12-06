package com.java8;

public class LambdaExpression implements Left, Right {	
	// Duplicate default methods named common with the parameters () and () are inherited from the types Right and Left

	int x = 10;
	
	public static void main(String[] args) {
		Greeting greeting = new Greeting() {
			@Override
			public String wish() {
				return "Good Morning";
			}
		};
		
		System.out.println(greeting.wish());
		
		Greeting greet = () -> "Good Evening";
		System.out.println(greet.wish());
		
		RandomInt randomInt = (x) -> System.out.println(x*3);
	}
	
	public void fun () {
		int y = 20;
		One one = () -> {
			int z = 30;
			System.out.println(x);
			System.out.println(y);
			System.out.println(z);
			x = 11;
			z = 31;
			//y = 21; // Local variable y defined in an enclosing scope must be final or effectively final
		};
	}

	@Override
	public void common() {
		Left.super.common();
	}
}

interface Left {
	default void common() {
		System.out.println("From Left Interface");
	}
}

interface Right {
	default void common() {
		System.out.println("From Right Interface");
	}
}

interface One {
	public void one();
}


interface Greeting {
	public String wish();
}

interface RandomInt {
	public void random(int x);
}
