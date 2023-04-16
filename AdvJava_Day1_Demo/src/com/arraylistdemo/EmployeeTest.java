package com.arraylistdemo;

import java.util.ArrayList;
import java.util.Iterator;

public class EmployeeTest 
{
	public static void main(String[] args) 
	{
		ArrayList<Employee>	al=new ArrayList<>();
		
		al.add(new Employee(101, "Ravic"));
		al.add(new Employee(102, "Mohit"));
		al.add(new Employee(103, "Aditya"));
		al.add(new Employee(104, "Jeet"));
		
		
		System.out.println("\n\nMethod-1: Printing all employees:");
		for(Employee e  : al)
		{
			e.print();
		}
		
		System.out.println("\n\nMethod-2: Printing all employees:");
		Iterator<Employee> it=al.iterator();
		while(it.hasNext())
		{
			Employee ea=it.next();
			ea.print();
		}
	}
}
