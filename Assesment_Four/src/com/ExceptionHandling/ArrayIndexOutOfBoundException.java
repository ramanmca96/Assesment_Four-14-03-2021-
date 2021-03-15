package com.ExceptionHandling;

public class ArrayIndexOutOfBoundException {

	public static void main(String[] args) {
		try {
			int a[]=new int[5];
			a[10]=50;
			System.out.println(a[10]);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		}
}
