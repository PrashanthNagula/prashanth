package com.exceptions;

public class MultipleCatchBlock {
	public static void main(String[] args) {
		
	try{int[] a=new int[5];
	
	//int b=30/0;
	a[10]=30;
	}
	//catch(Exception  e){}
	catch(ArrayIndexOutOfBoundsException ae){}
	catch(Exception e){};
	System.out.println("rest of the code");

}
}
