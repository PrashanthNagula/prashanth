package com.corejava.assessment;

public class StaticNested2 {
	static int data=30;
	static class Inner{
		static void msg(){
			System.out.println("the data is:"+data);
		}
	}
	public static void main(String[] args) {
		StaticNested2.Inner.msg();
	}

}
