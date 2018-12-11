package com.collections2;

import java.util.ArrayList;
import java.util.Iterator;

public class lists {
	
	int id;
	String name;
	String dept;
	
	
	public lists(int id, String name, String dept) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
	}


	public static void main(String[] args) {
		lists l=new lists(111, "sai", "java");
		lists l1=new lists(123, "rajesh", "dotnet");
		ArrayList<lists> al=new ArrayList<>();
		al.add(l);
		al.add(l1);
		Iterator<lists> itr=al.iterator();
		while(itr.hasNext()) {
			lists ll=(lists)itr.next();
			System.out.println(ll.id);
			System.out.println(ll.name);
			System.out.println(ll.dept);
		}
		
		
	}

}
