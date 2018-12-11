package com.collections;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHash {
	public static void main(String[] args) {
		LinkedHashSet<String> lh=new LinkedHashSet<String>();
		lh.add("prashanth");
		lh.add("kiran");
		lh.add("kiran");
		lh.add("aditya");
		Iterator itr=lh.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}

}
}
