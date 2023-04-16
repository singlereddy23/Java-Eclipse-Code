package com.spring.bean;

//com.spring.bean.Customer

public class Customer
{

	private Integer custId;
	private String custName;
	private Float orderAmt;
	
	/*
	ALT+SHIFT+S->R	GENERATING SETTERS & GETTERS
	ALT+SHIFT+S->O	GENERATING PARAMETRIZED
	ALT+SHIFT+S->S	OVERRIDING TOSTRING METHOD
	*/
	
	public Customer()
	{
		// TODO Auto-generated constructor stub
	}

	public Customer(Integer custId, String custName, Float orderAmt)
	{	this.custId = custId;
		this.custName = custName;
		this.orderAmt = orderAmt;
	}
	
	public Integer getCustId()
	{	return custId;
	}
	public void setCustId(Integer custId)
	{	this.custId = custId;
	}
	public String getcustName()
	{	return custName;
	}
	public void setcustName(String custName)
	{	this.custName = custName;
	}
	public Float getOrderAmt()
	{	return orderAmt;
	}
	public void setOrderAmt(Float orderAmt)
	{	this.orderAmt = orderAmt;
	}

	@Override
	public String toString()
	{	return "Customer [custId=" + custId + ", custName=" + custName + ", oederAmt=" + orderAmt + "]";
	}
	
	public void print()
	{	System.out.println("Cust Id " + custId + " Name " + custName + " Order Amount " + orderAmt);
	}
	
}
