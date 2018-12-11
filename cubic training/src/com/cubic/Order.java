package com.cubic;

public class Order {
	public void add(){
		
		System.out.println("instance method");
	}
public static void sub(){
	System.out.println("static method");
}
public Order(){
	System.out.println("constructor");
}
public static void main(String[] args) {
	sub();
	Order o=new Order();
	o.add();
}
}
