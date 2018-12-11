package com.strings;

public class InstanceTest {
	public static void main(String[] args) {
		String str="java";
		System.out.println(str.hashCode());
		str=str.concat("tpoint");
		System.out.println(str);
//		str=str+"tpoint";
//		System.out.println(str);
		System.out.println(str.hashCode());
	}

}
