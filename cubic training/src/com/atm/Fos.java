package com.atm;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Fos {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos=new FileOutputStream("D:\\files\\sample.txt");
	    fos.write(100);
	    fos.write(101);
	}
	

}
