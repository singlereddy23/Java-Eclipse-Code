package pack08;

public class Payment
{
	public void pay(String password) throws InvalidPasswordException
	{
		if(password.length() < 6)
		{	
			InvalidPasswordException passEx = new InvalidPasswordException();
			throw passEx;
		}
		
		System.out.println("Payment Successfull...");
	}
	
}
