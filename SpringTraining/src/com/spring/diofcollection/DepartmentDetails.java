package com.spring.diofcollection;

//com.spring.diofcollection.DepartmentDetails

import java.util.*;

public class DepartmentDetails
{
	private String cName;
	private List<Department> depts;
	
	public String getcName()
	{	return cName;
	}
	public void setcName(String cname)
	{	this.cName = cname;
	}
	public List<Department> getDepts()
	{	return depts;
	}
	public void setDepts(List<Department> depts)
	{	this.depts = depts;
	}
	
	public void print()
	{
		System.out.println("Company Name " + getcName());
		
		for(Department d : depts)
		{	System.out.println("Dept Names " + d.getDname());
		}
	}
	
}
