package com.FileHandlingPrograms;

import java.io.File;

public class DeletedTheCreatedFile {
	public static void main(String[] args) {
		File file=new File("C:\\Users\\ramv2c18461\\Desktop\\Java Programs\\java.txt");
		try {
			if (file.delete()) {
				System.out.println("Deleted The File " +file.getName());
		}
			else
			{
				System.out.println("Failed to delete Its Already Deleted");
			}
		} catch (Exception e) {
			System.out.println("Exception Occured");
			e.printStackTrace();
		}
	}
}
