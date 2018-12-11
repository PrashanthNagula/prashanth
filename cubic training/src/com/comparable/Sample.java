package com.comparable;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Sample implements Comparable<Sample> {
	int id;
	String name;
	int age;
	Sample(int id,String name,int age){
		this.id=id;
		this.name=name;
		this.age=age;
	}
	public static void main(String[] args) {
		Sample s=new Sample(101,"prashanth",22);
		Sample s1=new Sample(102,"aditya",23);
		Sample s2=new Sample(100,"prashanth",22);
		LinkedHashSet<Sample> lh=new LinkedHashSet();
		lh.add(s);
		lh.add(s1);
		lh.add(s2);
		//Collections.sort(lh);
		Iterator<Sample> itr=lh.iterator();
		while(itr.hasNext()){
			Sample ss=itr.next();
			System.out.println(ss.id+" "+ss.name+" "+ss.age);
		}
		
	}
	@Override
	public int compareTo(Sample o) {
		// TODO Auto-generated method stub
		return this.name.compareTo(o.name);
	}
	

}
