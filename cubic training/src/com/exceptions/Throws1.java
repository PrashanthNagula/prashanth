package com.exceptions;

import java.io.IOException;

 class Example {
	void m() throws IOException {
		try{int a=30/0;}catch(ArithmeticException e){System.out.println(e);}
		throw new IOException("device error");
		}

}
public class Throws1 extends Example{
	public static void main(String[] args) {
		Throws1 obj=new Throws1();
		try {
			obj.m();
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("exception handeled");
		}
		System.out.println("normal flow");
	}
}
