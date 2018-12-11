package com.comparable;

import java.util.Iterator;
import java.util.TreeSet;

public class Student implements Comparable<Student> {
	int id;
	String name;
	String grade;
	Student(int id,String name,String grade){
		this.id=id;
		this.name=name;
		this.grade=grade;
	}
	public static void main(String[] args) {
		Student s=new Student(100,"prashanth","c");
		Student s1=new Student(101,"rajesh","b");
		Student s2=new Student(102,"sai","a");
		TreeSet<Student> ts=new TreeSet();
		ts.add(s);
		ts.add(s1);
		ts.add(s2);
		System.out.println(ts.toString());
//		Iterator<Student> itr=ts.iterator();
//		while(itr.hasNext()){
//			Student ss=itr.next();
//			System.out.println(ss.id+" "+ss.name+" "+ss.grade);
//		}
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", grade=" + grade + "]";
	}
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return this.grade.compareTo(o.grade);
	}

}
