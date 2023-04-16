package com.spring.diofcollection;

//com.spring.diofcollection.Company

import java.util.*;

public class Company
{
	private String 				name;
	
	private List<String>		bu;
	
	private Set<String>			accounts;
	
	private Map<String, String>	location;
	
	
	
	public String getName()
	{	return name;
	}
	public void setName(String name)
	{	this.name = name;
	}
	public List<String> getBu()
	{	return bu;
	}
	public void setBu(List<String> bu)
	{	this.bu = bu;
	}
	public Set<String> getAccounts()
	{	return accounts;
	}
	public void setAccounts(Set<String> accounts)
	{	this.accounts = accounts;
	}
	public Map<String, String> getLocation()
	{	return location;
	}
	public void setLocation(Map<String, String> location)
	{	this.location = location;
	}
	
	
	
}
