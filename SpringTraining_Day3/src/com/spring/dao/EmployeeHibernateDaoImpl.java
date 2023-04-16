package com.spring.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;

import com.spring.bean.Employee;

public class EmployeeHibernateDaoImpl implements EmployeeDao
{	
	@Autowired
	private HibernateTemplate template;

	@Override
	public void save(Employee emp)
	{	template.save(emp);
	}

	@Override
	public List<Employee> getEmps()
	{	
		List<Employee> emplist = new ArrayList<Employee>();
		emplist = template.loadAll(Employee.class);
		return emplist;
	}
	
}
