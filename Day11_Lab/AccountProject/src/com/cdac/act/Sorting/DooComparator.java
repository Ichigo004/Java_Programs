package com.cdac.act.Sorting;

import java.util.Comparator;

import com.cdac.act.Account.Account;

public class DooComparator implements Comparator<Account>{
	
	public int compare(Account a1 , Account a2)
	{
		return a1.getDateOfOpening().compareTo(a2.getDateOfOpening());
	}

}
