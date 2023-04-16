package pack07;

public class InvalidTransactionException extends Exception
{
	private String msg;

	public InvalidTransactionException()
	{	msg = "Invalid Transaction during the withdrawl for ATM";
	}

	public InvalidTransactionException(String msg)
	{	this.msg = msg;
	}

	@Override
	public String getMessage()
	{	return "getMessage = " + msg;
	}

	@Override
	public String toString()
	{	return "toString = " + msg;
	}
	
}
