package com.setdemo;

import java.util.HashSet;
import java.util.Set;

public class DepartmentController
{
	Set<Department> departmentSet;
	
	public DepartmentController()
	{
		departmentSet = new HashSet<Department>();

	}
	
	void add()
	{
		departmentSet.add( new Department("Accounting", "Delhi") );
		departmentSet.add( new Department("Finance", "Hyderabad") );
		departmentSet.add( new Department("IT", "Chennai") );
		departmentSet.add( new Department("Human Resource", "Bangalore") );
	}
	
	void display()
	{
		System.out.println("\n**Departments and Location**\n");
		for(Department dept : departmentSet)
		{	System.out.println(dept.getName() + "\t" + dept.getLocation());
		}
		
	}

	public static void main(String[] args)
	{
		DepartmentController deptController = new DepartmentController();
		deptController.add();
		deptController.display();
	}

}
