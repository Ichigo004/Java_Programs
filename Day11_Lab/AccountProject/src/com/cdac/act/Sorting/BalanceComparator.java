package com.cdac.act.Sorting;

import java.util.Comparator;

import com.cdac.act.Account.Account;

public class BalanceComparator implements Comparator<Account> {
	

	@Override
	public int compare(Account o1, Account o2) {
	
		return o2.getBalance().compareTo(o1.getBalance());
	}}
