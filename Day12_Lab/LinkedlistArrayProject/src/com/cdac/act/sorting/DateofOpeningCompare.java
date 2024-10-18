package com.cdac.act.sorting;

import java.util.Comparator;

import com.cdac.act.classes.Account;

public class DateofOpeningCompare implements Comparator<Account> {

	@Override
	public int compare(Account o1, Account o2) {

		return o1.getDoo().compareTo(o2.getDoo()) ;
	}

}
