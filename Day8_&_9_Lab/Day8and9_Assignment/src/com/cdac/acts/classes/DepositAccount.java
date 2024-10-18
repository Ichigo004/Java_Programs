package com.cdac.acts.classes;

import java.util.Date;

import com.cdac.acts.interfaces.Depositable;
import com.cdac.acts.interfaces.Matureable;

public class DepositAccount extends Account implements Depositable , Matureable {
		
	public DepositAccount(String accName, Date dateOfOpening, double balance)
	{
		super(accName , dateOfOpening , balance);
	}

	
	@Override
	public double calculateMatutyAmount(double amount) {
			
		double calci = (amount * 60 )/100;
		return calci;
	}

	@Override
	public double deposit(double amount) {
		double depo = getBalance() + amount;
		return depo;
	}
	
	

}
