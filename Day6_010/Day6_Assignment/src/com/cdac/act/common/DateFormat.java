package com.cdac.act.common;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormat {
	
		private static final String FORMAT = "dd/MM/yyyy";
		private static final String EMPTY = "";

		private DateFormat()
		{
			
		}
		
		public static String getFormatDate(Date date)
		{
			if(date == null)
			{
				return null;
			}
			
			SimpleDateFormat sdf = new SimpleDateFormat(FORMAT);
			return sdf.format(date);
		}
		
		public static Date getData(String strDate) throws ParseException {
		    if (strDate == null || strDate.isEmpty()) {
		        return null;
		    }
		    
		    SimpleDateFormat sdf = new SimpleDateFormat("FORMAT"); 
		    
		    return sdf.parse(strDate);
		}
}