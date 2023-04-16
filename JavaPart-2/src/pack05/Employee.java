package pack05;

import java.util.Date;

public class Employee
{
	
	int employeeId;
	String firstName;
	String lastName;
	String email;
	String phoneNumber;
	Date hireDate;
	float commissionPerct;
	
	
	public Employee(int employeeId, String firstName, String lastName, String email, String phoneNumber, Date hireDate,
			float commissionPerct)
	{
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.hireDate = hireDate;
		this.commissionPerct = commissionPerct;
	}
	
	
}
