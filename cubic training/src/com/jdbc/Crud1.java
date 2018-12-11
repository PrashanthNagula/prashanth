package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.HashSet;
import java.util.Scanner;

public class Crud1 {
	static Connection conn;
	public static void connection(){
		
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
		 conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","prashanth");
		}catch(Exception e){
			System.out.println(e);
		}
		
	}

	public static void insert() {
		try{
			Scanner sc=new Scanner(System.in);
		System.out.println("enter username....");
		String username=sc.next();
		System.out.println("enter password...");
		String password=sc.next();
		System.out.println("enter email");
		String email=sc.next();
		System.out.println("enter id");
		int id=sc.nextInt();
		connection();
		
		
		//Class.forName("oracle.jdbc.driver.OracleDriver");
		//Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","prashanth");
		PreparedStatement pstmt=conn.prepareStatement("insert into crud(username,password,email,id) values(?,?,?,?)");
		pstmt.setString(1, username);
		pstmt.setString(2, password);
		pstmt.setString(3, email);
		pstmt.setInt(4, id);
		int i=pstmt.executeUpdate();
		System.out.println(i);
		if(i==1){			System.out.println("insert success");
	}else{System.out.println("insert failed");}
		}catch(Exception e){
		System.out.println(e);
		}
		
		// TODO Auto-generated method stub
		
	}

	public static void retrieve() {
		try{
			connection();
			//Class.forName("oracle.jdbc.driver.OracleDriver");
			//Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","prashanth");
			PreparedStatement pstmt=conn.prepareStatement("select * from crud");
			ResultSet rs=pstmt.executeQuery();
			while(rs.next()){
				System.out.println("UserName::::"+rs.getString("UserName")+" "+"Password::::"+rs.getString("Password")+" "+"Email:::"+rs.getString("Email")+" "+"Id:::"+rs.getInt("Id"));
			}
					
			
		}catch(Exception e){System.out.println(e);}
		// TODO Auto-generated method stub
		
	}

	public static void update() {
		try{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter valid UserName:::::");
			String UserName=sc.next();
			connection();
			
			
			
			
			//Class.forName("oracle.jdbc.driver.OracleDriver");
			//Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","prashanth");
			PreparedStatement pstmt=conn.prepareStatement("select * from crud");
	
			ResultSet rs=pstmt.executeQuery();
			HashSet<String> hm=new HashSet();
			while(rs.next()){
				
				hm.add(rs.getString("UserName"));
				
				}
			if(hm.contains(UserName)){
				connection();
				//Class.forName("oracle.jdbc.driver.OracleDriver");
				//Connection conn1=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","prashanth");
				PreparedStatement pstmt1=conn.prepareStatement("update crud set UserName=?,Password=?,Email=?,Id=? where UserName=?");
				System.out.println("Enter new details::::::::");
				System.out.println("enter UserName::::");
				String username =sc.next();
				System.out.println("enter password:::::");
				String password=sc.next();
				System.out.println("Enter email::::");
				String Email=sc.next();
				System.out.println("Enter Id::::::");
				int id=sc.nextInt();
				pstmt1.setString(1, username);
				pstmt1.setString(2,password);
				pstmt1.setString(3, Email);
				pstmt1.setInt(4, id);
				pstmt1.setString(5,UserName);
				
				int i=pstmt1.executeUpdate();
				if(i==1){
					System.out.println("insert success");
				}else{
					System.out.println("insert not success");
				}
				
				
			}else{System.out.println("record not found");}
			
		}catch(Exception e){System.out.println(e);}
		// TODO Auto-generated method stub
		
	}

	public static void delete() {
		try{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter valid UserName:::::::");
			String UserName=sc.next();
			connection();
			//Class.forName("oracle.jdbc.driver.OracleDriver");
			//Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","prashanth");
			PreparedStatement pstmt=conn.prepareStatement("select * from crud");
			ResultSet rs=pstmt.executeQuery();
			HashSet<String> hm=new HashSet();
			while(rs.next()){
				hm.add(rs.getString("UserName"));
				
			}
			if(hm.contains(UserName)){
				connection();
				//Class.forName("oracle.jdbc.driver.OracleDriver");
				//Connection conn1=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","prashanth");
				PreparedStatement pstmt1=conn.prepareStatement("delete crud");
				int i=pstmt1.executeUpdate();
				if(i==1){
					System.out.println("table deleted");
				}else{System.out.println("table not deleted");}
				
			}else{System.out.println("record not found");}
			
		}catch(Exception e){System.out.println(e);}
		
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
		connection();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter option:"
				+ "1.insert"
				+ "2.retrieve"
				+ "3.update"
				+ "4.delete");
		int i=sc.nextInt();
		switch(i){
		case 1:{Crud1.insert();
		break;}
		case 2:{Crud1.retrieve();
		break;}
		case 3:{Crud1.update();
		break;
		}
		case 4:{Crud1.delete();
		break;
		}
		}
		
	}

}
