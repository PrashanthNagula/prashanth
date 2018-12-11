package com.complex;

public class B extends M {

	public static void main(String[] args) {
		A b=new B();
		b.a();
		b.b();
		b.c();
		b.d();
		// TODO Auto-generated method stub

	}

	@Override
	public void a() {
		System.out.println("iam a");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void b() {
		System.out.println("iam b");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void d() {
		System.out.println("iam d");
		// TODO Auto-generated method stub
		
	}

}
