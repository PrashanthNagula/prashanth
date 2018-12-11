package com.strings;

public class ConcatExample {
	public static void main(String[] args) {
		String s1="hello";
		String s2="prashanth";
		String s3="welcome to cubic";
		String s6="javatpoint";
		String s4=s1.concat(s2);
		System.out.println(s4);
		String s5=s1.concat(s2).concat(s3);
		System.out.println(s5);
		System.out.println(s1.concat(s3));
		System.out.println(s1);
		System.out.println(s5.concat(s6));
		System.out.println(s5);
	}

}
