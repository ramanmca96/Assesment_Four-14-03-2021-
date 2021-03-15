package com.ExceptionHandling;



public class NumberFormatException {

	public static void main(String[] args) {
		try {
			String name="Raman";
			int n=Integer.parseInt(name);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
//		try {
//			int number=101/0;
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
	}
	
	
}
