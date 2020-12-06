package com.core.functional.interfaces;

public class CustomFunctionalInterface {

	public static void main(String[] args) {
		
		Player<Integer> playerOne = new Player<Integer>() {
			@Override
			public void play(Integer t) {
				System.out.println(t/2);
			}
		};
		
		Player<Integer> playerTwo = e -> System.out.println(e*10);
		
		playerOne.play(10);
		playerTwo.play(10);
	}
}
