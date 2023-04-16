package Test;

public class test1
{
	
	public int adition(int a, int b)
	{	return(a+b);
	}
	
	public double adition(double a, double b)
	{	return(a+b);
	}
	
	public static void main(String[] args)
	{
		test1 add = new test1();
		
		int add1 = add.adition(10, 20);
		double add2 = add.adition(10, 20);
		
		System.out.println(add1);
		System.out.println(add2);
	}
}