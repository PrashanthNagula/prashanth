package com.complex;

public class Student3 {
int id;
String name;
public void details(int id,String name){
this.id=id;
this.name=name;
}
public void details1(Student3 s){
	this.id=s.id;
	this.name=s.name;
}
public void display(){
	System.out.println(id+" " +name);
}
public static void main(String[] args) {
	Student3 s1=new Student3();
	Student3 s2=new Student3();
	s1.details(100,"prashanth");
	s1.details1(s1);
	s1.display();
	s1.display();
	
}
}
