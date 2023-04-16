package Pack1;

public class test1
{
	int rollno;
	String name;
	int phoneno;
	String address;

	public test1()
	{
	}

	public test1(int rollno, String name, int phoneno, String address)
	{
		this.rollno = rollno;
		this.name = name;
		this.phoneno = phoneno;
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
	public int getPhoneno()
	{	return phoneno;
	}
	public void setPhoneno(int phoneno)
	{	this.phoneno = phoneno;
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
		return "test1 [rollno=" + rollno + ", name=" + name + ", phoneno=" + phoneno + ", address=" + address + "]";
	}
	
	public void Display()
	{
		System.out.println("Rollno   : "+rollno);
		System.out.println("Name     : "+name);
		System.out.println("Phone no : "+phoneno);
		System.out.println("Address  : "+address);
	}
}