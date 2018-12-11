package com.inner;

public class TestOuter1 {
	static int data=30;
	static class inner{
		static void data(){
			System.out.println("the datais"+data);
		}
	}
	public static void main(String[] args) {
		
	
TestOuter1.inner i=new TestOuter1.inner();
i.data();
	}
}
