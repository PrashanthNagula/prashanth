package com.inner;

public class ConcreteAno {
	public static void main(String[] args) {
		Ano a=new Ano(){
			void test(){
				System.out.println("hello");
			}
		};
		a.test();
	}

}
