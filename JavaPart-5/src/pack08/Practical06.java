package pack08;

import java.io.FileOutputStream;
import javax.swing.JOptionPane;

public class Practical06
{
	public static void main(String[] args) throws Exception
	{
		FileOutputStream fout = new FileOutputStream("Message.txt", true);
		
		String msg = null;
		System.out.println("Enter the text to save in the file:");
		do
		{
			msg = JOptionPane.showInputDialog("Enter the text to save in the file:\n ! to Exit");

			if (msg.equals("!"))
			{
				break;
			}

			msg = msg + "\n";
			fout.write(msg.getBytes());

		} while (true);

		fout.close();
		System.out.println("Data Saved In File Successfully by  using Byte oriented streams.");

	}// end of main()
	

}
 