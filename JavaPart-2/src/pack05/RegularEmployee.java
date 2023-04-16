package pack05;

import java.util.Date;

public class RegularEmployee extends Employee
{
		double salary;

		public RegularEmployee(int employeeId, String firstName, String lastName, String email, String phoneNumber,
				Date hireDate, float commissionPerct, double salary)
		{
			super(employeeId, firstName, lastName, email, phoneNumber, hireDate, commissionPerct);
			this.salary = salary;
		}

		
		
}
