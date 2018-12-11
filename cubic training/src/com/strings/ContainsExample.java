package com.strings;

public class ContainsExample {
	public static void main(String[] args) {
		String s1="what do you know about me";
		System.out.println(s1.contains("what"));
		System.out.println(s1.contains("do you know"));
		boolean b=s1.contains("about me");
		System.out.println(b);
		System.out.println(s1.contains("aboutme"));
		System.out.println(s1.contains("What"));
	}

}
