package com.ExceptionHandling;

public class NullPointerException {

	public static void main(String[] args) {
	try {
		String name=null;
		int length = name.length();
		System.out.println(length);
	
	} catch (Exception e) {
		e.printStackTrace();
	}	}
}
