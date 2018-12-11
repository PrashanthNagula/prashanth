package com.comparable;

import java.util.ArrayList;
import java.util.Iterator;

public class Lists {
	int id;
	String name;
	String dept;
	Lists(int id,String name,String dept){
		this.id=id;
		this.name=name;
		this.dept=dept;
	}
	public static void main(String[] args) {
		Lists l=new Lists(100,"prashanth","java");
		Lists l1=new Lists(101,"sai",".net");
		ArrayList<Lists> al=new ArrayList();
		al.add(l);
		al.add(l1);
		Iterator<Lists> itr=al.iterator();
		while(itr.hasNext()){
			Lists ls=(Lists)itr.next();
			System.out.println(ls.id+" "+ls.name+" "+ls.dept);
		}
	}

}
