package com.strings;

public class CharAtExample {
	public static void main(String[] args) {
		String str="welcome to javatpoint";
		int count=0;
		for(int i=0;i<=str.length()-1;i++){
			if(str.charAt(i)=='t'){
	
				count++;
				
			}
			
		}
		System.out.println("frequency of t is"+count);
		
	}

}
