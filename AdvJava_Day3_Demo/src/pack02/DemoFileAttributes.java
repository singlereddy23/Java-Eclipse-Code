package pack02;

import java.io.File;
import java.io.IOException;

public class DemoFileAttributes 
{
	public static void main(String[] args) throws IOException 
	{
		DemoFileAttributes obj = new DemoFileAttributes();
		obj.details();
		obj.getFiles();

	}

	void details() throws IOException 
	{
		File filename = new File("Message123.txt");
			
		if (filename.exists()) 
		{
			System.out.println("file exists");
		} 
		else 
		{
			System.out.println("file does not exists \n creating a new file ");
			filename.createNewFile();
		}
		System.out.println("Name of the File: " + filename.getName());
		System.out.println("Path of the File: " + filename.getPath());
		System.out.println("Parent Directory: " + filename.getParent());
		System.out.println("Size of the File: " + filename.length() + " Bytes");
	}

    void getFiles() 
    {
		File f1 = new File("C:/");
		File farray[] = f1.listFiles();
		for (File file : farray) 
		{
			System.out.println(file.getName());
		}

	}

}
