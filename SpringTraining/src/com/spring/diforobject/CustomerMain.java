package com.spring.diforobject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CustomerMain
{

	public static void main(String[] args)
	{
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/spring/diforobject/spring.xml");
		
		Customer cust = (Customer) ctx.getBean("customer");
		System.out.println("Cust Id "+cust.getCustId()+" Name "+cust.getCustName()+" City "+cust.getAddress().getCity());
		
	}
	
}
