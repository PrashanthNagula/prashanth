package com.files;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class oos implements Serializable{
	
	private String username;
	private String password;
	private String email;
	private int id;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public static void main(String[] args) throws IOException {
		
		oos o=new oos();
		o.setUsername("cubic");
		o.setPassword("cubic123");
		o.setEmail("cubic@gmail.com");
		o.setId(147);
		FileOutputStream fos=new FileOutputStream("D:\\files\\oos.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(o);
		System.out.println("success");
	}
	

}
