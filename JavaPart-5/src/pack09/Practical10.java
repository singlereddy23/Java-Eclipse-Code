package pack09;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Practical10
{
	public static void main(String[] args) throws Exception
	{
		Employee E1 = new Employee("Kamal",  1, 21);
		Employee E2 = new Employee("Sai", 2, 23);

		ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream("test.txt"));
		o.writeObject(E1);
		o.writeObject(E2);
		System.out.println("****Serailaized objects*****");
		System.out.println(E1);
		System.out.println(E2);
		o.flush();
		o.close();
		
	}// end of main()
}