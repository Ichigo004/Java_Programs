package com.cdac.act.classes;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.HashMap;
import java.util.Map;

public class FileUtils {

	public static Map<String , Printer> readfile(String filename) throws ClassNotFoundException
	{
		Map<String , Printer> printermap = new HashMap<>();


		try (ObjectInputStream ois = new ObjectInputStream(
				new FileInputStream(filename))) 
		{
			
			Printer printer = (Printer) ois.readObject();
			
			System.out.println("Loaded printers from file.");
			
		} 
		catch (IOException  e) {
			e.printStackTrace();
		}
		return null;
	}
}
