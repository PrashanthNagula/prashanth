package com.practise1.abs;

public class TestInterface2 implements Showable2 {

	public static void main(String[] args) {
		TestInterface2 t2=new TestInterface2();
		t2.add();
		t2.sub();
		
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
