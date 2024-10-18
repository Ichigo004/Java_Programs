package com.cdac.act.sorting;

import java.util.Comparator;

import com.cdac.act.classes.Fruits;

public class CompareQuantity implements Comparator<Fruits>{

	@Override
	public int compare(Fruits o1, Fruits o2) {
		return o1.getQuantity().compareTo(o2.getQuantity());
	}

}
