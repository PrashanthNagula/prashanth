package com.exceptions;

import java.io.IOException;

public class Throws {
	void m() throws IOException{
		System.out.println("hello");
		throw new java.io.IOException("device error");
	}
	void n() throws IOException{
		m();
	}
	void p(){
		try {
			n();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}
	public static void main(String[] args) {
		Throws obj=new Throws();
		obj.p();
		System.out.println("normal flow");
	}

}
