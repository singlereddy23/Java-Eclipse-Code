package pack02;

public class Practical02
{

	public static void main(String[] args)
	{
		
		Login user1 = new Login();
		user1.setId("USER1");
		user1.setPassword("pass123");
		
		Login user2 = new Login();
		user2.setId("USER2");
		user2.setPassword("pass456");
		
		
		
		System.out.println("First Method of printing the Details: using getters()");
		System.out.println("Login Account Details of user1");
		System.out.println( "user id = " + user1.getId() );
		System.out.println( "password = " + user1.getPassword() );
		
		System.out.println("\n\nLogin Account Details of User2");
		System.out.println( user2.getId() );
		System.out.println( user2.getPassword() );
		
		
		
		System.out.println("\n\nSecond Method of printing the Details: use of toString() of Login Bean");
		System.out.println("Login Account Details of user1");
		System.out.println( user1.toString() );
		System.out.println( user1 );
		
		System.out.println("\n\nLogin Account Details of User2");
		System.out.println( user2.toString() );
		System.out.println( user2 );
		
		
		
		System.out.println("\n\nThird Method of printing the Details: use of Custome Method");
		System.out.println("Login Account Details of user1");
		user1.display();
		
		System.out.println("\n\nLogin Account Details of User2");
		user2.display();
		
	}

}
