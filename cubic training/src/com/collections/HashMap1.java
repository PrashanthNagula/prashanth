package com.collections;

import java.util.HashMap;import java.util.Map;

public class HashMap1 {
	public static void main(String[] args) {
		HashMap<Integer,String> hm=new HashMap();
		hm.put(100,"prashanth");
		hm.put(101, "sandeep");
		hm.put(102,"aditya");
		hm.put(null, null);
		hm.put(null,null);
		for(Map.Entry m:hm.entrySet()){
			System.out.println(m.getKey()+" "+m.getValue());
		}
		hm.putIfAbsent(104, "kiran");
		System.out.println("after invoking putifabsent");
		for(Map.Entry m:hm.entrySet()){
			System.out.println(m.getKey()+" "+m.getValue());
		}
		HashMap<Integer,String> map=new HashMap();
		map.put(103,"rahul");
		map.putAll(hm);
		System.out.println("after invoking putall");
		for(Map.Entry m:map.entrySet()){
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}

}
