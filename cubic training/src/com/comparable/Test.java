package com.comparable;

import java.util.ArrayList;
import java.util.Collections;

public class Test {
	public static void main(String[] args) {
		Employee e=new Employee(100,"prashanth",28);
		Employee e1=new Employee(101,"aditya",23);
		Employee e2=new Employee(102,"sandeep",21);
		ArrayList<Employee> al=new ArrayList();
		al.add(e);
		al.add(e1);
		al.add(e2);
		Collections.sort(al);
		System.out.println(al.toString());
	}

}
