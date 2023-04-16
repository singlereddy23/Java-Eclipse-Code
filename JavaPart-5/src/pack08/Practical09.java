package pack08;

import java.io.BufferedReader;
import java.io.FileReader;

public class Practical09
{
	public static void main(String[] args) throws Exception
	{
		FileReader fr = new FileReader("Message.txt");
		BufferedReader br = new BufferedReader(fr);
		String s;

		while ( (s = br.readLine() ) != null)
		{
			System.out.println(s);
		}

		fr.close();
	}
}
