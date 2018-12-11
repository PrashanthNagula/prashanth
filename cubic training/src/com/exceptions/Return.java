package com.exceptions;

public class Return {
	static void badMethod() throws RunTimeException{
		System.out.println("badmethod");
		throw new RunTimeException("msg");
	}
	public static void main(String[] args) {
		try{
			badMethod();}catch(RunTimeException re){System.out.println(re);}
			
		
		finally{System.out.println("c");}
		System.out.println("finish");
		System.out.println("hello");
		
		
	}

}
