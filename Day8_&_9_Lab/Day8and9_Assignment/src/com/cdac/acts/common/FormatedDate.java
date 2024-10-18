package com.cdac.acts.common;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FormatedDate {
	
	private static final String FORMAT = "dd/MM/yyy"; 
	private static final String EMPTY = " ";
	
	private FormatedDate()
	{
		
	}
	
	public static String getDate(Date date)
	{
		if(null == date)
		{
			return null;
		}
		
		SimpleDateFormat sdf  = new SimpleDateFormat(FORMAT);
		String str= sdf.format(date);
		return str;
	}
	
	public static Date getDateString (String str) throws ParseException
	{
		if(null == str && EMPTY.equals(str))
		{
			return null;
		}
		
		SimpleDateFormat sdf  = new SimpleDateFormat(FORMAT);
		Date date= sdf.parse(str);
		return date;
	}
	
}
