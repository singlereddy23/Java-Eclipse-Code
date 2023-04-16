package ADVANCE_JAVA;

public class test1
{
	int rollno;
	String name;
	String address;
	
	public test1()
	{
	}

	public test1(int rollno, String name, String address)
	{
		this.rollno = rollno;
		this.name = name;
		this.address = address;
	}

	public int getRollno()
	{	return rollno;
	}
	public void setRollno(int rollno)
	{	this.rollno = rollno;
	}
	public String getName()
	{	return name;
	}
	public void setName(String name)
	{	this.name = name;
	}
	public String getAddress()
	{	return address;
	}
	public void setAddress(String address)
	{	this.address = address;
	}

	@Override
	public String toString()
	{
		return "test1 [rollno=" + rollno + ", name=" + name + ", address=" + address + "]";
	}
	
	public void Display()
	{
		System.out.println("rollno=" + rollno + ", name=" + name + ", address=" + address);
	}
}