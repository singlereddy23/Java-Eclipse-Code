package pack08;

import java.io.FileWriter;

import javax.swing.JOptionPane;

public class Practical08
{
	public static void main(String[] args) throws Exception
	{
		FileWriter fw = new FileWriter("Message.txt", true);
		
		String s = JOptionPane.showInputDialog("Enter Any Message ");
		s = s + "\n";

		fw.write(s);
		fw.close();
		System.out.println("Data saved successfully.");

	}// end of main()
}
