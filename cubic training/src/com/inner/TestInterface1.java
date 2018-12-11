package com.inner;

public class TestInterface1 implements A.Message {

	@Override
	public void msg() {
		System.out.println("hello nested interface");
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
		A.Message m=new TestInterface1();
		m.msg();
		
	}

}
