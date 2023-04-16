package pack02;

public class Employee
{
	private String name;
	private int age;
	private float height;
	private float weight;
	
	@Override
	public boolean equals(Object obj)
	{	Employee e2 = (Employee)obj;
		boolean status = (this.age == e2.age);
		return status;
	}
	
	public Employee()
	{
	}

	public Employee(String name, int age, float height, float weight)
	{	this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}

	@Override
	public String toString()
	{	return "Employee [name=" + name + ", age=" + age + ", height=" + height + ", weight=" + weight + "]";
	}

	
	
	

}
