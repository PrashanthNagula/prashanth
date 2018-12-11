package com.exceptions;

public class TryCatch {
	public static void main(String[] args) {
	try{
		int a=10;
		int b=0;
		int c=a+b;
		System.out.println(c);
		try{int v=a%b;
		System.out.println(v);}catch(Exception e){};
		int d=a-b;
		System.out.println(d);
		int m=a*b;
		System.out.println(m);
		
	}catch(Exception e){
			
		}
		}
	}


