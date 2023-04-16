package pack05;

import javax.swing.JOptionPane;

public class Pratical04
{
	public static void main(String[] args)
	{
		System.out.println("Program Started");
		
		int num1 = Integer.parseInt( JOptionPane.showInputDialog("Enter Num1") );
		
		int num2 = Integer.parseInt( JOptionPane.showInputDialog("Enter Num2") );
		
		System.out.println("All Input Data Received");
		
		System.out.println("Calculation Started");
		
		int res = num1 / num2;
		System.out.println("Calculation Completed Successfully");
		System.out.println("Result = " + res);
		
		System.out.println("Program Completed till end Successfully");
	}
	
}