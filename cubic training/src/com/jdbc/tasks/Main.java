package com.jdbc.tasks;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {
public static void main(String[] args) throws Exception {
	
	
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","prashanth");
	int i=1;
	while(i==1){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the required option...."+"\n"+"1.RegistrationForm"+"\n"+"2.RetrieveForm"+"\n"+"3.Admin Login"+"\n"+"4.User Login");
    int n=sc.nextInt();
    
	switch(n){
	case 1:{
		Task.registrationForm(conn);
		break;
	}
	case 2:{
		Task.retrieve(conn);
		break;
	}
	case 3:{
		Task.admin(conn);
		break;
	}
	case 4:{
		Task.user(conn);
		break;
	}
	default:{
		System.out.println("Enter valid option");
	}
	
	}
	System.out.println("To Goback press 1");
	int c=sc.nextInt();
	}
}
	
	// TODO Auto-generated constructor stub
}

