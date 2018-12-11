package com.complex;

public class Simple1 extends Simple {
	void add(){
		System.out.println("subclass instance method");
	}
	static void sub(){
		System.out.println("subclass static method");
	}

	public static void main(String[] args) {
		Simple s=new Simple1();
		s.add();
		s.sub();
		// TODO Auto-generated method stub

	}

}
