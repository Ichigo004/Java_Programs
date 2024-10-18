package com.cdac.validations;

import java.time.LocalDate;
import java.text.ParseException;

public class DateValidate {
	
	public static LocalDate getdate(String str)throws ParseException
	{
		LocalDate date = LocalDate.parse(str);
		
		LocalDate todayDate = LocalDate.now();
		
		return date;
	}
}
