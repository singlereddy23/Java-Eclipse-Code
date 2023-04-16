package pack03;

public class Account
{

	@Override
	protected void finalize() throws Throwable
	{
		System.out.println("Garbage Collector Called");
		System.out.println("Object Garbage Collected : " + this);
	}
	
}
