package com.cadc.acts.array;

public class ArrayOverload {
	
	public static void printarray(int [] arr)
	{
		System.out.println("Integer Array Elements");
		for(int i = 0; i < arr.length; i++)
		{
			System.out.println(arr[i]);
		}
	}
	
	public static void printarray(String [] arr)
	{
		System.out.println("String Array Elements");
		
		for(int i = 0; i < arr.length; i++)
		{
			System.out.println(arr[i]);
		}
	}

}
