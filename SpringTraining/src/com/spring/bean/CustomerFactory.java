package com.spring.bean;

import java.util.Scanner;

//com.spring.bean.CustomerFactory

public class CustomerFactory
{
	public static Customer getCustomer()
	{
		Customer cust = null;
		System.out.println("Enter Customer type");
		String custType = new Scanner(System.in).nextLine();
		
		if(custType.equalsIgnoreCase("regular") )
		{	cust = new Customer(101,"Amit",5678.90f);
		}
		else if(custType.equalsIgnoreCase("corporate") )
		{	cust = new Customer(102,"Amita",55678.90f);
		}
		else{
			throw new IllegalArgumentException("Unknown Custmer");
		}
		
		return cust;
	}
	
}
