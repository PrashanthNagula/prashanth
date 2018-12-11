package com.strings;

public class Split {
	public static void main(String[] args) {
		String s="welcome to javatpoint";
		String[] words=s.split("\\s",0);
		for(String w:words){
			System.out.println(w);
		}
		System.out.println("the length is"+words.length);
	for(String w:s.split("\\s",1)){
		System.out.println(w);
	}
	for(String w:s.split("t" )){
		System.out.println(w);
	}
		
	}

}
