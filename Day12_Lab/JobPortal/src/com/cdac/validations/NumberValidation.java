package com.cdac.validations;


import com.cdac.exceptions.AadharNumberException;
import com.cdac.exceptions.EmailException;

import com.cdac.exceptions.MobileNumberException;


public class NumberValidation {

	public static String getphoneNumber(String num)
	{
		try
		{
			if(num != null && num.matches("\\d{10}"))
			{
				return "Valid Mobile Number " + num;
			}
			else
			{
				throw new MobileNumberException("Mobile number should be 10 digits and numbers only ");
			}
		}
		catch(MobileNumberException a)
		{
			a.printStackTrace();
			System.out.println(a.getLocalizedMessage());
		}
		return num;
	}

	public static String getaadharNumber(String num)
	{
		try
		{
			if(num != null && num.matches("\\d{12}"))
			{
				return "Valid aadhar Number " + num;
			}
			else
			{
				throw new AadharNumberException("Aadhar number should be 12 digits only ");
			}
		}
		catch(AadharNumberException a)
		{
			a.printStackTrace();
			System.out.println(a.getLocalizedMessage());
		}
		return num;
	}

	public static String getemailvalidate(String email)
	{
		String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";


		try
		{

			if(email != null && email.matches(emailRegex))
			{
				return "Valid Email " + email;
			}
			else
			{
				throw new EmailException("email is not valid");
			}

		}catch(EmailException em)
		{
			em.printStackTrace();
			System.out.println(em.getLocalizedMessage());
		}
		return null;
	}


}
