package com.cdac.exceptions;

@SuppressWarnings("serial")
public class DuplicateBookException extends Exception {
		
	public DuplicateBookException (String msg)
	{
		super(msg);
	}
}
