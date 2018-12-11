package com.strings;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
	
	
	public static void isAnagram(String str1,String str2){
		String s1=str1.replaceAll("\\s"," ");
		String s2=str2.replaceAll("\\s"," ");
		boolean status;
		
		if(s1.length()!=s2.length()){
			status=false;
		}else{
			char[] c1=s1.toLowerCase().toCharArray();
			char[] c2=s2.toLowerCase().toCharArray();
			Arrays.sort(c1);
			Arrays.sort(c2);
//			System.out.println(c1);
//			System.out.println(c2);
			status=Arrays.equals(c1,c2);
			
				
			
		}
		if(status==true){
			System.out.println("the given strings are anagram");
		}else{System.out.println("the given strings are not anagram");}
		
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string 1");
		String ss1=sc.next();
		System.out.println("enter string 2");
		String ss2=sc.next();
		
		Anagram.isAnagram(ss1,ss2);
		
	}

}
