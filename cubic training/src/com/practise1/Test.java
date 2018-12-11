package com.practise1;

abstract class Example {
	abstract void run();
	void draw(){
		System.out.println("hello");
	}
	

}
abstract class Shape extends Example{
	void run(){
		System.out.println("hello world");
	}
}

class Test extends Shape{
	public static void main(String[] args) {
		
	Test s=new Test();
	s.run();
	}
}