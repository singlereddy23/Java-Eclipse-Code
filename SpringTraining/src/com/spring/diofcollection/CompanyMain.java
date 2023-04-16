package com.spring.diofcollection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CompanyMain
{
	public static void main(String[] args)
	{
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/spring/diofcollection/bean.xml");
		
		/*
		 * Company c = (Company) ctx.getBean("comp");
		 * 
		 * System.out.println("Company Name " + c.getName());
		 * System.out.println("Bu Names " + c.getBu());
		 * System.out.println("Account Names " + c.getAccounts());
		 * System.out.println("Infogain at " + c.getLocation());
		 */
		
		DepartmentDetails d = (DepartmentDetails) ctx.getBean("deptdetails");
		d.print();
	}

}
