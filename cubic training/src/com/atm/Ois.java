package com.atm;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Ois {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream fis=new FileInputStream("D:\\files\\oos1.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Oos o=(Oos) ois.readObject();
		System.out.println(o.i+" "+o.str);
	}

}
