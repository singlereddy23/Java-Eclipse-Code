package pack07;

public class InvalidAgeException extends Exception
{
	private String msg;

	public InvalidAgeException()
	{	msg = "You age is not valid for current account";
	}

	public InvalidAgeException(String msg)
	{	this.msg = msg;
	}

	@Override
	public String getMessage()
	{	return msg;
	}
	
}
