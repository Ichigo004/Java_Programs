package com.cdac.act.Sorting;

import java.util.Comparator;

import com.cdac.act.Account.Account;

public class AccNameComparator implements Comparator<Account> {
	
	@Override
	public int compare(Account a1 , Account a2)
	{
		return a1.getAccName().compareTo(a2.getAccName());
	}

}
