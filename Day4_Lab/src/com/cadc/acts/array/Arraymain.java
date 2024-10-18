package com.cadc.acts.array;

public class Arraymain {
	
	public static void main(String [] args)
	{
		int arr[] = {2, 4, 6, 8, 10};
		
		ArrayOverload ao = new ArrayOverload();
		
		ao.printarray(arr);
		
		String sarr[] = {"one", "two", "three", "four", "five"};
		
		ao.printarray(sarr);
	}
}
