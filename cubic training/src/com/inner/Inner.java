package com.inner;

public class Inner {
	public void add(){
		System.out.println("add method");
	}
public static void main(String[] args) {
	Outer1 o=new Outer1() {
		
		@Override
		public void add() {
			System.out.println("add method");
			// TODO Auto-generated method stub
			
		}
	};
	Anonym a=new Anonym(){@Override
	public void sub() {
		System.out.println("sub method");
	}
		// TODO Auto-generated method stub
		
	};
	o.add();
	a.sub();
	
}
}
