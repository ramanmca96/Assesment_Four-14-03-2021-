package com.CollectionsPrograms;

import java.util.ArrayList;

public class ArrayListPrograms {

	public static void main(String[] args) {
		
		ArrayList<Integer> employeeID=new ArrayList<Integer>();
		employeeID.add(101);
		employeeID.add(102);
		employeeID.add(103);
		employeeID.add(104);
		employeeID.add(105);
		System.out.println(employeeID);
		System.out.println(employeeID.get(3));
		
		ArrayList<String> employeename=new ArrayList<String>();
		employeename.add("willSmith");
		employeename.add("Jony Depp");
		employeename.add("Tom Hanks");
		employeename.add("Decaprio");
		             
		System.out.println(employeename);
		
		employeename.set(4, "Morgan Freeman");
		System.out.println(employeename.get(3));
		
		ArrayList<Object> company=new ArrayList<Object>();
		company.addAll(employeeID);
		company.addAll(employeename);
		System.out.println(company);
	}
}
