package com.cdac.act.validations;

import java.time.LocalDate;

import com.cdac.act.enums.PrinterType;
import com.cdac.act.exceptions.LocalDateValidations;

public class ValidationUtils {

	public static PrinterType validatePrinterType(String printtype)
	{
		PrinterType printerType = null;

		try
		{
			printerType = PrinterType.valueOf(printtype);
		}
		catch(IllegalArgumentException e)
		{
			System.out.println("Invalid Argument..");
		}

		return printerType;
	}

	public static LocalDate validateDate(String strDate)
	{
		LocalDate date = LocalDate.parse(strDate);

		LocalDate today = LocalDate.now();

		try
		{
			if(date.isAfter(today))
			{
				throw new LocalDateValidations("Manufacture Date cannot be future");
			}
		}
		catch(LocalDateValidations l)
		{
			System.err.println(l.getMessage());
		}

		return date;


	}
}
