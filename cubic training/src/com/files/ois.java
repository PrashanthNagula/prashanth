package com.files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ois {
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		FileInputStream fis=new FileInputStream("D:\\files\\oos.txt");
		ObjectInputStream oi=new ObjectInputStream(fis);
	    oos o=(oos) oi.readObject();
	    System.out.println(o.getEmail());
	}

}
