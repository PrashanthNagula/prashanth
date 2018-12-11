package com.practise1;


public class Dynamic1 extends Dynamic {
	public static void add(int a){
		System.out.println("child static");
	}
    public void sub(int a){
    	System.out.println("child instance");
    	
    }
	public static void main(String[] args) {
		Dynamic1 d1=new Dynamic1();
		d1.add(8);
		d1.sub(9);
		Dynamic d=new Dynamic();
		d.add(7);
		d.sub(6);
		Dynamic d2=new Dynamic1();
		d2.add(8);
		d2.sub(7);
		
		
		
	}

	
	
}

