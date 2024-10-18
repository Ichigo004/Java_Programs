package com.cdac.act.sorting;

import java.util.Comparator;

import com.cdac.act.classes.Fruits;

public class PriceCompare  implements Comparator<Fruits> {

	@Override
	public int compare(Fruits o1, Fruits o2) {
		return  o1.getPrice().compareTo(o2.getPrice());
	}

}
