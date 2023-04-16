package Pack1;

public class Test1
{
	String Name;
	int Rollno;
	int Phoneno;
	String Address;
	
	public Test1(String name, int rollno, int phoneno, String address)
	{
		Name = name;
		Rollno = rollno;
		Phoneno = phoneno;
		Address = address;
	}

	public Test1()
	{
	}

	public String getName()
	{	return Name;
	}
	public void setName(String name)
	{	Name = name;
	}
	public int getRollno()
	{	return Rollno;
	}
	public void setRollno(int rollno)
	{	Rollno = rollno;
	}
	public int getPhoneno()
	{	return Phoneno;
	}
	public void setPhoneno(int phoneno)
	{	Phoneno = phoneno;
	}
	public String getAddress()
	{	return Address;
	}
	public void setAddress(String address)
	{	Address = address;
	}

	@Override
	public String toString()
	{
		return "Test1 [Name=" + Name + ", Rollno=" + Rollno + ", Phoneno=" + Phoneno + ", Address=" + Address + "]";
	}
	
	public void Display()
	{
		System.out.println("Name    : " + Name);
		System.out.println("Rollno  : " + Rollno);
		System.out.println("Phoneno : " + Phoneno);
		System.out.println("Address : " + Address);
		
		System.out.println("Name = " + Name + "\tRollno = " + Rollno + "\tPhoneno = " + Phoneno + "\tAddress = " + Address );
	}
}