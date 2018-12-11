package com.complex;

import java.util.Scanner;

public class Table {
	public static void main(String[] args) {
		int i,j,k;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter required table");
		int n=sc.nextInt();
		
		for(i=1;i<=n;i++){
			for(j=1;j<=10;j++){
				k=i*j;
				System.out.println(i+"*"+j+"="+k);
			}
		}
		
		
		
	}

}
