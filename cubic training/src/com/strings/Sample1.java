package com.strings;

public class Sample1 {
	
	int a;
	int b;
	Sample1(int a,int b){
		this.a=a;
		this.b=b;
	}
	
public static void main(String[] args) {
	
	Sample1 s=new Sample1(10,20);
	Sample1 s1=new Sample1(30,40);
	System.out.println(s.a);
	System.out.println(s1.b);
	System.out.println(s.b);
	String str="prashanth";
	String str1="prashanth";
	System.out.println(str.hashCode());
	System.out.println(str1.hashCode());
	System.out.println(s.hashCode());
	System.out.println(s1.hashCode());
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + a;
	result = prime * result + b;
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Sample1 other = (Sample1) obj;
	if (a != other.a)
		return false;
	if (b != other.b)
		return false;
	return true;
}
}
