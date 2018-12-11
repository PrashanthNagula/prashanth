package com.strings;

public class HashCode {
	static int a=10;
	
	static String s="prashanth";
	public static void main(String[] args) {
		HashCode h=new HashCode();
		HashCode h1=new HashCode();
		
		System.out.println(s.hashCode());
		System.out.println(h.s);
		System.out.println(h.hashCode());
		System.out.println(h1.hashCode());
	}

}
