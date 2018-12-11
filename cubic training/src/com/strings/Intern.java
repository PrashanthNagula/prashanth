package com.strings;

public class Intern {
	public static void main(String[] args) {
		String s1="hello";
		String s4=s1.intern();
		String s2=new String("hello");
		String s3=s2.intern();
		System.out.println(s1==s3);
		System.out.println(s2==s3);
		System.out.println(s1==s2);
		System.out.println("equals"+s1.equals(s2));
		System.out.println(s1==s4);//true
		System.out.println(s2==s4);//false
		System.out.println(s3==s4);//true
		
	}

}
