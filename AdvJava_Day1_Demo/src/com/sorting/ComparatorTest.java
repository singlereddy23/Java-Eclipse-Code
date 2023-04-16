package com.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorTest
{
	public static void main(String[] args)
	{
		List<Employee1> e1 = new ArrayList<>();
		
		e1.add(new Employee1("Kamal", 23));
		e1.add(new Employee1("Sai", 21));
		
		System.out.println("Elements before sorting");
		System.out.println(e1);
		
		Collections.sort( e1, new AgeComparator() );
		
		System.out.println("Element After Sorting by age");
		System.out.println(e1);
		
		Collections.sort( e1, new NameComparator() );
		System.out.println("Element After Sorting by name");
		System.out.println(e1);
	}

}
