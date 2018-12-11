package com.practise1;

import java.util.Scanner;

public class SwitchOperator {

	public static void main(String[] args) {
		char operator;
		int number1,number2,result=0 ;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number1 and number2");
		number1=sc.nextInt();
		number2=sc.nextInt();
		operator=sc.next().charAt(0);
		switch(operator){
		case'+':
			result=number1+number2;
		//System.out.println("the result is"+result);
		break;
		case'-':
			result=number1-number2;
			//System.out.println("the result is"+result);
			break;
		case'/':
			result=number1/number2;
			//System.out.println("the result is"+result);
			break;
		case'*':
			result=number1*number2;
			//System.out.println("the result is"+result);
			break;
			default:
				System.out.println("invalid operator");
				break;
				
		
		
		}
		
		System.out.println("the result is"+result);
		// TODO Auto-generated method stub

	}

}
