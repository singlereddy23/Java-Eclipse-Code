package com.spring.dao;

import java.util.List;

import com.spring.bean.Employee;

public interface EmployeeDao
{
	public void save(Employee emp);
	public List<Employee> getEmps();
	
}
