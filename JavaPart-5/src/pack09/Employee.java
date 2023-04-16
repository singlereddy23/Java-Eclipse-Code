package pack09;

import java.io.Serializable;

public class Employee implements Serializable
{
	private String name;
	private int empId;
	transient private int age;
	
	public Employee()
	{
	}

	public Employee(String name, int empId, int age)
	{	this.name = name;
		this.empId = empId;
		this.age = age;
	}

	@Override
	public String toString()
	{
		return "Employee [name=" + name + ", empId=" + empId + ", age=" + age + "]";
	}
	
	
	
	
}
