package pack05;

import javax.swing.JOptionPane;

public class Pratical05
{
	public static void main(String[] args)
	{
		System.out.println("Program Started");
		
		int num1 = Integer.parseInt( JOptionPane.showInputDialog("Enter Num1") );
		
		int num2 = Integer.parseInt( JOptionPane.showInputDialog("Enter Num2") );
		
		System.out.println("All Input Data Received");
		
		System.out.println("Calculation Started");
		
		try
		{	int res = num1 / num2;
			System.out.println("Calculation Completed Successfully");
			System.out.println("Result = " + res);
		}
		
		catch(Exception e)
		{	System.out.println("Invalid Input...Please Retry");
		}
		
		finally
		{	System.out.println("This is finally block");
			System.out.println("It will run every time");
		}
		
		System.out.println("Program Completed till end Successfully");
	}

}
