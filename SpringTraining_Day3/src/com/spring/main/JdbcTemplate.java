package com.spring.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.bean.Employee;
import com.spring.dao.EmployeeDao;

public class JdbcTemplate
{
	public static void main(String[] args)
	{	
		ApplicationContext ctx = new ClassPathXmlApplicationContext("springdb.xml");
		EmployeeDao edao = (EmployeeDao) ctx.getBean("emptemplatedao");
		/*
		 * Employee e = new Employee(6, "Sachin","DBA"); edao.save(e);
		 */
		
		List<Employee> emps = edao.getEmps();
		System.out.println("Eid\tName\tRole");
		for(Employee e:emps)
		{	System.out.println(e.getId()+"\t"+e.getName()+"\t"+e.getRole());
		}
		
	}

}
