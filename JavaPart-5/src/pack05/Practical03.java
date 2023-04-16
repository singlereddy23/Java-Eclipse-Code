package pack05;

public class Practical03
{
	public static void main(String[] args)
	{
		int localNum = 5;
		
		//localNum = 6; Editing not Allowed if it is used inside local Inner class
		
		class Inner   ////3.local Inner Class
		{
			public void show()
			{
				System.out.println("Hello for Inner Show");
				System.out.println("localNum = " + localNum);
			}
		}//End of class Inner
		
		Inner inner = new Inner();
		inner.show();
		
	}//End of main()
}
