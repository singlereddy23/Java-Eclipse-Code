package com.spring.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

import com.spring.bean.Employee;

//com.spring.dao.EmployeeHibernate
public class EmployeeHibernate implements EmployeeDao
{
	@Autowired
	private SessionFactory sessionFactory;
	
	private Session session;

	@Override
	public void save(Employee emp)
	{	
		session = sessionFactory.openSession();
		
		Transaction tx = session.beginTransaction();
		session.save(emp);
		tx.commit();
		session.close();
	}

	@Override
	public List<Employee> getEmps()
	{	
		session = sessionFactory.openSession();
		
		List<Employee> elist = new ArrayList<Employee>();
		
		elist = session.createCriteria(Employee.class).list();
		
		return elist;
	}	
	
}
