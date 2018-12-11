package com.comparable;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Student1 implements Comparable<Student1> {
	int id;
	String name;
    int age;
    Student1(int id,String name,int age){
    	this.id=id;
    	this.name=name;
    	this.age=age;
    	
    }
    public static void main(String[] args) {
		Student1 s=new Student1(100,"prashanth",21);
		Student1 s1=new Student1(101,"aditya",22);
		Student1 s2=new Student1(102,"krishna",23);
		TreeMap<Integer,Student1> tm=new TreeMap();
		tm.put(10, s);
		tm.put(11,s1);
		tm.put(12,s2);
		for(Map.Entry<Integer,Student1> m:tm.entrySet()){
			int i=(int) m.getKey();
			System.out.println(i);
			Student1 ss=(Student1) m.getValue();
			System.out.println(ss.id+" "+ss.name+" "+ss.age);
		}
	}
	@Override
	public int compareTo(Student1 o) {
		// TODO Auto-generated method stub
		return 0 ;
	}

}
