package com.exceptions;

import java.io.IOException;

 class Example1 {
	void m() throws IOException{
		throw new IOException("device error");
	}

}
 class Throws2 extends Example1{
	 public static void main(String[] args) throws IOException {
		Throws2 obj=new Throws2();
		try{obj.m();}catch(IOException e){System.out.println("exception handeled");}
		System.out.println("normal flow");
	}
 }
