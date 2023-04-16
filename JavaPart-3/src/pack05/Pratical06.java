package pack05;

import javax.swing.JOptionPane;

public class Pratical06
{
	void calc(int a, int b) throws Exception
	{
		System.out.println("Calculation Started");
		
		int res = a / b;
		System.out.println("Calculation Completed Successfully");
		System.out.println("Result = " + res);
	}
	
	public static void main(String...args)   //throws Exception
	{
		System.out.println("Program Started");
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Enter Num1") );
		
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("Enter Num2") );
		
		System.out.println("Input Data Received");
		
		Pratical06 obj = new Pratical06();
		try
		{	obj.calc(num1, num2);
		}
		catch(Exception e)
		{	System.out.println("Invalid Input...Retry...");
		}
		System.out.println("Program Completed");
		
	}//end of main()
	
}//end of class Pratical06
