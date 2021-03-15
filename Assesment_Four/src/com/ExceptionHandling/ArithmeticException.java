package com.ExceptionHandling;

public class ArithmeticException {

	public static void main(String[] args) {
		try {
			int number=101/0;
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}
}
