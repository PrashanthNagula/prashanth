package com.complex;

public class Add {
	int a;
	String name;
	
	public void display(){
		System.out.println(a+" "+name);
	}
	public static void main(String[] args) {
		
		Add a=new Add();
		System.out.println(a.a);
		a.display();
	}

}
