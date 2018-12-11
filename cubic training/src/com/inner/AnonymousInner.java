package com.inner;

public class AnonymousInner {
	
public static void main(String[] args) {
	Person p=new Person(){@Override
	void eat() {
		System.out.println("nice fruits");
	}
		// TODO Auto-generated method stub
		
	};
	Person1 p1=new Person1() {
		
		@Override
		public void eat() {
			System.out.println("nice fruits");
			// TODO Auto-generated method stub
			
		}
	};
	p1.eat();
		
	
	p.eat();
}
}
