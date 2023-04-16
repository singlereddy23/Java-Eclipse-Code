package pack07;

import javax.swing.JOptionPane;

public class Pratical08
{

	public static void main(String[] args)
	{
		String nm = JOptionPane.showInputDialog("Enter Name");
		
		int ag = Integer.parseInt(JOptionPane.showInputDialog("Enter Age") );
		
		Customer cust = new Customer();
		try 
		{	cust.createAccount(nm, ag);	
		}
		catch(InvalidAgeException exc)
		{	System.out.println( exc.getMessage() );
			System.out.println( exc );	
		}
		System.out.println("Program Completed Successfully");
	}

}
