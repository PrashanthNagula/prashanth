package com.corejava.assessment;

public class LocalInner {
	void display(){
		class Inner{
			void msg(){
				System.out.println("local inner class msg");
			}
			
		}
		Inner i=new Inner();
		i.msg();
	}
	public static void main(String[] args) {
		LocalInner l=new LocalInner();
		l.display();
	}

}
