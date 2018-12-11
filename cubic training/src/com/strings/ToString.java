package com.strings;

public class ToString {
	int a=10;
	
	int b=20;
	public static void main(String[] args) {
		ToString ts=new ToString();
		System.out.println(ts.toString());
		
	}
	@Override
	public String toString() {
		return a+"*"+b;
	}
	

}
