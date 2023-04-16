package Pack1;

public class test5
{
	public static void main(String[] args)
	{
		test1 s1 = new test1();
		s1.rollno=1;
		s1.name="kamal";
		s1.phoneno=23091997;
		s1.address="Tirupati";
		
		System.out.println(s1.toString());
		
		
		System.out.println("-------------------------");
		
		
		test1 s2 = new test1(2, "Sai", 1111997, "Bangalore");
		
		s2.Display();
		
		
		System.out.println("-------------------------");

		
		test1 s3 = new test1();
		s3.setRollno(3);
		s3.setName("Lochan");
		s3.setPhoneno(21122010);
		s3.setAddress("Hyderbad");
		
		System.out.println("Rollno  : "+s3.getRollno());
		System.out.println("Name    : "+s3.getName());
		System.out.println("Phoneno : "+s3.getPhoneno());
		System.out.println("Address : "+s3.getAddress());
	}
}