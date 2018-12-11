package com.comparable;

import java.util.Arrays;
import java.util.Comparator;

public class Sorting {
	int id;
	String name;
	String dept;
	Sorting(int id,String name,String dept){
		this.id=id;
		this.name=name;
		this.dept=dept;
	}
	public static void main(String[] args) {
		Sorting[] s=new Sorting[3];
		s[0]=new Sorting(100,"prashanth","java");
		s[1]=new Sorting(101,"aditya","java");
		s[2]=new Sorting(102,"sandeep","testing");
		Comparator<Sorting> cs=new Comparator<Sorting>(){

			@Override
			public int compare(Sorting o1, Sorting o2) {
				// TODO Auto-generated method stub
				return o1.id-o2.id;
			}
		};
		Comparator<Sorting> csname=new Comparator<Sorting>(){

			@Override
			public int compare(Sorting o1, Sorting o2) {
				// TODO Auto-generated method stub
				return o1.name.compareTo(o2.name);
			}
		};
		Comparator<Sorting> csdept=new Comparator<Sorting>(){

			@Override
			public int compare(Sorting o1, Sorting o2) {
				// TODO Auto-generated method stub
				return o1.dept.compareTo(o2.dept);
			}
		};

			
		
		Arrays.sort(s,cs);
		System.out.println(Arrays.toString(s));
		Arrays.sort(s,csname);
		System.out.println(Arrays.toString(s));
		Arrays.sort(s,csdept);
		System.out.println(Arrays.toString(s));
		
		
		
		
		
	}
	
	@Override
	public String toString() {
		return "Sorting [id=" + id + ", name=" + name + ", dept=" + dept + "]";
	}
//	@Override
////	public int compareTo(Sorting o) {
////		
////		// TODO Auto-generated method stub
////		return this.dept.compareTo(o.dept);
////		
////	}
	

}
