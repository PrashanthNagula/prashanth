package com.cubic;

public class Cons1 {
	public Cons1(){
		this(5);
		System.out.println("default constructor");
		
	}
	public Cons1(int a){
		this(5,6);
		System.out.println("one parameterized constructor");
	}
public Cons1(int a,int b){
	this(7,8,9);
	System.out.println("two parameterized constructor");
}
public Cons1(int a,int b,int c){
	System.out.println("three parameterized constructor");
}
	public static void main(String[] args) {
		Cons1 c=new Cons1();
		// TODO Auto-generated method stub

	}

}
