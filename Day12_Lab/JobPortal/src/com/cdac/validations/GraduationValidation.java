package com.cdac.validations;

import java.text.ParseException;
import java.time.LocalDate;

import com.cdac.exceptions.PastDateException;

public class GraduationValidation {

	public static LocalDate getgraduatedate(String str)throws ParseException
	{
		LocalDate date = LocalDate.parse(str);
		LocalDate newdate = LocalDate.now().minusYears(21);
		
		try
		{
			if(date.isBefore(newdate))
			{
				throw new PastDateException("Date should be past date");
			}
		}
		catch(PastDateException p)
		{
			p.printStackTrace();
			System.out.println(p.getLocalizedMessage());
		}
		return date;
	}
}
