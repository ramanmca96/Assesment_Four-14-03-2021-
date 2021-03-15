package com.FileHandlingPrograms;

import java.io.File;
import java.util.Scanner;

public class ReadTheNewFile {
	public static void main(String[] args) {
		File file=new File("C:\\Users\\ramv2c18461\\Desktop\\Java Programs\\java.txt");
		try {
			System.out.println(file.canRead());
			Scanner scan=new Scanner(file);
			
			while (scan.hasNextLine()) {
			String line = scan.nextLine();
			System.out.println(line);
			System.out.println("File Can be readed");
		}
		} catch (Exception e) {
			System.out.println("Exception Occured");
			e.printStackTrace();
		}
	}
}
