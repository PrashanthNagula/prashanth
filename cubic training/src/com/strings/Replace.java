package com.strings;

public class Replace {
	public static void main(String[] args) {
		String s="javatpoint is a very good website.my name is bob";
		String r=s.replace("a","e");
		System.out.println(r);
		String r1=s.replace("is", "was");
		System.out.println(r1);
		String s2="ooooo-hhhhhh-oooo";
		String rs=s2.replace("h", "s");
		System.out.println(rs);
	}

}
