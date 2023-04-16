package pack10;

public class Practical12
{

	public static void main(String[] args)
	{
		for(int num=1; num<=10; num++)
		{
			System.out.println("Value of num = " + num);
			try
			{	Thread.sleep(1000);
			}
			catch(Exception ex)
			{
			}
		}//end of for loop

	}

}
