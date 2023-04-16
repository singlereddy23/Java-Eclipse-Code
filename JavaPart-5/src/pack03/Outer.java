package pack03;

public class Outer
{
	int num = 50;
	
	class Inner   //1.Regular Inner Class
	{
		public void show()
		{
			System.out.println("Hello for Inner Show");
			System.out.println("num = " + num);
		}
	}
	
}
