package pack01;

public class Emp implements Cloneable   //Marker Interface
{
	private String name;

	public Emp(String name)
	{	this.name = name;
		System.out.println("Constructor is Working...");
	}

	@Override
	protected Object clone() throws CloneNotSupportedException
	{	return super.clone();
	}
	
	@Override
	public String toString()
	{	return "Emp [name = " + name +"]";
	}

	public String getName()
	{	return name;
	}

	public void setName(String name)
	{	this.name = name;
	}
	
	
	

}
