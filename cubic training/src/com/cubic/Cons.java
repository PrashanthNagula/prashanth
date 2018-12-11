package com.cubic;

public class Cons {
	Cons(){
		System.out.println("default constructor");
	}
	Cons(int a){
		System.out.println("parameterized constructor");
	}
public static void main(String[] args) {
	Cons c=new Cons();
	Cons c1=new Cons(1);
}
}
