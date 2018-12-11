package com.cubic;

public class Encap {
	private String username;
	private String password;
	private int idno;
	

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


	public int getIdno() {
		return idno;
	}


	public void setIdno(int idno) {
		this.idno = idno;
	}


	public static void main(String[] args) {
		Encap e=new Encap();
		e.setUsername("cubic");
		e.setPassword("cubic123");
		e.setIdno(1234);
		System.out.println(e.getUsername());
		System.out.println(e.getPassword());
		System.out.println(e.getIdno());
		Testing.test(e);
		

	}

}
