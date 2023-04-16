package pack02;

public class Practical12
{

	public static void main(String[] args)
	{
		Employee employee1 = new Employee("Kamal", 23, 160, 85);
		Employee employee2 = new Employee("Sai", 23, 170, 64);
		Employee employee3 = new Employee("Vastal", 28, 170, 54);

		if( employee1.equals(employee2) )
		{	System.out.println("Age of employee1 & employee2 are same");
		}
		else
		{	System.out.println("Age of employee1 & employee2 are NOT same");
		}
		
		if( employee1 == employee2 )
		{	System.out.println("employee1 & employee2 are having same objects");
		}
		else
		{	System.out.println("employee1 & employee2 are NOT having same objects");
		}
		
	}

}
