package com.inner;

public class Outer2 {
	public void add(){
		class Inner{
			public void sub(){
				System.out.println("sub method");
			}
			}
		Inner i=new Inner();
		i.sub();
	}
	public static void main(String[] args) {
		Outer2 o=new Outer2();
		o.add();
		
	}

}
