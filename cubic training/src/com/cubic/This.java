package com.cubic;

public class This {
	int a=10;
	public void add(){
		int a=20;
		
		System.out.println("add method");
		System.out.println(this.a);
		
	}
	public static void main(String[] args) {
		This t=new This();
		t.add();
	}
	

}
