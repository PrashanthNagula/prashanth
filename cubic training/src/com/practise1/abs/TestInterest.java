package com.practise1.abs;

public class TestInterest {

	public static void main(String[] args) {
		Bank b;
		b=new Sbi();
		System.out.println("rate of interest is"+b.rateOfInterest()+"%");
		b=new Hdfc();
		System.out.println("rate of interest is"+b.rateOfInterest()+"%");
	
		// TODO Auto-generated method stub

	}

}
