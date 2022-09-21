package corejava.fileHandling;

import java.io.File;

public class FileCreation
{
	public static void main(String[] args)
	{
		try 
		{
			File f = new File("C:\\Users\\hp\\Desktop\\Teja.txt");
			if(f.createNewFile())
			{
				System.out.println("File Create Successfully");
			}
			else
			{
				System.out.println("File Already Exist");
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
}
