package com.inner;

public class Outer {
	private int a=19;
	public void add(){
		System.out.println("add method");
	}
	class Inner{
		public void sub(){
			System.out.println("sub method"+a);
		}
	}
public static void main(String[] args) {
	Outer o=new Outer();
	Outer.Inner i=o.new Inner();
	o.add();
	i.sub();
}
}
