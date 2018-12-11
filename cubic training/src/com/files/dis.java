package com.files;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class dis {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis=new FileInputStream("D:\\files\\dos.txt");
		DataInputStream dis=new DataInputStream(fis);
		System.out.println(dis.readInt());
		System.out.println(dis.readFloat());
		System.out.println(dis.readUTF());
		System.out.println(dis.readDouble());		
	}
	
	
}
