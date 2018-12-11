package com.practise1;

public class Hospital1 extends Hospital {
public static void patient(int a){
		
		System.out.println("about 10 patients are available");
	}
	public void nurse(int b){
		System.out.println("only 3 nurse are available");
	}

	public static void main(String[] args) {
		Hospital h=new Hospital();
		h.patient(4);
		h.nurse(7);
		Hospital1 h1=new Hospital1();
		h1.patient(9);
		h1.nurse(2);
		Hospital h2=new Hospital1();
		h2.patient(2);
		h2.nurse(5);
		
		
		// TODO Auto-generated method stub

	}

}
