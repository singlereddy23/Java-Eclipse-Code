package com.spring.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Employee2")
public class Employee
{	
	@Id
	private Integer id;
	private String name;
	private String role;
	
	public Integer getId()
	{	return id;
	}
	public void setId(Integer id)
	{	this.id = id;
	}
	public String getName()
	{	return name;
	}
	public void setName(String name)
	{	this.name = name;
	}
	public String getRole()
	{	return role;
	}
	public void setRole(String role)
	{	this.role = role;
	}
	
	public Employee(Integer id, String name, String role)
	{	//super();
		this.id = id;
		this.name = name;
		this.role = role;
	}
	
	public Employee()
	{// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString()
	{	return "Employee [id=" + id + ", name=" + name + ", role=" + role + "]";
	}
	
}
