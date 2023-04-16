package pack07;

public class Customer
{
	String name;
	int age;
	
	public void createAccount(String n,int a) throws InvalidAgeException
	{	
		if(a < 18)
		{	InvalidAgeException iaex = new InvalidAgeException();
			throw iaex;
		}
		
		name = n;
		age = a;
		System.out.println("Record saved Successfully for" + name);
	}
}
