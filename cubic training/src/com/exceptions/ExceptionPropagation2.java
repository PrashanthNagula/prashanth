package com.exceptions;

public class ExceptionPropagation2 {
	void m(){
		throw new ArithmeticException("not valid");
	}
	void n(){
		m();
	}
	void p(){
		try{
			n();
		}catch(Exception e){System.out.println(e);}
	}
	public static void main(String[] args) {
		ExceptionPropagation2 obj=new ExceptionPropagation2();
		obj.p();
		System.out.println("normal flow");
	}

}
