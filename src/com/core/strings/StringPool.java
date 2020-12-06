package com.core.strings;

public class StringPool {
	//static String s4 = "abc";
	public static void main(String[] args) {
	    String s = new String("abc");
		String s1 = new String("abc");
		String s2 = "abc";
        System.out.println(s);

        StringPool sp = new StringPool();
        sp.sum(1,2);
        new StringPool().sum(1, 2);
		System.out.println();
		/*String s1 = "abc";
        String s2 = "abc";
        String s3 = new String("abc");
        String s4 = new String("abc");
        System.out.println("s1: "+s1.hashCode());
        System.out.println("s2: "+s2.hashCode());
        System.out.println("s3: "+s3.hashCode());
        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s3==s4);*/
	}

	private void sum(int a, int b){
		int x = 10;
		String s = new String("utkarsh");
		System.out.println();
	}
}
