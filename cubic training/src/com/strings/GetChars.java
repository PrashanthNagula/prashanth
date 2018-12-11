package com.strings;

public class GetChars {
	public static void main(String[] args) {
		String s=new String("welcome-to-cubic");
		char[] ch=new char[10];
		s.getChars(3,5,ch,0);
		System.out.println(ch);
	}

}
