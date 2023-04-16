package Pack1;

public class test4
{
	public static void main(String[] args)
	{
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