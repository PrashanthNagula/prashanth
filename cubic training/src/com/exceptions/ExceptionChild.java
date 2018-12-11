package com.exceptions;

import java.io.IOException;

class Parent {
	 void msg(){
		 System.out.println("partent");
	 }

}
class ExceptionChild extends Parent{
	void msg(){
		try{int a=30/0;}catch(ArithmeticException e){System.out.println("exception handeled");}
		System.out.println("child method");
	}
	public static void main(String[] args) {
		Parent p=new ExceptionChild();
		p.msg();
		
	}
}