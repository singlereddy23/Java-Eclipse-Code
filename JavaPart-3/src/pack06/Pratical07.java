package pack06;

class Demo
{
	int data;
}

public class Pratical07
{

	public static void main(String[] args)
	{
		System.out.println("Main---1");
		//Arithmetic Exception;
		int result = 6 / 2;
		
		System.out.println("Main---2");
		//Null Pointer Exception;
		Demo p1 = new Demo();
		p1.data = 5;
		
		System.out.println("Main---3");
		//Array Index Out Of Bounds Exception;
		int []arr = new int[] {11,22,33,44,55};
		System.out.println(arr[1]);
		
		System.out.println("Main---4");
		String str = "India";
		int num = Integer.parseInt(str);
		
		System.out.println("Main---5");

	}

}
