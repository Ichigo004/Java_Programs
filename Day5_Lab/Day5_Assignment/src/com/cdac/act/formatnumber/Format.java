package com.cdac.act.formatnumber;
public class Format {
	
	public  static String format (String mobNo)
	{
		
		if(mobNo.length() < 10)
		{
			return(" Error : Enter number is less than 10 digit");
		}
		
		if(mobNo.startsWith("+91") && mobNo.length() < 14)
		{
			return(mobNo.substring(0 , 3) + "-" +mobNo.substring(3 , 6)+ "-" + mobNo.substring(6 , 9) + "-" + mobNo.substring(9 , 13));
		}

		if(mobNo.length() < 11)
		{
			return("+91-" + mobNo.substring(0 , 3) + "-" +mobNo.substring(3 , 6) + "-" + mobNo.substring(6 , 10));
		}
		
		return mobNo;
		
	}
	
}
