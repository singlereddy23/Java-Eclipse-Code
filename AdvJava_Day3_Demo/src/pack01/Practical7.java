package pack01;

import java.io.*;

class Employee implements Serializable
{
	String ename;
	String eadd;
        int eid;
        
	Employee(String ename, String eadd, int eid)
	{
		this.ename = ename;
		this.eadd  = eadd;
		this.eid   = eid;
	}
}

public class Practical7
{
	public static void main(String []ar)
	{
		try
		{
			FileOutputStream fos   = new FileOutputStream("emp.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			Employee e1 = new Employee("ALOK","VARANASI",10002);
			oos.writeObject(e1);
			//oos.flush();

			Employee e2 = new Employee("HRIDAY","FAIZABAD",10001);
			oos.writeObject(e2);
			//oos.flush();

			Employee e3 = new Employee("ISHU","DELHI",10003);
			oos.writeObject(e3);
			//oos.flush();

			Employee e4 = new Employee("MANISH","PATNA",10004);				
			oos.writeObject(e4);
			//oos.flush();
			oos.close();
            fos.close();
            
            FileInputStream fis   = new FileInputStream("emp.txt");
        	ObjectInputStream ois = new ObjectInputStream(fis);
        				
        	//Object e4=ois.readObject();
            
        	Employee emp = null;
        	while( true )
        	{
        		try 
        		{	emp = (Employee)ois.readObject();
        		} 
        		catch (EOFException e) 
        		{	break;
        		}

              	System.out.print(emp.ename+" ");
        		System.out.print(emp.eadd+" ");
        		System.out.println(emp.eid+" ");
        	}
        	System.out.println("All Data printed.");
        }	
        catch(Exception e)
        {	e.printStackTrace();
        }

	}//end of main()
}
