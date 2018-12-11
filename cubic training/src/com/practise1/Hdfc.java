package com.practise1;

public class Hdfc extends Bank {
	float getRateInterest(){
		return 11.7f;
	}
	public static void main(String args[]){
		Bank b;
		b=new Sbi();
		System.out.println("sbi rate of interest"+b.getRateInterest());
		 b=new Icici();
		System.out.println("icici rate of interest"+b.getRateInterest());
		b=new Hdfc();
		System.out.println("hdfc rate of interest is"+b.getRateInterest());
		
	}
	

}
