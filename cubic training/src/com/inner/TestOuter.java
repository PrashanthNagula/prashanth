 package com.inner;

public class TestOuter {
	static private int data=30;
	static class Inner{
		public void data(){
			System.out.println("the data is"+data);
		}
	}
public static void main(String[] args) {
	
	TestOuter.Inner i=new Inner();
	i.data();
}
}
