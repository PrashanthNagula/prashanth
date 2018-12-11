package com.strings;

import java.util.Scanner;

public class Length {
	public static void main(String[] args) {
		String s;
		String temp;
		int count=0;
		String reverse="";
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any string");
		s=sc.next();
		temp=s;
		s=s+'\0';
		int i=0;
		while(s.charAt(i)!='\0'){
			count++;
			i++;
			
		}
		System.out.println("length of a string is"+count);
		for(int j=(count-1);j>=0;j--){
			reverse=reverse+s.charAt(j);
			
			
		}
		System.out.println("the reverse of a String is:"+reverse);
		if(temp.equals(reverse)){
			System.out.println("given string is a palindrome");
		}
		else{System.out.println("given string is not a palindrome");}
			
		
		
	}

}
