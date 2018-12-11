package com.collections;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet1 {
	public static void main(String[] args) {
		TreeSet<String> ts=new TreeSet<String>();
		ts.add("prashanth");
		ts.add("kiran");
		ts.add("aditya");
		ts.add("sandeep");
		Iterator itr=ts.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}

}
