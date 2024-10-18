package com.cdac.act.classes;

import java.time.LocalDate;
public class Account implements Comparable<Account> {
	
	private String accName;
	private Integer accNum;
	private LocalDate doo; 
	private Double balance;
	
	private static Integer genAccNum = 1000;
	
	
	public Account() {
		super();
	}

	public Account(String accName, LocalDate doo, Double balance) {
		super();
		this.accName = accName;
		this.accNum = genAccNum++;
		this.doo = doo;
		this.balance = balance;
	}

	public String getAccName() {
		return accName;
	}


	public Integer getAccNum() {
		return accNum;
	}


	public LocalDate getDoo() {
		return doo;
	}



	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public static Integer getGenAccNum() {
		return genAccNum;
	}

	@Override
	public String toString() {
		return "Account [accName=" + accName + ", accNum=" + accNum + ", doo=" + doo + ", balance=" + balance + "]";
	}

	@Override
	public int compareTo(Account o) {
		// TODO Auto-generated method stub
		return this.getAccNum().compareTo(o.getAccNum());
	}
		

	
	
	
	
}
