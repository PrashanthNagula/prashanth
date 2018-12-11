package com.practise1.abs;

public class Sample1 extends Sample {
	

	public static void main(String[] args) {
		Sample1 s1=new Sample1();
		s1.add();
		s1.sub();
		
		// TODO Auto-generated method stub

	}

	@Override
	void add() {
		System.out.println("abstract method is invoked");
		// TODO Auto-generated method stub
		
	}
	public void sub(){
		System.out.println("normal method of sub class is invoked");
	}


}
