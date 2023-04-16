package pack08;

import java.io.FileInputStream;

public class Practical07
{
	public static void main(String[] args) throws Exception
	{
		FileInputStream fin = new FileInputStream("Message.txt");
		int i;
		// read characters until EOF is encountered
		do
		{
			i = fin.read();

			if (i != -1)
			{
				System.out.print((char) i);
			}

		} while (i != -1);
		fin.close();
	}// end of main()
}
