package com.complex;

public class Rectangle2 implements Drawable1 {

	public static void main(String[] args) {
		Rectangle2 d=new Rectangle2();
		d.draw2();
		d.msg2(3);
		Drawable1.msg2(3);
		
	
		// TODO Auto-generated method stub

	}
	static void msg2(int a ){
		System.out.println("hello");
		
		
	}


	@Override
	public void draw2() {
		System.out.println("drawing rectangle");
		// TODO Auto-generated method stub
		
	}

}
