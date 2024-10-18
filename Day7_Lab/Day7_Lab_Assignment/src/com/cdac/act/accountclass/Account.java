package com.cdac.act.accountclass;

import java.util.Date;

public abstract class Account {
	private int accountnumber;
	private  String accountName;
	private Date dateOfOpening;
	private double amount;
	
	private static int generateAccountNumber = 1000;

	public Account(int accountnumber, String accountName, Date dateOfOpening, double amount) {
		super();
		this.accountnumber = generateAccountNumber++;
		this.accountName = accountName;
		this.dateOfOpening = dateOfOpening;
		this.amount = amount;
	}

	public int getAccountnumber() {
		return accountnumber;
	}

	public String getAccountName() {
		return accountName;
	}

	public Date getDateOfOpening() {
		return dateOfOpening;
	}

	public double getAmount() {
		return amount;
	}

	public static int getGenerateAccountNumber() {
		return generateAccountNumber;
	}

	
	public abstract double applyInterest();
	
	@Override
	public String toString() {
		return "Account [accountnumber=" + accountnumber + ", accountName=" + accountName + ", dateOfOpening="
				+ dateOfOpening + ", amount=" + amount + "]";
	}
	
	
	
}
