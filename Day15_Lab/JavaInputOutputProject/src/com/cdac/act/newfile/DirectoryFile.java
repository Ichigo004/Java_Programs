package com.cdac.act.newfile;

import java.io.File;

public class DirectoryFile {
	
	public static void main(String[] args) {
		
		File file = new File("C:\\Program Files") ;
		
		if(file.isDirectory())
		{
			System.out.println("It is directory");
			
			String [] arr = file.list();
			
			for(String s : arr )
			{
				System.out.println(s);
			}
		}
	}
}
