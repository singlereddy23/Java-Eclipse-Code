package pack01;

class Parent
{
	void car()
	{System.out.println("Alto car of Parent");
	}
	void radio()
	{System.out.println("Radio of Parent");
	}
}//end of Parent class

class Child extends Parent
{
	void car()
	{System.out.println("Fortuner car of Child");
	}
	void mobile()
	{System.out.println("Mobile of Child");
	}
}//end of Child class



public class Pratical01
{

	public static void main(String[] args)
	{
		//Rule 1: Only Parent Members sre Accessible
		Parent p1 = new Parent();
		p1.radio();
		p1.car();
		//p1.mobile();   //Itbelong to Child.so its Error
		
		
		//Rule 2:
		Child ch1 = new Child();
		ch1.radio();   //Display of Parent
		ch1.mobile();   //Message for Child
		ch1.car();   //Show of child(due to Method overriding)
		
		
		//Rule 3:
		Parent p2 = new Child(); //Allowed in java
		p2.radio();
		p2.car();  //Show of child (due to Method overriding)
		//p2.mobile(); //Error, become Parent is unaware
		
		Child ch2 = (Child) p2;
		ch2.mobile();
		
	}   //end of main()

}
