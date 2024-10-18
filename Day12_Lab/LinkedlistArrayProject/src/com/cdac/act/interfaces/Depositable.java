package com.cdac.act.interfaces;

import com.cdac.act.classes.Account;

public interface Depositable {
	
	Double deposit( Double amount , Account account );
}
