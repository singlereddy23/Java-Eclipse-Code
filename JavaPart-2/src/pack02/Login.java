package pack02;

public class Login
{
	
	private String id;
	private String password;
	
	
	
	public Login() //Constructor
	{
	}

	
	
	public String getId()
	{ return id;
	}

	public void setId(String id)
	{ this.id = id;
	}

	public String getPassword()
	{ return password;
	}

	public void setPassword(String password)
	{ this.password = password;
	}

	
	
	@Override
	public String toString()
	{
		return "Login [user id = " + id + ", password = " + password + "]";
	}

	
	
	public void display()
	{
		System.out.println( "user id = " + id );
		System.out.println( "password = " + password );
	}
	
	
}
