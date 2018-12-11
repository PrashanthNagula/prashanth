package com.practise1;

public class B2 extends B1 {
	B2(int a){
		super();
		System.out.println("child class constructor is invoked"+a);
		
	}
	{
		System.out.println("instance initializer block is invoked");
	}
	

	public static void main(String[] args) {
		B2 b2=new B2(10);
	//B1 b1=new B1();
	
		
		
		// TODO Auto-generated method stub

	}

}
