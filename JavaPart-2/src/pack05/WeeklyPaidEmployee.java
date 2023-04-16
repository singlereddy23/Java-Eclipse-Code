package pack05;

import java.util.Date;

public class WeeklyPaidEmployee extends Employee
{

	double wagesPerWeek;
	
	public WeeklyPaidEmployee(int employeeId, String firstName, String lastName, String email, String phoneNumber,
			Date hireDate, float commissionPerct, double wagesPerWeek)
	{
		super(employeeId, firstName, lastName, email, phoneNumber, hireDate, commissionPerct);
		this.wagesPerWeek = wagesPerWeek;
	}

	
	public void printDetails()
	{
		System.out.println("*****Weekly Paid Employee Details*****");
		System.out.println(employeeId + "\t" + firstName + "\t" + lastName + "\t" + email + "\t" + wagesPerWeek);
		
	}

}
