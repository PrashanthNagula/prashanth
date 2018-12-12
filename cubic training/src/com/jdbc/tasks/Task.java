package com.jdbc.tasks;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Scanner;

public class Task {

	public static void registrationForm(Connection conn) {
		try{
			Scanner sc=new Scanner(System.in);
		System.out.println("Enter UserName::::");
		String UserName=sc.next();
		System.out.println("Enter Password:::::");
		String Password=sc.next();
		System.out.println("Enter Email::::::");
		String Email=sc.next();
		System.out.println("Enter Id");
		int Id=sc.nextInt();
			PreparedStatement pstmt=conn.prepareStatement("insert into form(UserName,Password,Email,Id) values(?,?,?,?)");
			pstmt.setString(1,UserName);
			pstmt.setString(2, Password);
			pstmt.setString(3, Email);
			pstmt.setInt(4, Id);
			int i=pstmt.executeUpdate();
			if(i==1){
				System.out.println("Registered Successfully");
			}else{
				System.out.println("Unsuccessful Registration");
			}
		} catch(Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		
		// TODO Auto-generated method stub
		
	}

	public static void retrieve(Connection conn) {
		try{
			PreparedStatement pstmt=conn.prepareStatement("select * from FORM");
			ResultSet rs=pstmt.executeQuery();
			while(rs.next()){
				System.out.println("UserName::::::"+rs.getString("UserName")+" "+"Password::::::"+rs.getString("Password")+" "+"Email::::"+rs.getString("Email")+" "+"Id:::::"+rs.getInt("Id"));
				
			}
			
		}catch(Exception e){System.out.println(e);}
		// TODO Auto-generated method stub
		
	}

	public static void admin(Connection conn) {
		try{
	     Scanner sc=new Scanner(System.in);
	     System.out.println("Welcome to Admin Login......");
		System.out.println("Enter UserName:::::::");
		String UserName=sc.next();
		System.out.println("Enter Password:::::::");
		String Password=sc.next();
		PreparedStatement pstmt=conn.prepareStatement("select * from ADMIN");
		ResultSet rs=pstmt.executeQuery();
		HashSet<String> hs=new HashSet();
		while(rs.next()){
			hs.add(rs.getString("UserName"));
			hs.add(rs.getString("Password"));
		}
		HashSet<String> hs1=new HashSet();
		if(hs.contains(UserName)&&hs.contains(Password)){
			PreparedStatement pstmt1=conn.prepareStatement("select * from FORM");
			ResultSet rs1=pstmt1.executeQuery();
			
			System.out.println("List of User's::::::::");
			while(rs1.next()){
				hs1.add(rs1.getString("UserName"));
				
				System.out.println(rs1.getString("UserName"));
			}
			
		
		
		System.out.println("Enter UserName to Approve::::");
		String uname=sc.next();
		if(hs1.contains(uname)){
			PreparedStatement pstmt2=conn.prepareStatement("insert into APPROVE(UserName) values(?)");
			pstmt2.setString(1,uname);
			int i=pstmt2.executeUpdate();
			if(i==1){
				System.out.println("User Approved Successfully");
			}else{
				System.out.println("Approve failed ");
			}
		}else{
			System.out.println("Enter valid UserName ");
		}
			
			
		}else{
			System.out.println("Enter valid UserName or Password");
		}
			
		
			
		}catch(Exception e){System.out.println(e);}
		
		// TODO Auto-generated method stub
		
	}

	public static void user(Connection conn) throws Exception {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to User Login...... ");
		System.out.println("Enter UserName::::::");
		String UserName=sc.next();
		System.out.println("Enter Password::::::");
			
		String Password=sc.next();
		PreparedStatement pstmt2;
		
			 pstmt2=conn.prepareStatement("select * from FORM where UserName=?");
		
		
		pstmt2.setString(1, UserName);
		
		ResultSet rs2=pstmt2.executeQuery();
		HashSet<String> hs1=new HashSet();
		while(rs2.next()){
			hs1.add(rs2.getString("UserName"));
			hs1.add(rs2.getString("Password"));
		}
		if(hs1.contains(UserName) && hs1.contains(Password)){
		PreparedStatement pstmt=conn.prepareStatement("select * from APPROVE");
		ResultSet rs=pstmt.executeQuery();
		HashSet<String> hs=new HashSet();
		while(rs.next()){
			hs.add(rs.getString("UserName"));
		}
		if(hs.contains(UserName)){
			System.out.println("Welcome..........");
			System.out.println("You are Approved......");
			PreparedStatement pstmt1=conn.prepareStatement("select * from FORM where UserName=?");
			pstmt1.setString(1, UserName);
			ResultSet rs1=pstmt1.executeQuery();
			while(rs1.next()){
				System.out.println("UserName:::"+rs1.getString("UserName")+"  "+"Password:::::"+rs1.getString("Password")+"  "+"Email:::::"+rs1.getString("Email")+"  "+"Id:::::::"+rs1.getInt("Id"));
			}
			
		}else{
			System.out.println("You are not Approved.........");
		}
		}else{
			System.out.println("Enter valid UserName or Password");
		}
		
		
		}
		
		
		// TODO Auto-generated method stub
		
	}
	
	
	

	

	


