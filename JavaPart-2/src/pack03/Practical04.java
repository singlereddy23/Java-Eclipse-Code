package pack03;

public class Practical04
{

	public static void main(String[] args)
	{
		int arr[] = new int[5]; //arr is reference variable
		
		System.out.println("arr.length = " + arr.length);
		System.out.println("arr[0] = " + arr[0]);
		arr[0] = 11;
		arr[1] = 22;
		arr[2] = 33;
		arr[3] = 44;
		arr[4] = 55;
		System.out.println("arr[0] = " + arr[0]);
		
		//Second method to create an array
		int arr2[] = {11,22,33,44,55};
		
		//Third method to create an array
		int arr3[] = new int[] {11,22,33,44,55};
		
		//Fourth method to create an array
		int []arr4 = {11,22,33,44,55};
		int []arr5 = arr4;
		
		System.out.println("\n\n");
		for(int a : arr2) //Enhanced For Loop
		{
			System.out.println(a);
		}

	}

}
