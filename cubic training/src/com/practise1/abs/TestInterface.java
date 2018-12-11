package com.practise1.abs;

public class TestInterface implements Printable1,Showable1 {

	public static void main(String[] args) {
		TestInterface t=new TestInterface();
		t.add();
		// TODO Auto-generated method stub

	}

	@Override
	public void add() {
		System.out.println("hello");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sub() {
		System.out.println("welcome");
		// TODO Auto-generated method stub
		
	}

}
