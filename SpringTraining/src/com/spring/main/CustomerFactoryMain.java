package com.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.bean.Customer;

public class CustomerFactoryMain
{

	public static void main(String[] args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		Customer customer = (Customer)context.getBean("factory");
		
		System.out.println("Customer Details");
		
		customer.print();
	}

}
