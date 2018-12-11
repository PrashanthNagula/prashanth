package com.strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Duplicate {
       static void duplicateWords(String s) {
	
		String[] str=s.split(" ");
		for(String s1:str){System.out.println(s1);}
		HashMap<String,Integer> wc=new HashMap();
		for(String word:str){
			String ss=word.toLowerCase();
			if(wc.containsKey(ss)){
				wc.put(ss,wc.get(ss)+1);}
			else{
				wc.put(ss, 1);
			}}
		Set<String> ws=wc.keySet();
		for(String word:ws){
			if(wc.get(word)>1){
				System.out.println(word+" "+wc.get(word));
			}else{
				System.out.println(word+" "+wc.get(word));
			}
			
		}
			
		}
       public static void main(String[] args) {
		duplicateWords("bread is a bread");
		duplicateWords("bread and jam");
		duplicateWords("key and key");
	}
	}


