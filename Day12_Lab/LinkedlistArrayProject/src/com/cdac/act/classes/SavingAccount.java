package com.cdac.act.classes;

import java.time.LocalDate;

import com.cdac.act.exceptions.MinBalanceException;
import com.cdac.act.interfaces.Depositable;
import com.cdac.act.interfaces.Withdrawal;

public class SavingAccount extends Account implements Withdrawal , Depositable {

	
	public SavingAccount()
	{
		super();
	}
	
	
	
	public SavingAccount(String accName, LocalDate doo, Double balance)
	{
		super(accName , doo , balance);
	}


	@Override
	public Double withdraw(Double amount , Account account) throws MinBalanceException {

		
			if(account.getBalance() < amount)
			{
				throw new MinBalanceException("insufficient Balance");
			}
	
			Double bal = account.getBalance() - amount;
			setBalance(bal);
			return bal;

	}

	public Double deposit(Double amount , Account account ) {
		// TODO Auto-generated method stub
		Double bal = account.getBalance() + amount;
		setBalance(bal);
		return bal;
	}
	
	public Double applyinterest(Integer year , Account account)
	{
		Double interest = (account.getBalance() * year * 7)/100;
		return interest;
	}
}
