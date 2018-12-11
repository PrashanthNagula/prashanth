package com.collections2;

import java.util.Iterator;
import java.util.TreeSet;

public class Student implements Comparable<Student>{
	
 int id;
 String name;
 String grade;
public Student(int id, String name, String grade) {
	super();
	this.id = id;
	this.name = name;
	this.grade = grade;
}
 
 
@Override
public String toString() {
	return "student [id=" + id + ", name=" + name + ", grade=" + grade + "]";
}


public static void main(String[] args) {
	
	Student s=new Student(121, "sai", "a");
	Student s1=new Student(111, "rajesh", "c");
	Student s2=new Student(334, "rohith", "b");
	TreeSet<Student> ts=new TreeSet<>();
	ts.add(s);
	ts.add(s1);
	ts.add(s2);
	Iterator<Student> itr=ts.iterator();
	while(itr.hasNext()) {
		Student ss=(Student)itr.next();
		System.out.println(ss.id+"  "+ss.name+"  "+ss.grade);
		
	}
	
	
}


@Override
public int compareTo(Student o) {
	// TODO Auto-generated method stub
	return this.grade.compareTo(o.grade);
}	

}
