package com.atm;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Dos {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos=new FileOutputStream("D:\\files\\dos1.txt");
		DataOutputStream dos=new DataOutputStream(fos);
		dos.writeInt(100);
		dos.writeFloat((float) 10.0);
		dos.writeUTF("prashanth");
		System.out.println("success");
		
	}

}
