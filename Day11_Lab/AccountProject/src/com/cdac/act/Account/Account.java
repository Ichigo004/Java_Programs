package com.cdac.act.Account;

import java.time.LocalDate;

public class Account implements Comparable<Account> {
	
	private Integer accNo;
	private String accName;
	private LocalDate dateOfOpening;
	private Double balance;
	
	private static Integer genaccNo = 1000;
	
	
	
	public Account() {
		this.accNo = genaccNo++;
		this.accName = null;
		this.dateOfOpening = null;
		this.balance = 0.0;
	}
	
	
	public Account( String accName, LocalDate dateOfOpening, Double balance) {
		this.accNo = genaccNo++;
		this.accName = accName;
		this.dateOfOpening = dateOfOpening;
		this.balance = balance;
	}

	public Integer getAccNo() {
		return accNo;
	}

	public String getAccName() {
		return accName;
	}


	public LocalDate getDateOfOpening() {
		return dateOfOpening;
	}


	public Double getBalance() {
		return balance;
	}

	

	public static Integer getGenaccNo() {
		return genaccNo;
	}

	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", accName=" + accName + ", dateOfOpening=" + dateOfOpening + ", balance="
				+ balance + "]";
	}

	
	@Override
	public int compareTo(Account o) {
	
		return  o.accNo.compareTo(this.accNo);
	}
	
	
	


	
	
	
	
	
	
}
