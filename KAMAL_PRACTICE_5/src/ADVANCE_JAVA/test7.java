package ADVANCE_JAVA;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class test7   //HASH MAP
{
	public static void main(String[] args)
	{
		HashMap<String, Integer> employee = new HashMap<String, Integer>();
		employee.put("kamal", 44478);
		employee.put("sai", 108789);
		employee.put("Lochan", 3336);
		
		System.out.println(employee);
		
		System.out.println("-----------------");
		
		for(String name : employee.keySet())
		{
			System.out.println(name);
		}

		System.out.println("-----------------");
		
		for(Integer phno : employee.values())
		{
			System.out.println(phno);
		}
		
		System.out.println("-----------------");
		
		for(Entry<String, Integer> emp: employee.entrySet())
		{
			System.out.println("Name: "+emp.getKey()+"\tPhone no: "+emp.getValue());
		}
		
	}
}