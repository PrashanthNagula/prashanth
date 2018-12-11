package com.exceptions;

public class ExceptionPropagation1 {
	void m(){
		int a=50/0;
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
		ExceptionPropagation1 obj=new ExceptionPropagation1();
		obj.p();
		System.out.println("normal flow");
	}

}
