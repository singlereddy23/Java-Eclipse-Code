package com.mapdemo;

public class Job 
{
	// instance variable
	String title;
	long minSalary;
	long maxSalary;

	// constructor
	public Job(String title, long minSalary, long maxSalary) 
	{	this.title = title;
		this.minSalary = minSalary;
		this.maxSalary = maxSalary;
	}

	// overriding toString method
	@Override
	public String toString() 
	{
		return "Job [title=" + title + ", minSalary=" + minSalary + ", maxSalary=" + maxSalary + "]";
	}
	
}
