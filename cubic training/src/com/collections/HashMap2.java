package com.collections;

import java.util.HashMap;
import java.util.Map;

public class HashMap2 {
	public static void main(String[] args) {
		HashMap<Integer,String>hm=new HashMap();
		hm.put(100,"prashanth");
		hm.put(101, "ravi");
		hm.put(102, "rahul");
		hm.put(103, "ajay");
		for(Map.Entry m:hm.entrySet()){
			System.out.println(m.getKey()+" "+m.getValue());
		}
		hm.remove(103,"ajay");
		System.out.println("after remove");
		for(Map.Entry m:hm.entrySet()){
			System.out.println(m.getKey()+" "+m.getValue());
		}
		hm.replace(100, "ajay");
		hm.replace(101, "ravi","kiran");
		System.out.println("after replace");
		for(Map.Entry m:hm.entrySet()){
			System.out.println(m.getKey()+" "+m.getValue());
		}
		hm.replaceAll((k,v)->"prashanth");
		System.out.println("after replace all");
		for(Map.Entry m:hm.entrySet()){
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
		
	}

}
