package com.practise1;

public class Vehicle1 extends Vehicle {
	public static void bike(){
		System.out.println("bike is running at 100kmph");
	}
	public void scooter(){
		System.out.println("scooter is running at 80kmph");
	}

	public static void main(String[] args) {
		Vehicle v=new Vehicle1();
		v.bike();
		v.scooter();
		
		
		// TODO Auto-generated method stub

	}

}
