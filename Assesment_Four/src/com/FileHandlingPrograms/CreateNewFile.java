package com.FileHandlingPrograms;

import java.io.File;
import java.io.IOException;

public class CreateNewFile {
	public static void main(String[] args) {
		
		
	File file=new File("C:\\Users\\ramv2c18461\\Desktop\\Java Programs\\java.txt");
	
	try {
		if (file.createNewFile()) {
			System.out.println("File is Created"  +  file.getName());
		}
		else {
			System.out.println("File is Already Created");
		}
	} catch (IOException e) {
		System.out.println("Exception Occured");
		e.printStackTrace();
	}
}
}