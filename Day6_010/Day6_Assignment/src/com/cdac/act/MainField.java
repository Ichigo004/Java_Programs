package com.cdac.act;
import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

import com.cdac.act.common.DateFormat;
public class MainField {

	
	public static Address getAddress(Scanner read)
	{
		System.out.println("Enter line 1");
		String line1 = read.nextLine();
		System.out.println("Enter line 2");
		String line2 = read.nextLine();
		System.out.println("Enter Landmark");
		String lanmark = read.nextLine();
		System.out.println("Enter Pincode");
		int  pin = read.nextInt();
		
		Address address = new Address(line1, line2, lanmark, pin);
		return address;
	}
	
	
	
	private static final String FIXDATE = "15/08/1947"; 
	
	public static void main(String[] args) throws ParseException {
		
		Scanner read = new Scanner(System.in);
		
		System.out.println("Enter the name of Person");
		String name = read.nextLine();
		System.out.println("Enter the Addhar number of a Person");
		String aadharno = read.nextLine();
		System.out.println("Enter Date of Birth in this format dd/MM/yyy");
		String date = read.nextLine();
		Date dob = DateFormat.getData(date);
		
		Address address = getAddress(read);
		
		Person person = new Person(name, aadharno, date, address);
		
		
		
		System.out.println(person);
		read.close();
		
	}
}
