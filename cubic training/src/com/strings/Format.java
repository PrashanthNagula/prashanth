package com.strings;

public class Format {
public static void main(String[] args) {
	String name="prashanth";
	String s1=String.format("name is%s", name);
	String s2=String.format("the value is %f",32.3434);
	String s3=String.format("the value is %.12f", 32.343434);
	System.out.println(s1);
	System.out.println(s2);
	System.out.println(s3);
}
}
