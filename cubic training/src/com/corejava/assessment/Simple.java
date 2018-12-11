package com.corejava.assessment;

public class Simple implements Nested.Message{

	@Override
	public void msg() {
		System.out.println("hello nested interface");
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
	Nested.Message m=new Simple();
	m.msg();
	}

}
