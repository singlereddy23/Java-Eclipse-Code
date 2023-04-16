package pack04;

public class Outer
{
	static int num = 50;
	
	static class Inner   //2.static Inner Class
	{
		public void show()
		{
			System.out.println("Hello for Inner Show");
			System.out.println("num = " + num);
		}
	}
	
}
