package com.cdac.acts.classes;

import java.util.Date;

public class Account {
	private int accNumber;
	private String accName;
	private Date dateOfOpening;
	private double balance;
	
	private static int genAcc = 1000;
	
	
	
	public Account( String accName, Date dateOfOpening, double balance) {
		this.accNumber = genAcc;
		this.accName = accName;
		this.dateOfOpening = dateOfOpening;
		this.balance = balance;
	}



	public int getAccNumber() {
		return accNumber;
	}



	public String getAccName() {
		return accName;
	}



	public Date getDateOfOpening() {
		return dateOfOpening;
	}



	public double getBalance() {
		return balance;
	}

	

	

}
