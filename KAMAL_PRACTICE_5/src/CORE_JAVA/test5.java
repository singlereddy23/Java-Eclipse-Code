package CORE_JAVA;

public class test5	//METHODS
//Method is a block of code which only runs when it is called.
//Define the code once, and re-use it many times.
{
	public int display(int a, int b)
	{	return a+b;
	}
	
	public double display(double a, double b)
	{	return a+b;
	}

	public static void main(String[] args)
	{
		test5 t = new test5();
		
		int result = t.display(100, 80);
		double result1 = t.display(100.0, 80.0);
		
		System.out.println(result);
		System.out.println(result1);
	}
}