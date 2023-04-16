package pack03;

public class Practical13
{

	public static void main(String[] args)
	{
		Account account1 = new Account();
		Account account2 = new Account();
		
		//Nullifying the referance variable
		account1 = null;
		
		//Requesting JVM for running Garbage Collector
		System.gc();
		
		//Nullifying the referance variable
		account2 = null;
		
		//Requesting JVM for running Garbage Collector
		Runtime.getRuntime().gc();
		
		System.out.println("Main() Completed...");
		
	}//end of main()

}
