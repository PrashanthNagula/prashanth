package com.cubic;

public class Cons2 {
public Cons2(){
	System.out.println("default constructor");
}
public Cons2(int a){
	this();
	System.out.println("one parameterized constructor");
}
public Cons2(int a,int b){
	this(4);
	System.out.println("two parameterized constructor");
}
public Cons2(int a,int b,int c){
	this(7,8);
	System.out.println("three parameterized constructor");
}
public static void main(String[] args) {
	Cons2 c=new Cons2(4,5,6);
}
}
