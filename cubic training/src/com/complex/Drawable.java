package com.complex;

public interface Drawable {
	void draw1();
	default void msg1(){
		System.out.println("default method");
		
	}

}


