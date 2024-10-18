package com.cdac.act.validation;

import java.text.ParseException;
import java.time.LocalDate;

import com.cdac.act.exceptions.FutureDateException;

public class ValidateUtils {
	
	public static LocalDate getdate(String str)throws ParseException
	{
		LocalDate date = LocalDate.parse(str);
		
		LocalDate today = LocalDate.now();
		
		try
		{
			if(date.isAfter(today))
			{
				throw new FutureDateException("Date cannot be Future");
			}
		}
		catch(FutureDateException f)
		{
			f.printStackTrace();
			
		}
		return date;
	}
}
