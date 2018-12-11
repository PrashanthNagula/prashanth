package com.jdbc;

import java.util.Scanner;

public class MainApp {
	public static void main(String[] args) {
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
		default: {System.out.println("invalid option");
		break;
		}
		}
		
	}
	

}
