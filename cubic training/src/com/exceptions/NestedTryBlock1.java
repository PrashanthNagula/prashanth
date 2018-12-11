package com.exceptions;

public class NestedTryBlock1 {
	static void throwit() {
		try{
			throw new ArithmeticException("error message");
		}catch(Exception e){System.out.println("hello1");}
		finally{
			System.out.println("finally");
		}
	}
	public static void main(String[] args) {
		try{
			throwit();
		}
		catch(Exception e){
			System.out.println("hello2");
		}
		System.out.println("rest of the code");
	}

}
