package demo1;

public class test2
{
	public static void main(String[] args)
	{
		test1 stu1 = new test1();
		stu1.Name = "KAMAL";
		stu1.Rollno= 23;
		stu1.Address= "tIRUPATI";
		System.out.println(stu1.getRollno());
		System.out.println(stu1.getName());
		System.out.println(stu1.getAddress());
		
		test1 stu2 = new test1(56, "Sai", "Bng");
		System.out.println(stu2.toString());
		
		test1 stu3 = new test1(98, "Lochan", "Hyd");
		stu3.Display();
		
	}
}