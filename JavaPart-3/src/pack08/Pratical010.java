package pack08;

import javax.swing.JOptionPane;

public class Pratical010
{

	public static void main(String[] args)
	{
		String pwd = JOptionPane.showInputDialog("Enter Password");
		
		Payment payment = new Payment();
		
		try
		{	payment.pay(pwd);
		} 
		catch (InvalidPasswordException e)
		{	System.err.println(e);
		}

	}//End of main

}
