package com.spring.main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.spring.bean.Customer;

public class CustomerMain
{
	public static void main(String[] args)
	{ 
		//Customer customer  = new Customer();
		
		//Customer customer1 = new Customer(102, "SAI", 8000.56F);
		
		// customer.print(); //o/p null null 0.0

		/*
		 * customer.setCustId(101); customer.setcustName("Kamal");
		 * customer.setOrderAmt(5000.96f);
		 * 
		 * customer.print();
		 */
		//customer1.print();
		
		//Resource resource = new ClassPathResource("spring.xml");
		
		//BeanFactory factory = new XmlBeanFactory(resource);
		
		ApplicationContext factory = new ClassPathXmlApplicationContext("spring.xml");
		
		Customer customer = (Customer) factory.getBean("cust");
		
		Customer customer1 = (Customer) factory.getBean("cust1");
		System.out.println("Value in case of setter based DI");
		customer.print();
		
		System.out.println("Value in case of constructor based DI");
		customer1.print();
		
	}
}
