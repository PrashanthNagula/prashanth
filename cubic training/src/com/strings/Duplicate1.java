package com.strings;

import java.util.HashMap;
import java.util.Set;

public class Duplicate1 {
	static void duplicateCharacters(String s){
		char[] ch=s.toCharArray();
		HashMap<Character,Integer> hm=new HashMap();
		for(char c:ch){
			if(hm.containsKey(c)){
				hm.put(c,(hm.get(c))+1);
			}else{hm.put(c, 1);}
		}
		Set<Character> ss=hm.keySet();
		for(char cc:ss){
			
				System.out.print(cc+" "+hm.get(cc));
			
		}
	}
	public static void main(String[] args) {
		Duplicate1.duplicateCharacters("prashanth");
	}

}
