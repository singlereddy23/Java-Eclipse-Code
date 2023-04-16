package com.spring.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.bean.Employee;

public class EmployeeDaoImpl implements EmployeeDao
{
	@Autowired
	private DataSource dataSource;
	
	public DataSource getDataSource()
	{	return dataSource;
	}

	public void setDataSource(DataSource dataSource)
	{	this.dataSource = dataSource;
	}

	@Override
	public void save(Employee emp)
	{	String query = "insert into employee2 (id,name,role) values (?,?,?)";
		JdbcTemplate temp = new JdbcTemplate(dataSource);
		Object [] args = new Object [] {emp.getId(),emp.getName(),emp.getRole()};
		
		int res = temp.update(query,args);
		if(res!=0)
		{	System.out.println("Employee Saved with id " +emp.getId());
		}
		else
		{	System.out.println("Error");
		}
	}

	@Override
	public List<Employee> getEmps()
	{	
		String query = "select * from employee2";
		JdbcTemplate temp = new JdbcTemplate(dataSource);
		List<Employee> elist = temp.query(query, new EmployeeRowMapper());
		return elist;
	}
	
	
}
