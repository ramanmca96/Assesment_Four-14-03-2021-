package com.FileHandlingPrograms;

import java.io.File;
import java.io.FileWriter;

public class WriteOnTheNewFile {

	public static void main(String[] args) {
		File file=new File("C:\\Users\\ramv2c18461\\Desktop\\Java Programs\\java.txt");
		try {
			if(file.canWrite())
				System.out.println(file.canWrite());
			
			FileWriter filewriter=new FileWriter(file);
			filewriter.write("You can Do it.");
			filewriter.close();
			System.out.println("File has been writted Successfully");
		} catch (Exception e) {
			System.out.println("Exception Occured");
			e.printStackTrace();
		}
		
	}
}
