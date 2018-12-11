package com.practise1.abs;

public interface Drawable {
	void draw();
	default void msg(){
		System.out.println("default method");
		
	}

}
class Rectangle1 implements  Drawable{

	@Override
	public void draw() {
		System.out.println("drawing rectangle");
		// TODO Auto-generated method stub
		
	}
	
}
class TestInterface3{
	public static void main(String args[]){
	Rectangle1 r1=new Rectangle1();
	r1.msg();
	r1.draw();
	
	
}
}
