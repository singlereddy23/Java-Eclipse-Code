package pack07;

import javax.swing.JOptionPane;

public class Pratical09
{
	public static void main(String[] args)
	{
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("First Num") );
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("Second Num") );
		
		Calculator calculator = new Calculator();
		
		try 
		{	calculator.add(num1, num2);
		}
		catch(InvalidCalculationException e)
		{	e.printStackTrace();
		}
		
		try 
		{	calculator.sub(num1, num2);
		}
		catch(InvalidCalculationException e)
		{	e.printStackTrace();
		}
		
	}

}
