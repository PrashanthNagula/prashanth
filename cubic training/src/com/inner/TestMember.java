package com.inner;

public class TestMember {
	private int data=30;
	class Inner{
		public void data(){
			System.out.println("the data is"+data);
		}
		
	}
public static void main(String[] args) {
	TestMember tm=new TestMember();
	TestMember.Inner i=tm.new Inner();
	i.data();
}
}
