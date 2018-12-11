package com.exceptions;

 class Parent1 {
	 void msg()throws Exception{
		 System.out.println("parent1");
	 }

}
 class ExceptionChild2 extends Parent1{
	 void msg(){
		 System.out.println("child");
	 }
	 public static void main(String[] args) throws Exception {
		Parent1 p=new ExceptionChild2();
		p.msg();
	}
 }
