package com.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.bean.Employee;
import com.spring.dao.ManageEmployee;

public class jdbcMain
{
	public static void main(String[] args)
	{	
		ApplicationContext ctx = new ClassPathXmlApplicationContext("springdb.xml");
		ManageEmployee m = (ManageEmployee) ctx.getBean("empDao");
		Employee e1 = new Employee(4, "Andy","TL");
		Employee e2 = new Employee(5, "Kavita","PM");
		m.add(e1);
		m.add(e2);
		m.show();
		
	}

}
