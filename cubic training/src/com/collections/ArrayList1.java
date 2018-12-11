package com.collections;
import java.util.*;

public class ArrayList1 {
	public static void main(String[] args) {

	LinkedList al=new LinkedList();
	al.add("prashanth");
	al.add(100);
	al.add(12.3);
	System.out.println(al.toString());
 Iterator itr=al.iterator();
 while(itr.hasNext()){
	 System.out.println(itr.next());
 }

}}
