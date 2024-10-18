package com.cdac.enums;

public enum Genre {
	
	AUTO("Autobiography"),
	SCI("Science Fiction"),
	ACT("Action"),
	ROMCOM("Romance-Comedy"),
	COM("Comedy");
		
	private final String value;
	
	private Genre(String val)
	{
		this.value = val;
	}
	
	public String getValue()
	{
		return value;
	}
	
}
