package com.collections;

import java.util.HashSet;
import java.util.Iterator;



public class HashSet1 {
	public static void main(String[] args) {
		HashSet<String> hs=new HashSet<String>();
		hs.add("prashanth");
		hs.add("aditya");
		hs.add("prashanth");
		hs.add("kiran");
		Iterator<String> itr=hs.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
			
		}
	}

}
