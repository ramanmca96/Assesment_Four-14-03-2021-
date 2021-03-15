package com.FileHandlingPrograms;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileRewrite {

	public static void write(String s,File f)throws IOException {
	FileWriter filewrite=new FileWriter(f,true);
	filewrite.write(s);
	filewrite.close();

}
	public static void main(String[] args) {
		try {
			File f=new File("C:\\Users\\ramv2c18461\\Desktop\\Java Programs\\java.txt");
			
			write("Java is a class-based, object-oriented programming language that is designed to have as few implementation dependencies as possible.", f);
			System.out.println("File Has Been ReWritten");
		}
		
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
