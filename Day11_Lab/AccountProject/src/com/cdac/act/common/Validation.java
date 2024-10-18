package com.cdac.act.common;

import java.time.LocalDate;

public class Validation {
	
	public static LocalDate validateDate(String date)
	{
		LocalDate doo = LocalDate.parse(date);
		
		LocalDate localDate = LocalDate.now();
		
		if(doo.isAfter(localDate))
		{
			return null;
		}
		return doo;
	}
	
	public static Double validateBalance(Double bal)
	{
		if(bal < 1000)
		{
			return null;
		}
		return bal;
	}
}
