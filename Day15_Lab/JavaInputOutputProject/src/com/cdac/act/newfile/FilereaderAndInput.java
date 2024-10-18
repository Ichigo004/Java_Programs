package com.cdac.act.newfile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FilereaderAndInput {
	
	public static void main(String[] args) throws IOException {
		
	File file = new File("D:/advet.txt");
	
	FileReader reader = new FileReader(file);
	
	BufferedReader buffreader = new BufferedReader(reader);
	
	
	System.out.println(buffreader.readLine());
	
	buffreader.close();
	
	}
}
