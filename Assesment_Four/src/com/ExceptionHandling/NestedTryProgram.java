package com.ExceptionHandling;

public class NestedTryProgram {
public static void main(String[] args) {
	
		try 
		{
			int array[] = new int[10];
			array[12] = 143;
			
			try 
			
			{
				int k = array[12] / 0;
				System.out.println("the value of k: "+k);
			}
			catch(Exception e)
			{
				e.printStackTrace();
				System.out.println("Cannot divide any number by 0");

			}
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
			System.out.println("Array out of index");
		}

	}

}
