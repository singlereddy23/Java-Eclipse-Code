package CORE_JAVA;

public class test4
{
	public static void main(String[] args)
	{
		//for loop syntax: for(Variable Initialization; Condition; Increment/Decrement){ code block to execute }
		for(int i=1;i<=5;i=i+1) 
		{ 
			System.out.println(i); 
		}
		
		System.out.println("--------");
		
		int num = 1;
		while (num<=10)	//while loop syntax: while(condition) { code block to execute }
		{
			System.out.println(num);
			num = num+1;
		}
	}
}