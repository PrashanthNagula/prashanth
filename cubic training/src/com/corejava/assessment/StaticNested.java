package com.corejava.assessment;

public class StaticNested {
	static int data=30;
	static class Inner{
		void msg(){
			System.out.println("the data is:"+data);
		}
	}
	public static void main(String[] args) {
		StaticNested.Inner i=new StaticNested.Inner();
		i.msg();
		
	}

}
