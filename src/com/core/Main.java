package com.core;

public class Main {
	public static void main(String[] args) {
		/*try {
			throw new Derived();
		} 
		catch (Base e) {
		}
		catch (Derived e) {
			// TODO: handle exception
		}*/
	}
}

class Base extends Exception {
	
}

class Derived extends Base {
	
}