package pack07;

public class InvalidCalculationException extends Exception   //Its checked Exception
{
	String msg;
	
	public InvalidCalculationException()
	{ msg = "Invalid Calculation in program";
	}

	public InvalidCalculationException(String msg)
	{	this.msg = msg;
	}

	@Override
	public String getMessage()
	{	return msg;
	}
	
	
	
	
}
