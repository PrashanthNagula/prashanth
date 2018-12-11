package com.exceptions;

public class NestedTryBlock {
	public static void main(String[] args) {
	try{
		try{
		int a=30/0;
	}catch(ArithmeticException e){}
	try{
		int[] a=new int[5];
		a[5]=30;
	}catch(ArrayIndexOutOfBoundsException e){}
	System.out.println("normal flow is executed");
	
	}catch(Exception e){System.out.println("handeled");}
	}
	

}
