package com.exceptions;

public class Finally1 {
	public static void main(String[] args) {
	
	int a=30;
	int b=0;
	try{
		int c=a/b;
	}catch(Exception e){System.out.println(e);}
	finally{
		System.out.println("finally");
	}
	System.out.println("rest of the code");
	
	

}
}
