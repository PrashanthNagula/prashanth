package com.strings;

public class Join {
	public static void main(String[] args) {
		String str=String.join("-","welcome","to","cubic");
		System.out.println(str);
		String date=String.join("/", "29","03","1996");
		System.out.println("the date is"+date);
		String time=String.join(":", "12","00","00");
		System.out.println("the time is"+time);
		
	}

}
