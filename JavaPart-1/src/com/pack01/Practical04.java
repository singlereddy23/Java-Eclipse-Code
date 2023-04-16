package com.pack01;


class PersonalDetails
{
	String name;
	int age;
	String PhoneNumber;
};


class Demo
{
	int a;
	static int b;
}
//Only one class can be declared as public
public class Practical04 
{
	public static void main(String[] args) 
	{
		System.out.println("Kamal java code is working...");
		
		Demo.b = 30;
		System.out.println("Demo.b = " + Demo.b);
		
		Demo p1 = new Demo();
		p1.a = 5;
		System.out.println("p1.b = " + p1.b);
		
		Demo p2 = new Demo();
		p2.a = 7;
		System.out.println("p2.b = " + p2.b);
		
		Demo p3;
		p3 = p2;
		p3.a = 20;
		
		System.out.println("p3.a = " + p3.a);
		System.out.println("p2.a = " + p2.a);
		

	}

}
