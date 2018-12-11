package com.complex;

 class Demo {
	void msg(){
		System.out.println("parent class method");
		
	}

}
 class Demo1 extends Demo{
	public static void main(String args[]){
		Demo1 d1=new Demo1();
		d1.msg();
		
	}
}
