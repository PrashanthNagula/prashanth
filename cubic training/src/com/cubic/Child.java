package com.cubic;

public class Child extends Parent{
	public void sub(){
		
		
		System.out.println("sub method");
		super.add();
		System.out.println(super.a);
		
		
	}
	public static void main(String[] args) {
		Child c=new Child();
		c.sub();
	}

}
