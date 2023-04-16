package pack01;

public class Practical01 
{

	public static void main(String[] args) 
	{
		Student p1 = new Student();
		//System.out.println(p1.roll);
		System.out.println( p1.getRoll() );
		System.out.println( p1.getName() );
		
		System.out.println("--------------------");
		Student p2 = new Student(584, "kamal");
		//System.out.println(p2.roll);
		System.out.println( p2.getRoll() );
		System.out.println( p2.getName() );
		
		System.out.println("--------------------");
		p1.setRoll(23);
		p1.setName("Reddy");
		System.out.println( p1.getRoll() );
		System.out.println( p1.getName() );

	}

}
