package com.collections;

import java.util.Map;
import java.util.TreeMap;

public class TreeMap1 {
	public static void main(String[] args) {
		TreeMap<Integer,String> tm=new TreeMap();
		tm.put(100, "prashanth");
		tm.put(101, "sandeep");
		tm.put(103, "aditya");
		try{tm.put(null, null);}catch(Exception e){System.out.println("done");}
		for(Map.Entry m:tm.entrySet()){
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}

}
