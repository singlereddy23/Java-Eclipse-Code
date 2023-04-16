package pack01;

public class Student
{
	private int roll;
	private String name;
	
	public void setRoll(int roll)
	{ this.roll = roll;
	}

	public void setName(String name)
	{ this.name = name;
	}

	public int getRoll()
	{ return roll;
	}

	public String getName()
	{ return name;
	}

	
	
	public Student()
	{
	}

	public Student(int roll, String name)
	{
		this.roll = roll;
		this.name = name;
	}
	
}//end of class student
