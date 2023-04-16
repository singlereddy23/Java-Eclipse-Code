package demo1;

public class test1
{
	int Rollno;
	String Name;
	String Address;
	
	public test1()
	{
	}

	public int getRollno()
	{
		return Rollno;
	}

	public void setRollno(int rollno)
	{
		Rollno = rollno;
	}

	public String getName()
	{
		return Name;
	}

	public void setName(String name)
	{
		Name = name;
	}

	public String getAddress()
	{
		return Address;
	}

	public void setAddress(String address)
	{
		Address = address;
	}

	public test1(int rollno, String name, String address)
	{
		Rollno = rollno;
		Name = name;
		Address = address;
	}

	//@Override
	public String toString()
	{
		return "test1 [Rollno=" + Rollno + ", Name=" + Name + ", Address=" + Address + "]";
	}
	
	public void Display()
	{
		System.out.println("Rollno=" + Rollno + ", \tName=" + Name + ", \tAddress=" + Address);
	}
	
	
	
	
	
	
	
	
	
}
