package com.ExceptionHandling;

public class MultipleTryCatch {

	public static void main(String[] args) {
		try {
			String name="Raman";
			int n=Integer.parseInt(name);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			int number=101/0;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			String name=null;
			int length = name.length();
			System.out.println(length);
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			int a[]=new int[5];
			a[10]=50;
			System.out.println(a[10]);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		}
	}
	
	

