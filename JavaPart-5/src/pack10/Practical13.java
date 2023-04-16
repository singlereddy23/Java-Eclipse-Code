package pack10;

class DemoChar //It will use indirect start method
{
	public void run() //Here we are overriding the run method
	{
		for(char alpha='A'; alpha<='K'; alpha++)
		{
			System.out.println("Alphabet = " + alpha);
			try
			{	Thread.sleep(1000); //1000 millisecond = 1 second
			}
			catch(Exception e)
			{
			}
		}
	}
}

//-----------------------------------------------------------------

class DemoNum //It will use direct start method
{
	public void run()
	{
		for(int i=1; i<=10; i++)
		{
			System.out.println("Number = " + i);
			try
			{	Thread.sleep(1000); //1000 millisecond = 1 second
			}
			catch(Exception e)
			{
			}
		}
	}//end of run()
}

//-----------------------------------------------------------------

public class Practical13   //Sequential Execution 
{

	public static void main(String[] args)
	{
		DemoChar th1 = new DemoChar();
		DemoNum th2 = new DemoNum();
		
		th1.run(); //for Alphabets
		
		//----------------------------
		
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
		
		//----------------------------
		
		th2.run(); //for Numbers

	}//end of main()

}
