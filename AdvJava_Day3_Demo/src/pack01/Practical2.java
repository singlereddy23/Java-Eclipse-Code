package pack01;

public class Practical2
{

	static void add(int a, int b)
	{	System.out.println("add()...");
	}
	
	static void calculate(int x, int ... arr)	//Var args
	{	System.out.println("calculate() : " + arr.length);
		int total=0;
		for(int num : arr)
		{	total = total + num;
		}
		System.out.println("Sum of " + arr.length + " numbers = " + total);
	}
	
	
	public static void main(String[] args)
	{	add(4, 5);
		//calculate();
		calculate(1,2,3);
		calculate(1,2,3,4,5,6);
	}

}
