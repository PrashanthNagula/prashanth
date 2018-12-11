package com.exceptions;

public class Throw {
	static void validate(int age){
		if(age<18){
			throw new ArithmeticException("age is not valid");
		}
		else{System.out.println("eligible for vote");}
	}
public static void main(String[] args) {
	validate(18);
	System.out.println("rest of the code");
}
}
