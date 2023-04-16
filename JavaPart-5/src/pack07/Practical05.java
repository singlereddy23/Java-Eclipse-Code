package pack07;

public class Practical05
{

	public static void main(String[] args)
	{
		//Rule-1: new keyword can't be used with Interface
		//IParent p1 = new IParent();
		
		//Rule-2: Annonymous class can be created from Interface
		IParent p1 = new IParent()
		{
			public void show()
			{	System.out.println("Fortuner");
			}
		};//end of line

		p1.show();
		
	}//end of main

}
