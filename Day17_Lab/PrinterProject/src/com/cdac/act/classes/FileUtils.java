package com.cdac.act.classes;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;

public interface FileUtils {

	@SuppressWarnings("unchecked")
	public static Map<String, Printer>  readFile(String fileName) throws FileNotFoundException, IOException, ClassNotFoundException {

		Map<String , Printer> printermap = new HashMap<>();

		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName)))
		{
			Printer printer = (Printer)ois.readObject();
			printermap.put(printer.getSerialNo(), printer);
			printermap.forEach((k , v )-> System.out.println("key:" + k + "value"+v));
		}
		catch(EOFException eo)
		{
			System.out.println("Stop print");
		}
		return null;
	}
	
	public static void writeFile(Map<String, Printer> printmap, String filename) throws FileNotFoundException, IOException
	{
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream (filename)))
		{
			oos.writeObject(printmap);;
		}
	}
}
