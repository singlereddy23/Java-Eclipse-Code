package pack07;

public class Calculator
{
	void add(int a, int b) throws InvalidCalculationException
	{
		if(a<100 || b<100)
		{	InvalidCalculationException icex = new InvalidCalculationException("Invalid Adition Calculation");
			throw icex;
		}
		int res = a + b;
		System.out.println("Aditional result = " + res);
	}//add()
	
	void sub(int a, int b) throws InvalidCalculationException
	{
		if(a<100 || b<100)
		{	InvalidCalculationException icex = new InvalidCalculationException();
			throw icex;
		}
		int res = a - b;
		System.out.println("Subraction result = " + res);
	}//sub()
	
	void div(int a, int b) throws InvalidCalculationException
	{
		if(a<100)
		{	InvalidCalculationException icex = new InvalidCalculationException();
			throw icex;
		}
		try
		{
			if(b == 0)
			{	ArithmeticException aex = new ArithmeticException();
				throw aex;
			}
		}
		catch(ArithmeticException e)
		{
			System.out.println("Invalid value for b");
		}
		
	}
}
