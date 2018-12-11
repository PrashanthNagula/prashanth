package com.javatest;

import java.util.Arrays;
import java.util.Comparator;

public class Sorting1 {
	int id;
	String name;
	int age;
	Sorting1(int id,String name,int age){
		this.id=id;
		this.name=name;
		this.age=age;
	}
	public static void main(String[] args) {
		Sorting1[] s=new Sorting1[3];
		s[0]=new Sorting1(100,"prashanth",22);
		s[1]=new Sorting1(101,"sai",23);
		s[2]=new Sorting1(102,"rajesh",24);
		
		Comparator<Sorting1> idcom=new Comparator<Sorting1>(){

			@Override
			public int compare(Sorting1 o1, Sorting1 o2) {
				// TODO Auto-generated method stub
				return o1.id-o2.id;
			}

			
			

			
	};
	Arrays.sort(s,idcom);
	System.out.println(Arrays.toString(s));
	

}
	@Override
	public String toString() {
		return "Sorting1 [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
}
