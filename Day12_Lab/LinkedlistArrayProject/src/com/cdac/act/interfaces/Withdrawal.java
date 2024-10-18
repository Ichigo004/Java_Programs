package com.cdac.act.interfaces;

import com.cdac.act.classes.Account;
import com.cdac.act.exceptions.MinBalanceException;

public interface Withdrawal {
	
	Double withdraw(Double amount , Account account) throws MinBalanceException;
}
