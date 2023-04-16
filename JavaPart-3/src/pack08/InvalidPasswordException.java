package pack08;

public class InvalidPasswordException extends Exception
{
	private String msg;

	public InvalidPasswordException()
	{	msg = "Passeord is Invalid for Payment";
	}

	public InvalidPasswordException(String msg)
	{	this.msg = msg;
	}

	@Override
	public String getMessage()
	{	return msg;
	}
	
	
	
}
