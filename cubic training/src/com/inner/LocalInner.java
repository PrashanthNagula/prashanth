package com.inner;

public class LocalInner {
	private int data=30;
	public void data(){
		class inner{
			public void display(){
				System.out.println("the data is"+data);
			}
		}
		inner i=new inner();
		i.display();
	}
	public static void main(String[] args) {
		
	
	LocalInner l=new LocalInner();
	l.data();
	}

}
