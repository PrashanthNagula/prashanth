package com.files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class files {
	
	public static void main(String[] args) throws IOException {
		
		FileInputStream fis=new FileInputStream("D:\\files\\dos.txt");	
		int i;
		while((i=fis.read())!=-1){
			System.out.print((char)i);
		}
	}

}
