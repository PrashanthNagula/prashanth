package com.files;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class dos {
	
	public static void main(String[] args) throws IOException {
		
		FileOutputStream fos=new FileOutputStream("D:\\files\\dos.txt");		
		DataOutputStream dos=new DataOutputStream(fos);
		dos.writeInt(25);
		dos.writeFloat((float) 25.8);
		dos.writeUTF("cubic");
		dos.writeDouble(25.555);
		System.out.println("success");
		
	}

}
