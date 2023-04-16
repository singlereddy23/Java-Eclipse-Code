package CORE_JAVA;

public class test2	//if, if else, else if Statement
{
	public static void main(String[] args)
	{
		double percentage = 73.5;
		
		if(percentage>=75) {
			System.out.println("DISTINCTION: " + percentage);
		}
		else if (percentage>=55) {
			System.out.println("FIRST CLASS: " + percentage);
		}
		else if (percentage>=35) {
			System.out.println("SECOND CLASS: " + percentage);
		}
		else {
			System.out.println("FAIL: " + percentage);
		}
	}
}