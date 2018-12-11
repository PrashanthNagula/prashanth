package com.corejava.assessment;

public class C implements A.B {

	@Override
	public void msg() {
		System.out.println("hello nested interface");
		// TODO Auto-generated method stub
		
	}
public static void main(String[] args) {
	A.B b=new C();
	b.msg();
	
	
}

}
