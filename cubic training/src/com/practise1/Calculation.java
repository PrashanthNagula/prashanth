package com.practise1;

import java.util.Scanner;

public class Calculation {
public void fact(int n){
	int fact=1;
	for(int i=n;i>=1;i--){
		fact=fact*i;
	}
	System.out.println("factorial is" +fact);
}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number to find factorial");
		int f=sc.nextInt();
		new Calculation().fact(f);
		
		// TODO Auto-generated method stub

	}

}
