package com.strings;

public class IndexOf {
	public static void main(String[] args) {
		String s="this is index example";
		int index1=s.indexOf("is");
		int index2=s.indexOf("index");
		System.out.println(index1+" "+index2);
		int index3=s.indexOf("is",3);
		System.out.println(index3);
	}

}
