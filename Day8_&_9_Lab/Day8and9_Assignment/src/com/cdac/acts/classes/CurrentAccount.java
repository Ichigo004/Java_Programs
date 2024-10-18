package com.cdac.acts.classes;

import java.util.Date;
import com.cdac.acts.interfaces.Depositable;
import com.cdac.acts.interfaces.Withdraw;

public class CurrentAccount extends Account implements Depositable , Withdraw {
	
	public CurrentAccount(String accName, Date dateOfOpening, double balance)
	{
		super(accName , dateOfOpening , balance);
	}

	@Override
	public double withdraw(double amount) {
		double withdrawal = getBalance() - amount; 
		return withdrawal;
	}

	@Override
	public double deposit(double amount) {
		double deposit = getBalance() + amount; 
		return deposit;
	}
	

}
