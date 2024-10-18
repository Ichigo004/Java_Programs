package com.cdac.act.accountclass.common;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Dateformat {
 
	private static final String FORMAT = "dd/MM/yyyy";
	private static final String EMPTY = " ";
	
	private Dateformat()
	{
		
	}
	
	public String getDateFormat(Date date)
	{
		if(null == date)
		{
			return null;
		}
		
		SimpleDateFormat simple = new SimpleDateFormat(FORMAT);	
		String str = simple.format(date);
		return str;
	}
	
	public Date getStringDateFormat(String strdate) throws ParseException
	{
		if(null == strdate && EMPTY.equals(strdate))
		{
			return null;
		}
		
		SimpleDateFormat sdf = new SimpleDateFormat(FORMAT);
		Date date = sdf.parse(strdate);
		return date;
	}
	
}
