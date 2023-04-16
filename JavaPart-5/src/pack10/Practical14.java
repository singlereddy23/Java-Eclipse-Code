package pack10;

class DemoChara implements Runnable  //It will use indirect start method
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

class DemoNumb extends Thread   //It will use derect start method
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

public class Practical14   //MultiThreading
{

	public static void main(String[] args)
	{
		DemoChara th1 = new DemoChara();   //Its type is Runnable
		DemoNumb th2 = new DemoNumb();
		
		//th1.start(); //for Alphabets
		Thread t = new Thread(th1);
		t.start();
		//----------------------------
		
		//----------------------------
		th2.start(); //for Numbers

	}//end of main()

}