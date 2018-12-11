package com.inner;

public class TestInterface implements Showable.Message {

	@Override
	public void msg() {
		System.out.println("hello nested interface");
		// TODO Auto-generated method stub
		
	}
	public void show(){
		System.out.println("hello interface");
	}
	public void add(){
		System.out.println("add method");
	}
	public static void main(String[] args) {
		Showable.Message m=new TestInterface();
		m.msg();
		
	
		
//		TestInterface t=new TestInterface();
//		t.show();
//		t.msg();
	}

}
