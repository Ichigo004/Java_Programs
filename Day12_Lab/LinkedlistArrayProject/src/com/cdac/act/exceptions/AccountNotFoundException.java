package com.cdac.act.exceptions;

@SuppressWarnings("serial")
public class AccountNotFoundException extends Exception {

		public AccountNotFoundException(String msg)
		{
			super (msg);
		}
}
