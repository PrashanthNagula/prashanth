package com.javatest;

import java.util.Arrays;

public class Sorting implements Comparable<Sorting>{
	int id;
	int age;
	String name;
	Sorting(int id,String name,int age){
		this.id=id;
		this.name=name;
		this.age=age;
	}
	public static void main(String[] args) {
		Sorting[] s=new Sorting[3];
		s[0]=new Sorting(100,"prashanth",22);
		s[1]=new Sorting(101,"aditya",23);
		s[2]=new Sorting(102,"sandeep",24);
		Arrays.sort(s);
		System.out.println(Arrays.toString(s));
		
	}
	@Override
	public String toString() {
		return "Sorting [id=" + id + ", age=" + age + ", name=" + name + "]";
	}
	@Override
	public int compareTo(Sorting o) {
		// TODO Auto-generated method stub
		return this.name.compareTo(o.name);
	}

}
