package com.cdac.acts.classes;
import java.util.Date;
import com.cdac.acts.interfaces.Depositable;
import com.cdac.acts.interfaces.Withdraw;

public class SavingAccount extends Account implements Depositable , Withdraw  {
	
	public SavingAccount(String accName, Date dateOfOpening, double balance)
	{
		super(accName , dateOfOpening , balance);
	}

	
	
	@Override
	public double deposit(double amount) {
		
		double deposit = getBalance() + amount;
		return deposit;
		
	}

	@Override
	public double withdraw(double amount) {
		
		double withdraw = getBalance() - amount;
		return withdraw;
		
	}
	
	
}
