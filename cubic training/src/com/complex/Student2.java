package com.complex;

public class Student2 {
	int id;
	String name;
	String age;
	public Student2(){
		this.id=id;
		this.name=name;
		
	}

public void display(){
	System.out.println(id+" "+name+" "+age);
	
}
public static void main(String[] args) {
	Student2 s1=new Student2();
	Student2 s2=new Student2();
	
	s1.id=100;s2.id=s1.id;
	
	s1.name="suresh";
	s1.age="21";
	s2.name=s1.name;
	s2.age="22";
	s1.display();
	s2.display();
	
}
}
