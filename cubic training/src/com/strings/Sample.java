package com.strings;

public class Sample {
	
	public static void main(String[] args) {
		
		String str="prashanth";
		System.out.println(str.concat("123"));
		System.out.println(str);
		String str1=new String("prashanth");
		System.out.println(str.hashCode());
		System.out.println(str1.hashCode());
		StringBuffer sbr=new StringBuffer("prashanth");
		StringBuffer sbr1=new StringBuffer("prashanth");
		System.out.println(sbr.hashCode());
		System.out.println(sbr1.hashCode());
		
	}

}
