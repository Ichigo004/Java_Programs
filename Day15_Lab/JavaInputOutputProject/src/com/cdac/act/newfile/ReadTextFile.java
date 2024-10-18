package com.cdac.act.newfile;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadTextFile {

	public static void main(String[] args) throws IOException {

		
		File file = new File("D:/advet.txt");
		File file1 = new File("D:/advet2file.txt");
		
		if(!file.exists())
		{
			file.createNewFile();
		}
		if(!file1.exists())
		{
			file1.createNewFile();
		}
		
		
		FileReader reader = new FileReader(file);
		
		BufferedReader buffreader = new BufferedReader(reader);
		
		FileWriter writer = new FileWriter(file1);
		
		BufferedWriter bwriter = new BufferedWriter(writer);
		bwriter.write(buffreader.readLine());
		System.out.println("done");
		buffreader.close();
		bwriter.close();
		
	}
}
