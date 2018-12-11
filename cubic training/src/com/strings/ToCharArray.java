package com.strings;

public class ToCharArray {
	public static void main(String[] args) {
		String s="hello";
		char[] ch=s.toCharArray();
		for(int i=0;i<ch.length;i++){
			System.out.println(ch[i]);
		}
		System.out.println("char array length is"+ch.length);
	}

}
