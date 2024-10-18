package com.cdac.act.newfile;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

@SuppressWarnings("unused")
public class FilewriterAndInput {

	public static void main(String[] args) throws IOException {

		File file = new File("D:/advet.txt");
		
		FileWriter write = new FileWriter(file);
		BufferedWriter bwriter = new BufferedWriter(write);
		
		bwriter.write("Hello dear java ");
		System.out.println("done");
		
		bwriter.close();
		
		
		
	}
}
