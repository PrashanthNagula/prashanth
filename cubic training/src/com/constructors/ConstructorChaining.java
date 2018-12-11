package com.constructors;

public class ConstructorChaining {
	ConstructorChaining(){
		System.out.println("zero parameterised constructor");
	}
	ConstructorChaining(int a){
		this();
		System.out.println("single parameter");
	}
	ConstructorChaining(int a,int b){
		this(10);
		System.out.println("two parameter");
	}
	void show(){
		show(10,20);
		System.out.println("display method");
	}
	void show(int a,int b){
		System.out.println("show method");
	}
	public static void main(String[] args) {
		ConstructorChaining c=new ConstructorChaining();
		c.show();
	}

}
