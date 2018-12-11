package com.cubic;

public class encapsulation {
	
	private int id;
	private String username;
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
	public static void main(String[] args) {
		encapsulation e=new encapsulation();
		e.setId(125);
		e.setUsername("kishore");
		
		Test.simple(e);
	}

}
