package com.exceptions;

public class Finally {
	public static void main(String[] args) {
		try{
		int data=25/0;
		System.out.println(data);
		}catch(ArithmeticException e){
			System.out.println(e);
		}
		finally{System.out.println("final block is executed");}
		System.out.println("rest of the code");
	}

}
