package com.collections;

import java.util.HashMap;
import java.util.Map;

public class Book {
	int id;
	String name;
	String author;
	String publisher;
	int quantity;
	public Book(int id,String name,String author,String publisher,int quantity){
	this.id=id;
	this.name=name;
	this.author=author;
	this.publisher=publisher;
	this.quantity=quantity;
	}
	public static void main(String[] args) {
		Book b1=new Book(100,"letusc","peter","jhgdekj",4);
		Book b2=new Book(101,"java","chand","djhkg",5);
		Book b3=new Book(102,".net","rutherford","fjfiu",6);
		HashMap<Integer,Book> hm=new HashMap();
		hm.put(1, b1);
		hm.put(2,b2);
		hm.put(3,b3);
		
		for(Map.Entry<Integer,Book> m:hm.entrySet()){
			int key=m.getKey();
			Book b=m.getValue();
			System.out.println(key+"details:");
			System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
		}
	}

}
