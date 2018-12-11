package com.cubic;

import java.util.Scanner;

public class Sample {
	public static void main(String args[]){
		Student s=new Student();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter rollno");
		int rollno=sc.nextInt();
		System.out.println("enter name");
		String name=sc.next();
		System.out.println("enter course");
		String course=sc.next();
		s.setRollno(rollno);
		s.setName(name);
		s.setCourse(course);
		System.out.println(s.getRollno());
		System.out.println(s.getName());
		System.out.println(s.getCourse());
		
	}
	public static void test(Student s){
		System.out.println(s.getRollno());
		System.out.println(s.getName());
		System.out.println(s.getCourse());
		Encap.main(new String[]{});
	}

}
