package pack09;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Practical11
{

	public static void main(String[] args) throws Exception
	{
		try
		{
			ObjectInputStream o = new ObjectInputStream(new FileInputStream("test.txt"));
	
			System.out.println("****Deserailaized objects*****");
			Employee emp;
			while ((emp = (Employee) o.readObject()) != null)
			{
				System.out.println(emp);
			}
		}
		catch(Exception e)
		{
			
		}

	}//end of main()

}