package pack01;

public class Practical11
{

	public static void main(String[] args) throws Exception
	{
		Emp e1 = new Emp("India");
		System.out.println(e1);
		
		Emp e2 = (Emp) e1.clone();
		System.out.println("*********************");
		System.out.println("e2 = " + e2);
		e2.setName("KAMAL");
		
		System.out.println("*********************");
		System.out.println("e1 = " + e1);
		System.out.println("e2 = " + e2);

	}

}
