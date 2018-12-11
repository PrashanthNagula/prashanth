package com.collections;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet2 {
	public static void main(String[] args) {
		TreeSet<String> ts=new TreeSet<String>();
		ts.add("a");
		ts.add("b");
		ts.add("c");
		ts.add("d");
		ts.add("e");
//		Iterator itr=ts.iterator();
//		while(itr.hasNext()){
			System.out.println(ts);
			System.out.println("headset"+ts.headSet("c"));
			System.out.println("tailset"+ts.tailSet("c",false));
			System.out.println("subset"+ts.subSet("a",false, "d",true));
			
			
		}
	}


