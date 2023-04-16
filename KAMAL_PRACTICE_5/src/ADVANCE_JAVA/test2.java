package ADVANCE_JAVA;

public class test2
{
	public static void main(String[] args)
	{
		test1 s1 = new test1();
		s1.setRollno(23);
		s1.setName("KAMAL");
		s1.setAddress("TIRUPATI");
		
		System.out.println("ROLL NO: "+s1.getRollno()+"\t"+"NAME: "+s1.getName()+"\t"+"ADDRESS: "+s1.getAddress());
	}
}