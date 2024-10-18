package com.cdac.act.newfile;

import java.io.File;
import java.io.IOException;

public class CreateNewFile {

	public static void main(String[] args) {
			
		File file = new File("D:/advet.txt");
		
		try
		{
			if(!file.exists())
			{
				file.createNewFile();
			}
		}
		catch(IOException ex)
		{
			System.err.println(ex.getMessage());
		}
	}
}
