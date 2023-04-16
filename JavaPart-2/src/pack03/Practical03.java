package pack03;

import java.util.Scanner;

public class Practical03
{

	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter your Name : ");
		String name = keyboard.nextLine();
		
		System.out.print("Enter your Age : ");
		int age = Integer.parseInt( keyboard.nextLine() );
		
		System.out.print("Enter product Price : ");
		float price = Float.parseFloat( keyboard.nextLine() );
		
		System.out.print("Enter Speed : ");
		double speed = Double.parseDouble( keyboard.nextLine() );
		
		System.out.print("Enter any char : ");
		char ch = keyboard.nextLine().charAt(0);
		
		keyboard.close();
		
		
		
		System.out.println("You have entered your Name : " + name);
		System.out.println("You have entered your Age : " + (age + 2) );
		System.out.println("You have entered your Price : " + price );
		System.out.println("You have entered Speed : " + speed );
		System.out.println("You have entered char : " + ch );

	}

}
