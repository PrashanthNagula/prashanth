package com.exceptions;
class CustomException{
	static void validate(int age) throws AgeException{
		if(age<18){
			throw new AgeException("invalid age");
		}
		else
		{System.out.println("vote is valid");}
	}
	public static void main(String[] args) {
		try{
			validate(13);
		}catch(Exception m){
			System.out.println("exception occured:"+m);
		}
	}
}