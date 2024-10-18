package com.cdac.validations;

import java.time.LocalDate;

import com.cdac.exceptions.FutureDateException;

public class DOBValidation {
	
	public static LocalDate getdobdate(String str)
	{
		LocalDate date = LocalDate.parse(str);
		LocalDate newdate = LocalDate.now().minusYears(21);
		
		try
		{
			if(date.isAfter(newdate))
			{
				throw new FutureDateException("fututre date not allowed");
			}
		}
		catch(FutureDateException f)
		{
			f.printStackTrace();
			System.out.println(f.getLocalizedMessage());
		}
		return date;
	}
}
