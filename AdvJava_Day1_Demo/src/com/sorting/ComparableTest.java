package com.sorting;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableTest
{

	public static void main(String[] args)
	{
		ArrayList<Employee> a1 = new ArrayList<Employee>();
		
		a1.add( new Employee(101, "Kamal", 23) );
		a1.add( new Employee(102, "Sai", 22) );
		a1.add( new Employee(103, "Kartik", 20) );
		
		System.out.println("Elements before Sorting");
		System.out.println(a1);
		
		Collections.sort(a1);
		System.out.println("Elements After Sorting");
		System.out.println(a1);
	}

}
