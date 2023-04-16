package com.spring.diforobject;

//com.spring.diforobject.Customer

public class Customer
{
	private String custId;
	private String custName;
	private Address address;	//DI for Object

	public String getCustId()
	{	return custId;
	}

	public void setCustId(String custId)
	{	this.custId = custId;
	}

	public String getCustName()
	{	return custName;
	}

	public void setCustName(String custName)
	{	this.custName = custName;
	}

	public Address getAddress()
	{	return address;
	}

	public void setAddress(Address address)
	{	this.address = address;
	}
	
	
	
	
	
	
	
}
