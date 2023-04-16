package pack06;

public class Practical04
{
	public static void main(String[] args)
	{
		// Annonymous Inner Child Class
		// Annonymous Inner Class
		
		Parent p1 = new Parent();
		p1.show();
		
		Parent p2 = new Parent() 
		{
			public void show()
			{	System.out.println("Fortuner");
			}
			
		};   //end of line
		
		p2.show();

	}//End of main()

}
