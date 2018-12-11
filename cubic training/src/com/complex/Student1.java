package com.complex;

public class Student1 {
	int id;
	String name;
	int age;
	public Student1(int id,String name,int age){
		this.id=id;
		this.name=name;
		this.age=age;
	}
	public Student1(Student1 s){
		this.id=s.id;
		this.name=s.name;
		this.age=s.age;
	}
	public void display(){
		System.out.println(id+" "+name+" "+age);
				
	}
	public static void main(String[] args) {
		Student1 s1=new Student1(100,"prashanth",22);
		Student1 s2=new Student1(s1);
		s1.display();
		s2.display();
	}

}
