package com.cdac.enums;

public enum Degree {
	
	BE("Bachelor of Engineering"),
	BA("Bachelor of Arts"),
	BBA("Bachelor of Business Administration"),
	BOptom("Bachelor of Clinical Optometry"),
	BSC("Bachelor of Computer Science");
	
	private final String value;
	
	private Degree (String val)
	{
		this.value = val;
	}
	
	public String getvalue()
	{
		return value;
	}
}
