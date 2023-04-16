package pack02;

abstract class IITKCalculator implements Calculator
{
	public void add(int a, int b)   //Method Overriding
	{	int r = a + b;
		System.out.println("Result = " + r);
	}
}
