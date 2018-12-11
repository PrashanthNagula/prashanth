package com.atm;

import java.util.Scanner;

public class Atm {
	 
	 
	 
	private int pin;
	private int pinno;
	
	
	
	
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	public int getPinno() {
		return pinno;
	}
	public void setPinno(int pinno) {
		this.pinno = pinno;
	}

	public static void main(String[] args) {
		long availablebalance=0;
		long withdrawal;
		long deposit;

		Atm a=new Atm();
		a.setPin(1234);
		
		Scanner sc=new Scanner(System.in);
		while(availablebalance>=0){
		System.out.println("enter your pin");
		int p=sc.nextInt();
		a.setPinno(p);
		
		
		if(a.getPin()==a.getPinno()){
		
		
		System.out.println("choose the required field");
		
		System.out.println("1.available balance");
		System.out.println("2.cashwithdrawal");
		System.out.println("3.deposit");
		System.out.println("4.change pin");
		int ch=sc.nextInt();
		switch(ch){
		case 1:
			
			System.out.println("availablebalance is"+availablebalance);
			break;
		case 2:
			
			System.out.println("enter the money you want to withdraw");
			long w=sc.nextLong();
			withdrawal=w;
			if(withdrawal>availablebalance){
				System.out.println("insufficient funds");
			}else{
				availablebalance=availablebalance-withdrawal;
				System.out.println("available balance is"+availablebalance);
			}
			break;
		case 3:
			System.out.println("enter money you want to deposit");
			 deposit=sc.nextLong();
			 System.out.println("amount deposited"+deposit);
			 availablebalance=availablebalance+deposit;
			 break;
		case 4:
			System.out.println("enter your new pin");
			int pin=sc.nextInt();
			a.setPin(pin);
			//int q=pin;
			//a.setPinno(q);
			
			System.out.println("pin changed successfully");
			System.out.println("enter your updated pin");
			int q=sc.nextInt();
			if(a.getPin()!=a.getPinno()){
				a.setPinno(q);
			}
			
			
			break;
			default:
				System.out.println("sorry chose valid field");
				break;
			
			 
			
			
			
			
		}
		
		
		
		
		
	}
		System.out.println("incorrect pin ");
		}
		
		
	
	

}
}

