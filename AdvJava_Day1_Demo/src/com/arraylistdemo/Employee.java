package com.arraylistdemo;

public class Employee
{
	int eId;
	String name;
	
	public Employee(int eId, String name) 
	{	this.eId = eId;
		this.name = name;
	}
	
	public void print()
	{	System.out.println("EId "  + eId +     " Name "+name);
	}
}
