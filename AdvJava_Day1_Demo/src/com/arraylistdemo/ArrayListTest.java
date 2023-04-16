package com.arraylistdemo;

import java.util.*;

//ArrayList Creation Storing and Retrieval
public class ArrayListTest
{
	public static void main(String[] args)
	{
		//List<String> a1 = new LinkedList<>();
		//ArrayList<String> a1 = new ArrayList<>();
		
		ArrayList al = new ArrayList() ;    //Non-Generic /Old style
		
		al.add("Ravic");
		al.add("Amit");
		al.add("Mohit");
		al.add("Jeet");
		//al.add(12);
		//al.add(15.5);
		
		System.out.println(al);
		
		int len = al.size();
		System.out.println("Total elements = " + len);
		
		
		al.add("Mohit");
		System.out.println(al);
		
		

		System.out.println("Value at inxex 0="+ al.get(0) );
		
		System.out.println(al.contains("Delhi"));
		System.out.println(al.contains("Jeet"));
		
		System.out.println("\n\nMethod-1: Printing Element using For loop ");
		for(int i=0; i<al.size(); i++)
		{	System.out.println("Hello : " + al.get(i)   );
		}
		
		System.out.println("\n\nMethod-2: Printing Element using Foreach loop ");
		for(Object s:al)
		{   String str = (String)s;
			System.out.println(str+" " + str.length() );
		}
		
		System.out.println("\n\nMethod-3: Printing Element using Iterator loop ");
		Iterator itr = al.iterator();
		
		while(itr.hasNext())
		{   String str = (String) itr.next();
			System.out.println(str);
		}
		
		System.out.println("\n\nMethod-4: Printing Element using ListIerator loop ");
		ListIterator lstr = al.listIterator();
		
		System.out.println("\nForward Printing...");
		while(lstr.hasNext())
		{	System.out.println(lstr.next());
		} 
		
		System.out.println("\nBackward Printing...");
		while(lstr.hasPrevious())
		{	System.out.println(lstr.previous());
		}
		
		
		System.out.println("------------------------------------------------------");
		
		
        ArrayList<String> al2 = new ArrayList<String>() ;    //Generic / New style
		
		al2.add("Ravic");
		al2.add("Amit");
		al2.add("Mohit");
		al2.add("Jeet");
		
		System.out.println(al2);
		
		int len2 = al2.size();
		System.out.println("Total elements = " + len2);
		
		
		al2.add("Mohit");
		System.out.println(al2);
		
		System.out.println("Value at inxex 0="+ al2.get(0) );
		
		System.out.println(al2.contains("Delhi"));
		System.out.println(al2.contains("Jeet"));
		
		
		System.out.println("\n\nMethod-1: Printing Element using For loop ");
		for(int i=0; i<al2.size(); i++)
		{
			System.out.println("Hello : " + al2.get(i)  );
		}
		
		
		System.out.println("\n\nMethod-2: Printing Element using Foreach loop ");
		for(String s:al2)
		{   //String str = (String)s;
			System.out.println(s +" " + s.length() );
		}
		
		System.out.println("\n\nMethod-3: Printing Element using Iterator loop ");
		Iterator<String> itr2 = al2.iterator();
		
		while(itr2.hasNext())
		{   String s = itr2.next();
			System.out.println(s );
		}
		
		System.out.println("\n\nMethod-4: Printing Element using ListIerator loop ");
		ListIterator<String> lstr2 = al2.listIterator();
		
		System.out.println("\nForward Printing...");
		while(lstr2.hasNext())
		{	System.out.println(lstr2.next());
		} 
		
		System.out.println("\nBackward Printing...");
		while(lstr2.hasPrevious())
		{	System.out.println(lstr2.previous());
		}
		
	}//End of main()

}