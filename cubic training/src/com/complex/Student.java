package com.complex;

public class Student {
	int id;
	String name;
	int age;
	public Student(int i,String n){
		id=i;
		name=n;
	}
	public Student(int i,String n,int age){
		id=i;
		name=n;
		this.age=age;
	}
	public void display(){
		System.out.println(id+" "+name+" "+age);
	}
public static void main(String[] args) {
	Student s1=new Student(100,"prashanth");
	Student s2=new Student(101,"manoj");
	Student s3=new Student(102,"prashanth",22);
	
	s1.display();
	s2.display();
	s3.display();
}
}
