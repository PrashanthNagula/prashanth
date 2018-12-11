package com.atm;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Oos implements Serializable {
	int i=10;
	String str="prashanth";
	public static void main(String[] args) throws IOException {
		
		Oos o=new Oos();
		FileOutputStream fos=new FileOutputStream("D:\\files\\oos1.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(o);
		
	}

}
