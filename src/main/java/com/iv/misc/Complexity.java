package com.iv.misc;

abstract class One {
	
	int x;
	
	public One(int x) {
		this.x = x;
	}
	
	public One() {
	}

	public int test() {
		return this.x*this.x;
	}
}

public class Complexity extends One {

	public Complexity(int x) {
		super(20);
	}
	public Complexity() {
		super();
	}
	
	public static void main(String[] args) {
		//x = 20; 		
		//System.out.println(x);
		
		System.out.println(new Complexity(2).test());
		
		try {
			//throw new 20;
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
		//main(null);
		//m1('c', 1);
		boolean breakAtLast = false;
		loopOne: for(int i = 0; i < 10; i++) {
			
			loopTwo: for(int j = 0; j < 10; j++) {
				
				loopThree: for(int k = 0; k < 10; k++) {
					if(k == 7) {
						break loopOne;
					}
				}
			}
		}
		
		//  >
	}
	
	public static void m1(int n1, int n2) {
		System.out.println("int");
	}
	

	public static void m1(long n1, long n2) {
		System.out.println("long");
	}
	
	public static void m1(double n1, double n2) {
		System.out.println("double");
	}
	
	
	// complexity ? a*b
	private static void test(int[] a, int[] b) {
		for(int i = 0; i<a.length; i++) {
			for(int j = 0; j<b.length; j++) {
				System.out.println(a[i] + " " + b[j]);
			}
		}
	}
}

interface Test {
	int x = 10;
}
