package com.cdac.exceptions;

@SuppressWarnings("serial") //ask to sir
public class BookNotfoundException extends Exception {
	
	public BookNotfoundException(String msg)
	{
		super(msg);
	}
}
