package pack01;

import java.io.BufferedReader;
import java.io.Console;
import java.io.InputStreamReader;

public class Practical1
{

	public static void main(String[] args) throws Exception
	{
		System.out.println(args[3]);
		System.out.println("Total no of arguments :" + args.length);
		
		System.out.println("Program started...");
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		System.out.println("Enter Name : ");
		String name = br.readLine();
		
		Console keyboard = System.console();
		System.out.println("Enter LoginID : ");
		String loginid = keyboard.readLine();
		
		System.out.println("Enter Password : ");
		String password = new String( keyboard.readPassword() );
		
		System.out.println("YOUR LOGIN ID :" + loginid);
		System.out.println("YOUR PASSWORD :" + password);
		
	}
}
