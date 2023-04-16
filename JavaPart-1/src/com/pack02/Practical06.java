package com.pack02;

class EmployeeA
{
	int empId;
	String empName;
}

class EmployeeB
{
	private int empId;
	private String empName;
	
	public EmployeeB(int empId, String empName) 
	{
		this.empId = empId;
		this.empName = empName;
	}
}//end of class EmployeeB



class Book
{
	private String name;   //getName() & setName()
	private double price;
	private int pages;
	
	
	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	
	
	public Book(String name, double price, int pages) 
	{
		this.name = name;
		this.price = price;
		this.pages = pages;
	}

	
	
	public Book(String name, double price) 
	{
		this.name = name;
		this.price = price;
	}
}



public class Practical06 
{
	public static void main(String[] args) 
	{
		
		EmployeeA e1 = new EmployeeA();
		//e1.empId = 1001;
		//e1.empName = "Kamal";
		
		EmployeeB e2 = new EmployeeB(1002,"John");
		//e1.empId = 1001;
		//e1.empName = "Kamal";
		
		
		Book b1 = new Book("Avangers", 250.50);
		Book b2 = new Book("Harry Potter", 350.50, 400);
		b2.setPrice(450.50);

	}
}
